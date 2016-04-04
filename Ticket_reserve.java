package ticket_reserve;

import java.io.*;
import java.util.*;

public class Ticket_reserve {

  private static int counter=10;
  List<String> BookingList=new ArrayList<String>();
  ArrayList<Integer> AgeList=new ArrayList<Integer>();

  public void reservation(){
    System.out.println("Enter the tickets needed:");
    Scanner tkts=new Scanner(System.in);
    int tickets=tkts.nextInt();
    if(tickets<=counter){
      
      System.out.println("Enter your age:");
      Scanner age=new Scanner(System.in);
      int Age=age.nextInt();
      
      if(Age<18){
        System.out.println("You're under 18, Booking cancelled");
      }else{
        for(int i=0;i<tickets;i++){
          System.out.println("Enter your Name:");
          Scanner nom=new Scanner(System.in);
          String name=nom.nextLine();
          BookingList.add(name);
          AgeList.add(Age);
          counter--;
          System.out.println("Names: "+BookingList+","+"Age:"+AgeList+"Booked successfully");
        }
      }
    }else{
      System.out.println(tickets+" Tickets  unavailable");
    }
    
  }


  public static void main(String[] args) {
    Ticket_reserve t1=new Ticket_reserve();
    t1.reservation();
  }
}