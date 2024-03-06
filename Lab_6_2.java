import java.util.*;
public class Lab_6_2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println();  
    }    
}
class Book{
    private String author_name;
    public Book(String author_name){
        this.author_name=author_name;
    }
    public void display(){
        System.out.println(""+author_name);
    }
}
class Book_Publication extends Book{

    private String title;

    
}
class Paper_Publication extends Book{
    
    private String title;
    
}