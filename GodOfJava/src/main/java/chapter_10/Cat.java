package chapter_10;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name, String kind, int legCount, int iq, boolean hasWing) {
        super(name, kind, legCount, iq, hasWing);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eatFood(Food food) {
        super.eatFood(food);
    }

    @Override
    public void shoutOut() {
        System.out.println("야옹야옹");
    }
}
