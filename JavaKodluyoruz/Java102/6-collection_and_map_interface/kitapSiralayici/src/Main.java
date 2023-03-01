import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> booksOrderByName = new TreeSet<>(new OrderNameComparator());
        booksOrderByName.add(new Book("Gece Yarısı Kütüphanesi", 296, "Matt Maig", 2021));
        booksOrderByName.add(new Book("Kaplanın Sırtında", 324, "Zülfü Livaneli", 2022));
        booksOrderByName.add(new Book("Bir Aşk Masalı", 256, "Ahmet Ümit", 2022));
        booksOrderByName.add(new Book("Yarınsız Yarın", 250, "Nazan Öncel", 2020));
        booksOrderByName.add(new Book("Kader Gayrete Aşıktır", 160, "Ethem Emin Nemutlu", 2023));

        System.out.println("*** İsme göre sıralama ***");
        for (Book book : booksOrderByName) {
            System.out.println(book.getName());
        }
        TreeSet<Book> booksOrderByPage = new TreeSet<>(new OrderPageNumberComparator());
        for (Book book : booksOrderByName) {
            booksOrderByPage.add(book);
        }
        System.out.println("--------------------------");
        System.out.println("*** Sayfa sayısına göre sıralama ***");
        for (Book book : booksOrderByPage) {
            System.out.println(book.getName());
        }

    }
}
