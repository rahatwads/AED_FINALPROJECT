
package CabBooking.model;


public class Customer {
    private String CustomerID;
    private String name;
    private String username;
    private String dob;
    private String address;
    private String emailaddress;

    public String getCustomerID() {
        return CustomerID;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    
    
    
}
