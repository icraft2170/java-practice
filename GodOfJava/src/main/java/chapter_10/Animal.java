package chapter_10;

public class Animal {
    private String name;
    private String kind;
    private int legCount;
    private int iq;
    private boolean hasWing;

    public Animal() {
    }

    public Animal(String name, String kind, int legCount, int iq, boolean hasWing) {
        this.name = name;
        this.kind = kind;
        this.legCount = legCount;
        this.iq = iq;
        this.hasWing = hasWing;
    }

    public void move() {
        System.out.println("이동한다.");
    }

    public void eatFood(Food food) {
        System.out.println(food.getName() + "을 먹다.");
    }

    public void shoutOut() {
        System.out.println("소리내기");
    }
}
