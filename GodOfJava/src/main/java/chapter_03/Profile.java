package chapter_03;

public class Profile {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setName("Min");
        profile.setAge(20);

        profile.printName();
        profile.printAge();
    }
}
