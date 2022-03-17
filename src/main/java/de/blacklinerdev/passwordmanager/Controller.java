package de.blacklinerdev.passwordmanager;

import de.blacklinerdev.passwordmanager.gui.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Controller implements ActionListener, Observer {

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
        
        this.model.addObserver(this);
    }

    private Model load() throws IOException, ClassNotFoundException {
        FileInputStream is = new FileInputStream("./model.file");
        ObjectInputStream ois = new ObjectInputStream(is);
        return (Model) ois.readObject();
    }

    private boolean save(Model model){                                                                  //todo
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

    @Override
    public void update(Observable o, Object arg) {
        this.view.setList((List<Account>)arg);
    }
}
