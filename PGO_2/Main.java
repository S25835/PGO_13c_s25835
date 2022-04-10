package PGO_2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person damian = new Person(
                "Damian", "Monski",
                LocalDate.of(2000, 12, 31),
                new Address("Poland", "Warsaw", "street", 1, 1));
        Book newTitle = damian.publishBook("Nowy Tytuł", Genre.Adventure, Lang.Polish, LocalDate.of(2022, 1, 1));
        Person kasia = new Person(
                "Kasia", "K",
                LocalDate.of(1990, 1, 1),
                new Address("Poland", "Warsaw", "street", 2, 2));
        System.out.println(kasia);
        newTitle.borrowBook(kasia);

        //System.out.println(damian);
        System.out.println(kasia);

        System.out.println(newTitle);
        newTitle.placeBack();
        System.out.println(kasia);
        System.out.println(newTitle);
    }
}
