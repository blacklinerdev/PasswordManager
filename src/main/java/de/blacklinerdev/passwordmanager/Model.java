package de.blacklinerdev.passwordmanager;

import java.util.List;
import java.util.Observable;

public class Model extends Observable {
    
    private List<Account> accounts;
    private final String masterHash;

    
    public Model(String hash){
        masterHash = hash;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getMasterHash() {
        return masterHash;
    }

    public boolean removeItem(Account account){
        boolean success = accounts.remove(account);
        setChanged();
        notifyObservers(this.accounts);
        return success;
    }

    public void addItem(Account account){
        accounts.add(account);
        setChanged();
        notifyObservers(this.accounts);

    }
    public boolean changeItem(Account account, Account newAccount){
        boolean success1 = this.removeItem(account);
        this.addItem(newAccount);
        setChanged();
        notifyObservers(this.accounts);
        return success1;
    }
}
