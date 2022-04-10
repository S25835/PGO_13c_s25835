package PGO_2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public class Book {
    private long ID;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount;
    private Person borrower;
    private List<Person> authors = new ArrayList<>();

    private static long IDCount = 0;

    public Book(String name, Genre genre, Lang language, LocalDate publishDate, List<Person> author) {
        this(name, genre, language, author);
        setPublishDate(publishDate);
    }

    public Book(String name, Genre genre, Lang language, LocalDate publishDate, Person author) {
        this(name, genre, language, author);
        setPublishDate(publishDate);
    }
    public Book(String name, Genre genre, Lang language, List<Person> author) {
        setName(name);
        setGenre(genre);
        setLanguage(language);
        setAuthor(author);
        borrowCount = 0;
        setID();
    }
    public Book(String name, Genre genre, Lang language, Person author) {
        setName(name);
        setGenre(genre);
        setLanguage(language);
        setAuthor(author);
        borrowCount = 0;
        setID();
    }

    public void borrowBook(Person borrower) {
        if (borrower.getBorrowedBook() != null) {
            System.out.println("Can't borrow 2 books at the same time");
            return;
        }
        borrower.setBorrowedBook(this);
        setBorrower(borrower);
        borrowCount++;
    }

    public void placeBack() {
        if (!isAvailable()){
            borrower.setBorrowedBookEmpty();
            setBorrowerEmpty();
        }
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
                ", author=" + authors +
                ", borrower=" + borrower +
                ", age=" + getAge() +
                ", isAvailable=" + isAvailable() +
                '}';
    }

    public void setID() {
        ID = IDCount + 1;
        IDCount = ID;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Book needs name");
        }
        this.name = name;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setLanguage(Lang language) {
        this.language = language;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public void setAuthor(Person author) {
        this.authors.add(author);
    }

    public void setAuthor(List<Person> author) {
        if(author.size() == 0){
            throw new RuntimeException("It must be at least 1 author");
        }
        for (Person ath : authors) {
            setAuthor(ath);
        }
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }


    public void setBorrowerEmpty() {
        this.borrower = null;
    }
}
