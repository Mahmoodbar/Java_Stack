public class Ninja extends Human {
    int stealth = 10 ; 
    public steal(Human human){
        int s = this.stealth;
        human.health -= s ;

    }
    
    public runAway(){
        this.health -= 10 ; 

    }
}