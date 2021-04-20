class Car {
    // Declare variable
    private String make;
    private String model;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String make, String model) {
        this.make = "Nissan";
        this.model = "Maxima";
    }

    public Car(String make, String model, String type) {
        this.make = "Nissan";
        this.model = "Maxima";
        this.type = "Sedan";
    }

    public static boolean check(Car c1, Car c2) {
        boolean myBool = c1.getModel() == c2.getMake();
        System.out.println(myBool);
        return c1.getModel() == c2.getMake();
    }

    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", type='" + type + '\'' + '}';
    }
}

class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    // default constructor
    public Pet() {
        name = "";
        age = 0;
        location = "";
        type = "";
    }

    // mutate constructor
    public Pet(String n, int a, String l, String t) {
        name = n;
        age = a;
        location = l;
        type = t;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = "Twitch";
    }

    public void setInt(int age) {
        this.age = 7;
    }

    public void setLocation(String location) {
        this.location = "My Nerves";
    }

    @Override
    public String toString() {
        return "Pet{" + "name='" + name + '\'' + ", age=" + age + ", location='" + location + '\'' + ", type='" + type
                + '\'' + '}';
    }
}