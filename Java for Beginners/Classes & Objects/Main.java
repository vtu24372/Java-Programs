abstract class Abstraction{ // Create a class using abstract keyword followed by class name
    public abstract void AnimalSound(); // create a method using abstract keyword. Because it eanables modification in another class it is open for change
    
    //Create another methods with functions
    public void AnimalSleep(){
        System.out.println("zzz");
    }
} 
    //Create another class named as cat
    class Cat extends Abstraction{
        public void AnimalSound(){ //The class cat add the function which is created in the beginning 
            System.out.println("Cat says meow meow");
        }
    }
    class Main{
        public static void main(String[] args){
            Cat c = new Cat();
            c.AnimalSleep();
            c.AnimalSound();
        }
    }

