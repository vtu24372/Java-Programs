import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string It will iterate for 18 times : ");
        String X = s.next();
        System.out.println("Enter the number to perform the table operation upto multiples of 10 : ");
        int Y = s.nextInt();
        
        // we use for loops to repeat the string upto some desired condition
        for(int i=0; i<=18; i++){
            System.out.println(i+":"+X);
        }

        // we also use for loops to perform arithmetic operations
        for(int j=0; j<=10; j++){
            System.out.println(Y+"*"+j+"="+(Y*j));
        }

    }
    
}
