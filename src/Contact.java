public class Contact {
    String firstname;
    String lastname;
    String city;
    String state;
    String email;
    int phone;
    int zip;

    public Contact(String firstname,String lastname,String city,String state,String email,int phone,int zip){
        this.firstname=firstname;
        this.lastname=lastname;
        this.city=city;
        this.state=state;
        this.email=email;
        this.phone=phone;
        this.zip=zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", zip=" + zip +
                '}';
    }
}