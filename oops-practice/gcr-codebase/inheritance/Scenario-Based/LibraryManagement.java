class Book {

    String title;
    int year;

    Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
}
class Author extends Book {
    String name;
    String bio;

    Author(String title, int year,String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Title = " + title);
        System.out.println("Year = " + year);
        System.out.println("Author = " + name);
        System.out.println("Bio = " + bio);
    }
}
public class LibraryManagement {

    public static void main(String[] args) {
        Author a = new Author("Java Basics",2025,"Ashutosh","Java Developer");

        a.displayInfo();
    }
}