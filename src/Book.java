public class Book extends Object{
   private String title;
   private int pages;
   private int releaseYear;
    public Book(){
    }

   public Book(String title, int pages, int releaseYear){
       this.title = title;
       this.pages = pages;
       this.releaseYear = releaseYear;
   }

   public void setTitle(String title){
       this.title = title;
   }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setReleaseYear(int releaeYear){
        this.releaseYear = releaeYear;
    }
    public String getTitle (){
       return this.title;
    }
    public int getPages (){
        return this.pages;
    }
    public int getReleaeYear (){
        return this.releaseYear;
    }














}
