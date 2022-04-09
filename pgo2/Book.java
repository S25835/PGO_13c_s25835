package PGO_02;

import java.time.LocalDate;
import java.time.Period;

enum Genre {
    Adventure,
    Classic,
    Comics,
    Detective,
    Fantasy,
    Fiction
}

enum Lang {
    English,
    Polish,
    Japanese,
    Ukrainian
}

public class Book {
    private long ID;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount;
    private Person author;
    private Person borrower;

    private static long IDCount = 0;

    public Book(String name, Genre genre, Lang language, LocalDate publishDate, Person author) {
        // TODO make sure nothing from parameters is null
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.publishDate = publishDate;
        this.author = author;
        borrowCount = 0;

        ID = IDCount + 1;
        IDCount = ID;
    }

    public void borrowBook(Person borrower) {
        // TODO make sure borrower is not null
        if (borrower.getBorrowedBook() != null) {
            System.out.println("Can't borrow 2 books at the same time");
            return;
        }
        this.borrower = borrower;
        borrowCount++;
        borrower.setBorrowedBook(this);
    }

    public void placeBack() {
        if (borrower.getBorrowedBook() != null)
            borrower.setBorrowedBook(null);
        this.borrower = null;
    }

    public String getName() {
        return name;
    }

    public Person getBorrower() {
        return borrower;
    }

    public int getAge() {
        return Period.between(publishDate, LocalDate.now()).getYears();
    }

    public boolean isAvailable() {
        return borrower == null;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", language=" + language +
                ", publishDate=" + publishDate +
                ", borrowCount=" + borrowCount +
                ", author=" + author.getName() +
                ", borrower=" + borrower +
                ", age=" + getAge() +
                ", isAvailable=" + isAvailable() +
                '}';
    }
}
