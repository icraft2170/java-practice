package chapter_04;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;


    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();
        profilePrint.setAge((byte) 26);
        profilePrint.setName("손현호");
        profilePrint.setMarried(false);

        System.out.println("profilePrint.name = " + profilePrint.name);
        System.out.println("profilePrint.age = " + profilePrint.age);
        System.out.println("profilePrint.isMarried = " + profilePrint.isMarried);
    }
}
