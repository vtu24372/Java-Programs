import java.util.*;
public class StackOperations {
    public static void main(String[] args){
        Stack <String> s = new Stack<>();

        // to add the elements in the stack use push
        s.push("vicky");
        s.push("Faf");
        s.push("virat");
        s.push("rohit");
        s.push("tom");
        for(String i:s){
            System.out.println(i);
        }
        String popedElement = s.pop();
        System.out.println("poped Element : "+ popedElement);
        System.out.println("After the pop opperations :"+s);

        String peekElement = s.peek();
        System.out.println("peek Element : "+ peekElement);
        System.out.println("After the peek opperations :"+s);

        int searchElement = s.search("vicky");
        if(searchElement!=0){
            System.out.println("the value is present");
        } else{
            System.out.println("the value is not available");
        }

        System.out.println(s.isEmpty());
        System.out.println(s.size());


        

        

    }
}
