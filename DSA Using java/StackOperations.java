import java.util.*;
public class StackOperations {
    public static void main(String[] args){
        Stack <String> s = new Stack<>();

        // to add the elements in the stack use the keyword push
        s.push("vicky");
        s.push("Faf");
        s.push("virat");
        s.push("rohit");
        s.push("tom");

        // to see all the elements in the stack using for loop
        for(String i:s){
            System.out.println(i);
        }

        // to remove or delete the element from the stack use pop
        String popedElement = s.pop();
        System.out.println("poped Element : "+ popedElement);
        System.out.println("After the pop opperations :"+s);

        // to see the top of the stack element use peek
        String peekElement = s.peek();
        System.out.println("peek Element : "+ peekElement);
        System.out.println("After the peek opperations :"+s);


        // to check wether the element is present using the value by acessing the index value
        int searchElement = s.search("vicky");
        if(searchElement!=0){
            System.out.println("the value is present");
        } else{
            System.out.println("the value is not available");
        }

        // to check the availabily and size of the stack using empty() & size()
        System.out.println(s.isEmpty());
        System.out.println(s.size());


        

        

    }
}
