import java.util.Scanner;
/**
 * While loop example
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create new scanner for user input 
    Scanner input = new Scanner(System.in);
    
    //declare the variable
    int upTo;
    do{
    System.out.println("What number to count up to? (positive number)");
    upTo= input.nextInt();
    }while(upTo <= 0);
    // create a variable to keep track of the number
    int count = 1;
    //using a loop to count up to 5
    while(count <= upTo){
      //print the number we are at 
      System.out.println(count);
      //increase the value of count by 1
      count = count + 1;
    }
    System.out.println("All done");
  

  //do while loop
  int count2 = 1;
  //do while loop to count
  do{
    //print the number
    System.out.println(count2);
    //increment the counter
    count2 = count2 + 1;

  }while(count2 <= upTo);
  System.out.println("All done again");
  }


}
