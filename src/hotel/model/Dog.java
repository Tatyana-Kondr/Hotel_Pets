package hotel.model;

public class Dog extends Pets{
    private double weight;
    private int food;

    public Dog(int id, String breed, String name, double dayPrice, int days, double weight, int food) {
        super(id, breed, name, dayPrice, days);
        this.weight = weight;
        this.food = food;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
                ", weight: " + weight +
                ", price of Food: " + food;
    }

    @Override
    public double costOfService() {
        double cost = dayPrice * days + food + weight * 0.1;
        return cost;
    }

}
