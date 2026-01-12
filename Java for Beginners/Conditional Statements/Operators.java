import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for A : ");
        int A = s.nextInt();
        System.out.println("Enter the value for B : ");
        int B = s.nextInt();
        System.out.println(
    "Choose the operation from the given:\n" +
    "1) Addition\n" +
    "2) Subtraction\n" +
    "3) Multiplication\n" +
    "4) Division\n" +
    "5) Modulas\n"
);
        int C = s.nextInt();
        switch(C){
            case 1:
                int Addition=A+B;
                System.out.println("Addition of two inputs : "+Addition);
                break;
                case 2:
                int Subtraction=A-B;
                System.out.println("Addition of two inputs : "+Subtraction);
                break;
                case 3:
                int Multiplication=A*B;
                System.out.println("Addition of two inputs : "+Multiplication);
                break;
                case 4:
                double Divion=A/B;
                System.out.println("Addition of two inputs : "+Divion);
                break;
                case 5:
                double Modulas=A%B;
                System.out.println("Addition of two inputs : "+Modulas);
                break;
                default : 
                System.out.println("Invalid operations");
        }



    }
    
}
