public class Book{

    String title;
    String author;
    double price;

    public void displayDetails(){
        System.out.println("Title : "+ this.title);
        System.out.println("Author : "+ this.author);
        System.out.println("Price : "+ this.price);
    }

    public void sellBook(){
        System.out.println(this.title+ "Book Sold ");
    }
}