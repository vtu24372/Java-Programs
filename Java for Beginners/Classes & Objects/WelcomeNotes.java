// inheritance 
public class WelcomeNotes{
    public void Greetings(){
        System.out.println("Welcome to java");
    }
}
class Guesture extends WelcomeNotes{ // multilevel or hierarchial inheritance 
    public void Greetings(){
        System.out.println("Practise make a man perfect");
    }
}
interface A { // type two inheritance using interface
    public void Greetings();

    }
class learner extends WelcomeNotes implements A{ // hybrid inheritance
    public void Greetings(){
        System.out.println("Consistency in learning makes a learner better");
    }
}
class main3{
    public static void main(String[] args){
        WelcomeNotes w = new WelcomeNotes();
        Guesture G = new Guesture();
        A a = new learner();
        w.Greetings();
        a.Greetings();
        G.Greetings();
        
    }
}