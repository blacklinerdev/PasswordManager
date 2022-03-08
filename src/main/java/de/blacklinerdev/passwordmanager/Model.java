package de.blacklinerdev.passwordmanager;

import java.util.List;

public class Model {
    
    private List<Account> accounts;
    private final String masterHash;
    
    public Model(String hash){
        masterHash = hash;
    }
    
    
}
