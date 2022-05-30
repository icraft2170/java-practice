package chapter_10;

public class Dog extends Animal{
    public Dog() {
        super("개", "개과", 4, 30, false);
    }

    public Dog(String name, String kind, int legCount, int iq, boolean hasWing) {
        super(name, kind, legCount, iq, hasWing);
    }

    @Override
    public void move() {
        System.out.println("네 발로 걷는 다.");
    }

    @Override
    public void eatFood(Food food) {
        super.eatFood(food);
    }

    @Override
    public void shoutOut() {
        System.out.println("월 월");
    }
}
