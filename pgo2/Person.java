package PGO_02;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Adress adress;
    private List<Book> books;
    private Book borrowedBook;

    public static void main(String[] args) {
        Person damian = new Person(
                "Damian", "Monski",
                LocalDate.of(2000, 12, 31),
                new Adress("Poland", "Warsaw", "street", 1, 1));
        Book newTitle = damian.publishBook("Nowy Tytuł", Genre.Adventure, Lang.Polish, LocalDate.of(2022, 1, 1));
        Person kasia = new Person(
                "Kasia", "K",
                LocalDate.of(1990, 1, 1),
                new Adress("Poland", "Warsaw", "street", 2, 2));
        newTitle.borrowBook(kasia);

        System.out.println(damian);
        System.out.println(kasia);

        newTitle.placeBack();
        System.out.println(kasia);
        System.out.println(newTitle);
    }

    public Person(String name, String surname, LocalDate dateOfBirth, Adress adress) {
        // TODO make sure nothing from parameters is null
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        books = new ArrayList<>();
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public Book publishBook(String name, Genre genre, Lang language, LocalDate publishDate) {
        // TODO make sure nothing from parameters is null
        Book newBook = new Book(name, genre, language, publishDate, this);
        books.add(newBook);
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
                ", adress=" + adress +
                ", books=" + books +
                ", age=" + getAge() +
                ", borrowed book=" + (borrowedBook != null ? borrowedBook.getName() : null) +
                '}';
    }
}
