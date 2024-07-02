import java.util.*;
public class Yoganandha{
    public static void main(String[]args){
        Random k=new Random();
        int y=k.nextInt(200)+1;
        int h=0;
        Scanner s=new Scanner(System.in);
        int g;
        boolean w=false;
        System.out.println("WELCOME");
        System.out.println("I HAVE NUMBER RANGE BETWEEN 1 TO 200");
        System.out.println("GUESS THE NUMBER");
        while(!w){
            System.out.println("ENTER YOUR GUESSING NUMBER");
            g=s.nextInt();
            h++;
            if(g<1||g>200){
                System.out.println("PLEASE ENTER A NUMBER IN THE RANGE OF 1 TO 200");

            }
            else if (g<h){
                System.out.println("TOO LOW!");
            }
            else if(g>h){
                System.out.println("TOO HIGH!");
            }
            else{
                w=true;
                System.out.println("YOU'VE GUESSED IS CORRECT IN  " + h + "  TRIES");
            }
        }

        }
}
