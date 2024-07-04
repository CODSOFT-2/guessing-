import java.util.*;
public class yoga2{
    public static  void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("WELCOME TO REPORT GENERATOR");
        System.out.println("NO OF SUBJECTS");
        int a=s.nextInt();
        int u=0;
        float f=0;
        char y;
        int n[]=new int [a];
        for(int i=0;i<a;i++){
        
            System.out.println("SUBJECTS : ");
            n[i]=s.nextInt();
            u+=n[i];
            f=u/a;
        }
        System.out.println("TOTAL SCORE : " + u);
        System.out.println("AVERAGE :" + f);
       if(f>=90){
            System.out.println("GRADE : A ");
        }
        else if(f>=80){
            System.out.println("GRADE : B ");
        }
        else if(f>=70){
            System.out.println("GRADE : C ");
        }
        else if(f>=60){
            System.out.println("GRADE : D");
        }
        else{
            System.out.println("GRADE : F");
        }

        }
    }

