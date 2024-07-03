import java.util.*;
public class student{
    
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        System.out.println("Welcome to report generator ");
        System.out.print("Number of subjects : ");
        int n=s.nextInt();
        float p=0;
        for(int i=1;i<=n;i++){
            System.out.println("Subject " + i + ":");
            float y=s.nextFloat();
            p+=y;
        }
        float u=p/n;
        char g;
        if(u>=90){
            g='A';
        }else if(u>=70){
            g='B';
        }else if(u>=50){
            g='C';
        }else if(u>=40){
            g='D';
        }else{
            g='F';
        }
        System.out.println("TOTAL SCORE:" + p);
        System.out.println("AVERAGE SCORE:" + u);
        System.out.print("GRADE :" + g);
    }
}
