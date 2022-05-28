package demo;

public class ConstructorDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);

        Person p3 = new Person(60000.0f);
        System.out.println(p3);

        Person p2 = new Person("person1", 21);
        System.out.println(p2);

        increment(p3);
        System.out.println(p3);
    }

    public static void increment(Person p){
        p.setSalary(p.getSalary()+10000);
    }
}

class Person{
    private float salary = 10000f;
    private String name = "a";
    private int age = 20;

    public Person(float salary) {
        this.salary = salary; // 'this' refers current object
        System.out.println("Argument 1 constructor.");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Argument 2 constructor.");
    }
    public Person(){
        System.out.println("Default constructor.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}