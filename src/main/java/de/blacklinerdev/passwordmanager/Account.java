
package de.blacklinerdev.passwordmanager;

public class Account {
    
    private String website;
    private String password;
    private String benutzer;

    public Account(String website, String password, String benutzer) {
        this.website = website;
        this.password = password;
        this.benutzer = benutzer;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(String benutzer) {
        this.benutzer = benutzer;
    }
    
    
}
