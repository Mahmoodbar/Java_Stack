public class Project{
String name;
String description;
public void elevatorPitch (String name , String description){
   
}

public Project(){}


public Project(String name){
    this.name = name;
} 

public Project(String name, String description) {
    this.name = name;
    this.description = description;
}


 public String getName() {
    return name;
  }



    public void setName(String name) {
        this.name = name;
        System.out.println(name);
  }


 public static void main(String[] args){
     Project ahmad = new Project();
        ahmad.setName("ahmad");
 }


}

