
package classgrade;

public class Account {
    
    private static int lastId = 0;

   
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

 
    public Account(String firstName, String lastName, String email, String username, String password) {
        this.id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    
  
    public String toString() {
        return "ID: " + id + " | First Name: " + firstName + " | Last Name: " + lastName + 
               " | Email: " + email + " | Username: " + username;
    }
}
