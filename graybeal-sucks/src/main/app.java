package main;
import java.util.Scanner;

public class app {

  public static void main (String args[]) {

    Scanner firstName = new Scanner(System.in);
    Scanner lastName = new Scanner(System.in);

    System.out.print("Enter your first name: ");

    String firstName1 = firstName.nextLine();

    System.out.print("Enter your last name: ");

    String lastName1 = lastName.nextLine();

    System.out.println();

    if((firstName1 + lastName1).toLowerCase().equals("MichaelGraybeal".toLowerCase())){
      System.out.println("You suck");
    }
    else {
      System.out.println("Good thing you're not Michael Graybeal. He sucks");
    }

  }

}
