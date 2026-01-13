import java.util.Scanner;
public class LoopingStatements {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for A : ");
        int A = s.nextInt();
        System.out.println("Enter the string for X : ");
        String X = s.next();

        //First we use while loop to perform arithmentic operations
        int i=1;
        while(i<=5){
            System.out.println("Addition : " +i+"+"+A+"="+(A+i));
            System.out.println("Subtraction : " +i+"-"+A+"="+(A-i));
            System.out.println("Multiplication : " +i+"*"+A+"="+(A*i));
            System.out.println("Division : " +i+"+"+A+"/"+(A/i));
            i++;
        }

        //We use do while loop to perform the itrative over the strings
        int j=0;
        do{
            System.out.println(j+"="+X);
            j++;
        }while(j<=10);
        

    }
    
}
