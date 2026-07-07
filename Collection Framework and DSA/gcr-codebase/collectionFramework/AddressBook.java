import java.util.*;

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phones = new HashSet<>();

    static void addContact(Contact c) {

        if (phones.add(c.phone)) {

            contacts.add(c);
            map.put(c.name, c);

            System.out.println("Contact Added");

        } else {

            System.out.println("Duplicate Phone Number");
        }
    }

    static void search(String name) {

        if (map.containsKey(name)) {

            System.out.println(map.get(name));

        } else {

            System.out.println("Contact Not Found");
        }
    }

    static void delete(String name) {

        Contact c = map.remove(name);

        if (c != null) {

            contacts.remove(c);
            phones.remove(c.phone);

            System.out.println("Contact Deleted");
        }
    }

    static void display() {

        Collections.sort(contacts,
                (a, b) -> a.name.compareTo(b.name));

        for (Contact c : contacts) {

            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        addContact(new Contact("Ashutosh", "111", "a@gmail.com"));
        addContact(new Contact("Rahul", "222", "r@gmail.com"));
        addContact(new Contact("Aman", "333", "am@gmail.com"));

        search("Rahul");

        delete("Rahul");

        display();
    }
}