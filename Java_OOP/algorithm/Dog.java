public class Dog extends Animal {

    String type = "Mammal";

    public Dog(){
    System.out.println("I am a DOG");
    }
    
    public void display(){
        System.out.println("Dog class");
    }

    public void printMessage(){
        this.display();
        super.display();
    }

    
}