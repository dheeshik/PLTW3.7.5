
/*
 * Activity 3.7.5
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library lib = new Library();
    ArrayList<Book> childrensBooks = lib.getChildrensBooks();

    String authorToFind = "L. Frank Baum";
    String bookToFind = "Sky Island";
    double minimumRating = 0.f;

    for(Book b : childrensBooks){
      if (b.getTitle().equals(bookToFind)){
        minimumRating = b.getRating();
      }
    }

    for(int i = 0; i < childrensBooks.size();i++){
      Book b = childrensBooks.get(i);
      if(b.getRating() >= minimumRating){
        System.out.print(b.getTitle() + " ");
        System.out.println(b.getAuthor());
      }
    }
  }
}