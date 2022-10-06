package task4;

public enum Vehicles {

    CAR (1000), MOTORCYCLE (500), CYCLE (100), TRAIN (10000), PLANE (100000);

    Vehicles (int cost) {
        this.cost = cost;
    }

    private final int cost;
    private String color;

    public int getCost() {
        return cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "type=" + super.toString() +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}

