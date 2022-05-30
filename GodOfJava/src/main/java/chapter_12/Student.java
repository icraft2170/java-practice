package chapter_12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(phone, student.phone) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone, email);
    }
}
