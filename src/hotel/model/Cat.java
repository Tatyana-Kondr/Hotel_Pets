package hotel.model;

public class Cat extends Pets{
    private int age;
    private int food;

    public Cat(int id, String breed, String name, double dayPrice, int days, int age, int food) {
        super(id, breed, name, dayPrice, days);
        this.age = age;
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; age: " + age +
                ", price of Food: " + food;
    }

    @Override
    public double costOfService() {
        double cost = dayPrice * days + food;
        return cost;
    }
}
