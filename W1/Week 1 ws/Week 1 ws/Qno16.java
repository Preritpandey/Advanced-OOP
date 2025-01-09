class Book{
    String title;
    String author;
    int year;
    Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;

    }
    @Override
    public String toString() {
        return String.format("Book Title: %s\nAuthor: %s\nYear: %d", title, author, year);
    }

}

public class Qno16 {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(book3);
        
    }
}
