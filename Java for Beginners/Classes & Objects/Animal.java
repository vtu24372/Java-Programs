// Polymorphism Every class uses the same methods but with different functionality
class Animal{
    public void AnimalSound(){
        System.out.println("Every animal has unique Sound");
    }
    public void AnimalSleep(){
        System.out.println("ZZzz");
    }
}
class Cat extends Animal{
    public void AnimalSound(){
        System.out.println("Cat says meow meow");
    }
}
class Dog extends Animal{
    public void AnimalSound(){
        System.out.println("Dog says bow bow");
    }
}
class Lion extends Animal{
    public void AnimalSound(){
        System.out.println("Lion says hoeew");
    }
}
class Main2{
public static void main(String[] args){
    Cat c = new Cat();
    Animal a = new Animal();
    Dog d = new Dog();
    Lion l = new Lion();
    a.AnimalSound();
    a.AnimalSleep();
    c.AnimalSound();
    c.AnimalSleep();
    d.AnimalSound();
    d.AnimalSleep();
    l.AnimalSound();
    l.AnimalSleep();
}
}