package de.blacklinerdev.passwordmanager;

import de.blacklinerdev.passwordmanager.gui.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Controller implements ActionListener{

    private Model model;
    private View view;

    public Controller() {
        try {
            this.model = load();
        } catch (IOException | ClassNotFoundException ex) {
//              System.exit(5);                                                                      //todo
                System.out.println("Hallo ich bin ein fehler aus dem Controller constructor :)");
                System.exit(0);
        }
        this.view = new View();
    }

    private Model load() throws IOException, ClassNotFoundException {
        FileInputStream is = new FileInputStream("./model.file");
        ObjectInputStream ois = new ObjectInputStream(is);
        return (Model) ois.readObject();
    }

    private boolean save(Model model){
        try {
            FileOutputStream fos = new FileOutputStream("./model.file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(model);
            oos.flush();
        } catch(IOException ioe){
            return false;
        }
        return true;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    public static void main(String[] args){
        Controller controller = new Controller();
        
    }
    
}
