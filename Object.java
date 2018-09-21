class Student {

  String name;
  int age;

  Student(String name, int age) {

    this.name = name;
    this.age = age;
  }

  Student() {}

  void setName(String name) {

    this.name = name;
  }

  void setAge(int age) {

    this.age = age;
  }

  String getname() {

    return name;
  } 

  int getAge() {

    return age;
  }

  void display() {

    System.out.println("Name : " + name + "; Age : " + age);
  }
  
}

public class Object {

  public static void main(String[] args) {
  
    Student ayush = new Student();
    Student guneet = new Student("Guneet", 90);
    ayush.setName("Ayush");
    ayush.setAge(19);
    System.out.println("Guneet->age : " + guneet.getAge());
    ayush.display();
 //   System.out.println(String.SIZE);
 //   Student bhalu = new Student(ayush);
 //   bhalu.display();
  }
}
