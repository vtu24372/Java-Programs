import java.util.*;
public class ArrayListOperations{
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>(); // initialize variable 1 as a1
        ArrayList<Integer> a2 = new ArrayList<>(); // initialize variable 1 as a2

        // to add a element in the stack usind (add) keyword
        a1.add(0,10); // you can add the element using the index value followed by the element
        
        // to remove element using (remove) keyword
        a1.remove(0); // to remove element use the index value alone
        
        // To print the numbers based on the condition use the below loops
        for(int i=0; i<10; i++){ // loop 1
            a1.add(i);
        }
        for(int a : a1){ // loop 2
            System.out.println(a);
        }

        // to check if the value is present in the stack using the keyword (contains())
        System.out.println(a1.contains(9));

        // to compare if one or more list has the same element using equals()
        System.out.println(a1.equals(a1));

        // to check the size of the list using the keyword size()
        System.out.println(a1.size());

        // to get the elements which present the list using the get(with index)
        System.out.println(a1.get(6));

        // to check the list is empty or not using the keyword isEmpty()
        System.out.println(a1.isEmpty());

        // to convert into string use toString()
        System.out.println(a1.toString());

        // to copy the elements from list 1 to another using addALL()
        a1.addAll(a2);
        for(int b:a2){
            System.out.println(b);
        }




    }
}