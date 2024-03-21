import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //Sukurti klasę Book.
        //Properties: title, pages, releaseYear
        //visi properties turi būti inkapsuliuoti.
        //sukurti 3 objektus su reikšmėmis naudojantis tuščiu konstruktoriu, ir tris naudojantis pilnu konstuktoriu.
        //sudėti juos į knygų masyvą.
        //prasukti ciklą per masyvą ir atspausdinti knygas (naudojam getterius)

        Book book1 = new Book();
        book1.setTitle("Mano knyga");
        book1.setPages(2);
        book1.setReleaseYear(2024);
        Book book2 = new Book();
        book2.setTitle("Tavo knyga");
        book2.setPages(28);
        book2.setReleaseYear(1605);
        Book book3 = new Book();
        book3.setTitle("Naglio knyga");
        book3.setPages(1984);
        book3.setReleaseYear(2012);
        Book book4 = new Book("Lord of The Rings: Fellowship of The Ring", 385, 1954);
        Book book5 = new Book("Lord of The Rings: Two Towers", 428, 1954);
        Book book6 = new Book("Lord of The Rings: Return of The King", 415, 1955);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        for (int i = 0; i < books.size(); i++) {
            System.out.print(books.get(i).getTitle() + " " + books.get(i).getPages() + " pages " + books.get(i).getReleaeYear() + " released");
            System.out.println();
        }
//Sukurti klasę Plant
//Visi laukai turi būti private, turėti getterius ir setterius.
//konstruktoriai - 2. tuščias ir su visais fieldais.

    }
}