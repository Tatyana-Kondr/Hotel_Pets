package hotel.model;

public abstract class Pets {
    protected int id;
    protected String breed;
    protected String name;
    protected double dayPrice;
    protected int days;

    public Pets(int id, String breed, String name, double dayPrice, int days) {
        this.id = id;
        this.breed = breed;
        this.name = name;
        this.dayPrice = dayPrice;
        this.days = days;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Pets - " +
                "id: " + id +
                ", breed: " + breed +
                ", name: " + name +
                ", dayPrice: " + dayPrice +
                ", days: " + days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pets pets = (Pets) o;

        return id == pets.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
    public abstract double costOfService();
}
