# 📚 Library Management System (Java)

## Description

A simple **console-based Library Management System** built using Java.
This project allows users to manage books by adding, viewing, issuing, and returning them.

---

##  Features

*  Add new books
* View all books
*  Issue a book
*  Return a book
*  Exit system

---

##  Technologies Used

* Java
* OOP (Object-Oriented Programming)
* ArrayList (Collection Framework)

---

##  Project Structure

```
project/
│
├── model/
│   └── Book.java
│
├── service/
│   └── Libraryservice.java
│
└── main/
    └── Main.java
```

### Book Class

* Stores book details (ID, title, issued status)
* Methods:

  * `issueBook()`
  * `returnBook()`
  * `display()`

###  Library Service

* Manages list of books using ArrayList
* Features:

  * Add book
  * View books
  * Issue book
  * Return book

### Main Class

* Menu-driven program using Scanner
* Allows user interaction 


##  Key Concepts Learned

* Classes & Objects
* Encapsulation
* ArrayList usage
