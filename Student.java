public class Student {

  String name;
  int age;
  
  Student(String name, int age) {

    this.name = name;
    this.age = age;
  }

  Student() {}

  void display() {

    System.out.println("Name : "+name+" Age : "+age);
  }

  public static void main(String[] args) {

    Student ayush = new Student();
    Student guneet = new Student("Guneet", 12);
    ayush.display();
    guneet.display();
  }
}
