
package model;

import java.util.Date;

/**
 *
 * @author Manuel
 */
public class Usuario extends ModelEntity{
   
    private String userName;
    private String password;
    private Date bornDate;

   
   
    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the bornDate
     */
    public Date getBornDate() {
        return bornDate;
    }

    /**
     * @param bornDate the bornDate to set
     */
    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }
    
    public String toString(){
        return "User name: " + userName;
    }
    
    
    
}
