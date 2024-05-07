package OOPS.Exercises;

// Class representing a Car
class Car {
    // Fields
    private String companyName; // The company name of the car
    private String modelName;   // The model name of the car
    private int year;           // The year of the car
    private final float mileage; // The mileage of the car (constant)

    // Constructor
    public Car() {
        // Initialize mileage
        this.mileage = 18.45f;
    }

    // Setter method for company name
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Getter method for company name
    public String getCompanyName() {
        return this.companyName;
    }

    // Setter method for model name
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Getter method for model name
    public String getModelName() {
        return this.modelName;
    }

    // Setter method for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter method for year
    public int getYear() {
        return this.year;
    }

    // Getter method for mileage
    public float getMileage() {
        return this.mileage;
    }
}

class CarInformationSystem {
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car();

        // Set car details
        myCar.setCompanyName("Mercedes");
        myCar.setModelName("AMG GLC 43 4MATIC");
        myCar.setYear(2021);

        // Print car details
        System.out.println("Company Name: " + myCar.getCompanyName());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());
    }
}