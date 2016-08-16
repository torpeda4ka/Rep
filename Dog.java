
public class Dog {
  public String name;
  public String says;
  
  public static void main(String[] args) { 
    Dog dog1 = new Dog("spot", "Ruff!");
    Dog dog2 = new Dog("scruffy", "Wurf!");
    System.out.println(dog1.name + " " + dog1.says);
  System.out.println(dog2.name + " " + dog2.says);
  }

  public Dog(String name, String says){
    this.name=name;
    this.says=says;
  }
}
