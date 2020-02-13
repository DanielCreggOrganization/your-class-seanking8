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

    protected int increaseNumOfBooksBy(int incr){
        return numOfBooks += incr;
    }

    //default constructor for this class
    public BookShelf(){

    }

    //constructor with 3 input parameters (Paramaterised Constructor)
    public BookShelf(int age, String breed, int height){
        
    }
}