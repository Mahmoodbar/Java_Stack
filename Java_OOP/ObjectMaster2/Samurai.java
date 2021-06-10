public class Samurai extends Human {
    static int count = 0 ; 
    public Samurai (){

    
   this.health = 200;
   this.count++ ; 

}
   public deathBlow(Human){
       human.health = 0 ;
       Samurai.health = Samurai.health/2;


   }

   public meditate(){

       this.health += this.health/2 ; 
   }

   public howMany(){
       System.out.println(this.count);
    

   }
}