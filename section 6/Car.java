public class Car {
    private String make;
    private String model;
    private int year;
    private String[] parts;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getParts() {
        return Arrays.copyOf(parts, parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear(1967);
        String[] parts = {"Engine", "Transmission", "Tires", "Doors", "Windows"};
        car.setParts(parts);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Parts: " + Arrays.toString(car.getParts()));
    }
}