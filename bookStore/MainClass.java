public class MainClass{
    public static void main(String[] args) {

      Book book = new Book();

      
      book.author = "Jesus";
      book.title = "Bible";
      book.price = 0;


      book.sellBook();
      book.displayDetails();
    }
}