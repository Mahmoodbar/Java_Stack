public class Animal {

    String type = "animal";


    public Animal(){
        System.out.println("I am an animal");

    }
    public Animal(String type){
        this.type =type;
        System.out.println("Type"+type);

    }
      
    void display(){
        System.out.println("Animal class");
    }


     public static void main(String[] args){ 
        
       Dog dog1 = new Dog();
        dog1.display();
        dog1.printMessage();
    
     }
}
