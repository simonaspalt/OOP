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
        //Maine susikuriam masyvą saugoti augalams. sukuriame 4 augalus (2x2 pagal konstruktorius)
        //
        //prasukti ciklą
        //pvz foreach ir atspausdinti augalus (naudojant toString() )

        Plant plant1 = new Plant();
        plant1.setName("Cannabis");
        plant1.setLatinName("Cannabis Indica");
        plant1.setOneYear(false);
        plant1.setContinent("Asia");
        plant1.setFullHigh(3.6576);
        plant1.setEdible(true);

        Plant plant2 = new Plant();
        plant2.setName("Aloe");
        plant2.setLatinName("Aloe Vera");
        plant2.setOneYear(false);
        plant2.setContinent("Africa");
        plant2.setFullHigh(0.9);
        plant2.setEdible(true);

        Plant plant3= new Plant("Orchid", "Diuris carinata", false, "Australia", 0.8, false);
        Plant plant4 = new Plant("Clover", "Trifolium repens", true, "Europe and Asia", 0.18, true);
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);

        for (int i = 0; i < plants.size(); i++) {
           System.out.println(plants.get(i).toString());
        }





    }
}