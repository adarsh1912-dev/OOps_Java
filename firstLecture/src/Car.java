public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelsInLiters;
    int noOfSears;

    public void drive(){
        if(currentFuelsInLiters == 0){
            System.out.println("Tank is empty please refuel it");
        }
        else if(currentFuelsInLiters < 5){
            System.out.println("Car is in reserved mode, Please refuel");
            currentFuelsInLiters--;
        }
        else {
            System.out.println("Car is driving");
            currentFuelsInLiters--;
        }
    }

    public void addFuel(float fuel){
        currentFuelsInLiters+=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelsInLiters;
    }
    
}
