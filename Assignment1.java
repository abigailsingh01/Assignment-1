//Abigail Singh
//Assignment #1 CISC.3115

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin = 12345;
    int tries = 0;
    int maxTries = 4;

  System.out.print("WELCOME TO THE BANK OF BC.");
  System.out.print("ENTER YOUR PIN: ");
  int entry = keyboard.nextInt();
  tries++;

  while ( entry != pin && tries < maxTries )
  {
   System.out.println("\nINCORRECT PIN. TRY AGAIN.");
   System.out.print("ENTER YOUR PIN: ");
   entry = keyboard.nextInt();
   tries++;
  }

  if ( entry == pin )
   System.out.println("\nTHE PIN IS ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT!");
  else if ( tries >= maxTries )
   System.out.println("\nYOU HAVE RUN OUT OF TRIES. YOUR ACCOUNT IS NOW LOCKED.");
  }
}

