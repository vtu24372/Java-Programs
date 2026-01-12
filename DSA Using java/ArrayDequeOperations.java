import java.util.*;
public class ArrayDequeOperations {
    public static void main(String[] args){
        ArrayDeque<Integer> a = new ArrayDeque<>();

        //to add elements in the front of ListDeque use : add, addFirst, offerFirst
        //to add elements in the front of ListDeque use : add, addLast, offerFirst  
        a.add(30);
        a.addFirst(20);
        a.offerFirst(10);
        a.addLast(40);
        a.offerLast(50);

        // to check the elements using for loop
        for(int i:a){
            System.out.println(i);
        }

        // use to see the element is present in the list using getFirst, getLast, peekFirst, peekLast
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
        
        //to remove the element use the below
        a.removeFirst();
        a.removeLast();
        a.pollFirst();
        a.pollLast();

        // after the removal use for loops to checks the output
        for(int b: a){
            System.out.println(b);
        }


    }
    
    
}
