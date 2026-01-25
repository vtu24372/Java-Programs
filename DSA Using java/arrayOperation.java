public class arrayOperation{
    public static void main(String[] args){

        // Initializing a array with variable name as numbers
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};

        // To view the element from the array 
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // To perform some arithmetic operation with the output
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]*10);
        }

        // Another for loop method
        for(int i:numbers){
            System.out.println(i);
        }

        // how to change the element in the array with its index value
        numbers[0]=100;
        numbers[5]=600;
        System.out.println(numbers[0]);
        System.out.println(numbers[5]);

        // reversing the order of the array
        int[] num={15,30,45,60,75};
        for(int i=num.length-1; i>=0; i--){
            System.out.println(num[i]);
        }




    }
}
