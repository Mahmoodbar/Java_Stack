public class Human{
    int strenght = 3;
    int stealth = 3 ; 
    int intelligence = 3 ; 
    int health = 100; 
    
    public void attack(Human human){
        human.health -= this.strenght;
        

    }

    public static void main (String [] args){
        Human ahmad = new Human();
        Human ali = new Human();
        ali.attack(ahmad);
        System.out.println( ahmad.health);
    }

    
} 