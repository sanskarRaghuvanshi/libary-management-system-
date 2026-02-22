package service;
import model.Book;
import java.util.ArrayList;

public class Libraryservice {

    private ArrayList<Book> books = new ArrayList<>();
   
    
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added");
    }

    public void viewBooks() {
    if (books.isEmpty()) {
        System.out.println("No books available.");
        return;
    }

    for (Book b : books) {
        b.display();
    }
}
    public void issueBook(int id){
        for (Book b : books){
            if(b.getId()== id){
                if(!b.isIssued()){
                    b.issueBook();
                    System.out.println("Book issued");
                }else{
                    System.out.println("Book is already issued");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

