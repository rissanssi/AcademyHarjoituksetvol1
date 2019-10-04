public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public void setName() {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge() {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + this.age.toString();
    }
}
