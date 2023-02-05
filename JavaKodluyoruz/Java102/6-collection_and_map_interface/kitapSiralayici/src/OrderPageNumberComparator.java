import java.util.Comparator;

public class OrderPageNumberComparator implements Comparator<Book> {
    
    @Override
    public int compare(Book p1, Book p2) {
        return p1.getPageNumber() - p2.getPageNumber();
    }
}
