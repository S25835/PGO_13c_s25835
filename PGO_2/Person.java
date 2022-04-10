package PGO_2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Address address;
    private Book borrowedBook;


    public Person(String name, String surname, LocalDate dateOfBirth, Address address) {
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
        setAdress(address);
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        if (borrowedBook == null) {
            throw new RuntimeException("You can only borrow 1 book");
        }
        this.borrowedBook = borrowedBook;
    }

    public void setBorrowedBookEmpty(){
        this.borrowedBook = null;
    }
    public Book publishBook(String name, Genre genre, Lang language, LocalDate publishDate) {
        Book newBook = new Book(name, genre, language, publishDate, this);
        return newBook;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", age=" + getAge() +
                ", borrowed book=" + (borrowedBook != null ? borrowedBook.getName() : null) +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAdress(Address address) {
        this.address = address;
    }
}

