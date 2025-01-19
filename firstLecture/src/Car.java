public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelsInLiters;
    int noOfSears;

    public void drive(){
        System.out.println("Car is driving");
        currentFuelsInLiters--;
    }

    public void addFuel(float fuel){
        currentFuelsInLiters+=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelsInLiters;
    }
}
