
package classgrade;

import java.util.Scanner;
public class Account {
    Scanner s = new Scanner(System.in);
  
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    
    public Accounts(int id, String firstName, String lastName, String email, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    
    public boolean passwordVerify(String password) {
        
        return password.length() >= 6; 
    }

    public void viewAccount() {
        System.out.printf("%-10d %-10s %-10s %-20s %-13s %-10s\n", id, firstName, lastName, email, username, password);
   }
 }

