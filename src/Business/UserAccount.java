package Business;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String userName;
    private String userPassword;

    UserAccount(String userName, String userPassword) {
       this.userName = userName;
       this.userPassword = userPassword;
    }

    UserAccount() {
   }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
}