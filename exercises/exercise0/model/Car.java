package model;

public class Car {
    private int id;
    private String manufacturer;
    private String year;
    private String modelName;
    private String fuelType;
    private int engineCapacity;
    private int seats;
    private String gearType;

    public Car(int id, String manufacturer, String year, String modelName, String fuelType, int engineCapacity, int seats, String gearType) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.modelName = modelName;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.seats = seats;
        this.gearType = gearType;

        System.out.println("Created instance of class Car for id: " + id + " ,manufacturer: " + manufacturer + " and model name: " + modelName);
    }

    public class Engine {
        private String engineType;
        private double engineSize;
        private int horsepower;
        private int horsepowerRpm;
        private int torque;
        private int torqueRpm;
        private int driveType;
        private float turningRadius;

        public Engine(String engineType, double engineSize, int horsepower, int horsepowerRpm, int torque, int torqueRpm, int driveType, float turningRadius)
        {
            this.engineType = engineType;
            this.engineSize = engineSize;
            this.horsepower = horsepower;
            this.horsepowerRpm = horsepowerRpm;
            this.torque = torque;
            this.torqueRpm = torqueRpm;
            this.driveType = driveType;
            this.turningRadius = turningRadius;

            System.out.println("\tCreated instance of Nested class Engine for engineType: " + engineType);
        }

        private void getEngineSize()
        {
            System.out.println("Engine size: " + engineSize);
        }
        
        private void getHorsepower()
        {
            System.out.println("Horsepower: " + horsepower);
        }

        private void getDriveType() {
            System.out.println("DriveType: " + driveType);
        }

    }

    public class Body {
        private int id;
        private double length;
        private double bodyWidth;
        private double bodyheight;
        private double wheelBase;
        private double groundClearance;
        private double curb;
        private double grossWeight;

        public Body(int id, double length, double bodyWidth, double bodyheight, double wheelBase, double groundClearance, double curb, double grossWeight) {
            this.id = id;
            this.length = length;
            this.bodyWidth = bodyWidth;
            this.wheelBase = wheelBase;
            this.groundClearance = groundClearance;
            this.curb = curb;
            this.grossWeight = grossWeight; 

            System.out.println("\tCreated instance of Nested class Body with length: " + length + " and weight: " + grossWeight);
        }

        public void getLength() {
            System.out.println("Length: " + length);
        }

        public void getGroundClearance() {
            System.out.println("Ground Clearance: " + groundClearance);
        }

        public void getGrossWeight() {
            System.out.println("Gross Weight: " + grossWeight);
        }
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getYear() {
        return year;
    }

    public String getModelName() {
        return modelName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getSeats() {
        return seats;
    }

    public String getGearType() {
        return gearType;
    }
}
