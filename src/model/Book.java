package model;

public class Book{
    private int id;
    private String title;
    private boolean issued;    

public Book(int id ,String title){
    this.id = id;
    this.title = title;
    this.issued = false;
}
public int getId() {
    return id;
}
public String getTitle() {
    return title;
}
public boolean isIssued() {
    return issued;
}
public void issueBook() {
    this.issued = true;
}
public void returnBook() {
    this.issued = false;
}
public void display(){
    System.out.println("ID: " +  id +
    " Title: " + title+
     " Issued: " + issued
    );
}
}

