/**
 * BookShelf
 */
public class BookShelf {

    //instance variables
    int numOfBooks;
    String material;
    byte numOfShelves;
    float height;
    float width;
    boolean wallMounted;

    void printHeight(){
        System.out.println("Height of bookshelf: "+height+"cm tall.");
    }

    int reduceNumOfBooks(){
        return numOfBooks -= 4;
    }

}