public class Fox {
  private String name = "Fox";
  private String color = "Red";
  private int age = 10;

  public Fox(String name, String color, int age){
    this.age = age;
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;

  }
}
