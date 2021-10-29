public class Animal {
  public String noise;
  public int age;
  private String name;

  public Animal(String noise, int age, String name){
    this.noise = noise;
    this.age = age;
    this.name = name;
  }

  public String getName() {
    return (name);
  }
  public void speak(){
    System.out.println("My name is " + name + ".");
    System.out.println("I am " + age + " years old.");
    System.out.println("I say " + noise + ".");
  }

}
public class Bird extends Animal {
  public double height;
  public String color;

  public Bird(String noise, int age, String name, double height, String color){
  }
  public void speak(){
    System.out.println("My name is " + name + ".");
    System.out.println("I am " + age + " years old.");
    System.out.println("I say " + noise + ".");
  }

}
