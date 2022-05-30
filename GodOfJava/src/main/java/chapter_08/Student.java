package chapter_08;

public class Student {
    private String name;
    private String address;
    private String phone;
    private String email;


    public Student(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("이름은 비어있을 수 없습니다.");
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("이름은 비어있을 수 없습니다.");
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ' ' + address + ' ' + phone + ' ' + email;
    }
}
