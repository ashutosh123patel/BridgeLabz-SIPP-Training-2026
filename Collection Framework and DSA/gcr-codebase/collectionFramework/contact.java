public class contact {

    String name;
    String phone;
    String email;

    contact(String name, String phone, String email) {

        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {

        return name + " " + phone + " " + email;
    }
}