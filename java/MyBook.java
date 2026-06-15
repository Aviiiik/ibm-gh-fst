package fst;
import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String title);
	String getTitle() {
		return title;
	}
}
public class MyBook extends Book {
    
	public void setTitle(String title){
		this.title=title;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter title");
         String title=sc.nextLine();
         Book obj= new MyBook();
         obj.setTitle(title);
         System.out.println("Title- "+obj.getTitle());
	}
	

}
