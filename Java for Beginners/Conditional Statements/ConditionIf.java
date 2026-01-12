import java.util.Scanner;
public class ConditionIf {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for X :");
        int X = s.nextInt();
        System.out.println("Enter the value for Y :");
        int Y = s.nextInt();
        if(X%2==0){
            System.out.println("The input is even");
        } else if(X%2!=0){
            System.out.println("The input is odd");
        } else if(X<Y){
            System.out.println("X is lesser than Y");
        } else if(X>Y){
            System.out.println("X is greater than Y");
             } else{
             System.out.println("The input is invalid");
        }
        
        if(Y<X){
            System.out.println("Y is lesser than X");
        } else if(Y>X){
            System.out.println("Y is greater than X");
        } else if(Y%2==0){
             System.out.println("The input is even");
        } else if(Y%2!=0){
            System.out.println("The input is odd");
        } else{
             System.out.println("The input is invalid");
        }


    }
    
}
