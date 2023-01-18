
//Vehicle class needs to be in a file called "Vehicle.java"
// public class Vehicle {
// String name;
// Double max_speed;
// 
// }



// Car class needs to be in a file called "Car.java"
// Car class extends Vehicle class because it is a child class of the parent Vehicle class
public class Car extends Vehicle implements maintainable {
  private int number_of_cylinders;     
  private String name;  
  private double COST_PER_CYLINDER_PER_HOUR; 

 // two-argument constructor                                
   public Car(String name , number_of_cylinders, double max_speed,double COST_PER_CYLINDER_PER_HOUR ) {
     super(String name, number_of_cyclinders, max_speed, double COST_PER_CYLINDER_PER_HOUR); 

   
   
   }

    this.String name =  String name;                                    
    this.number_of_cylinders = number_of_cylinders;  
    this.max_speed = max_speed;
    this.double COST_PER_CYLINDER_PER_HOUR = double COST_PER_CYLINDER_PER_HOUR;




// set and get methods for the "name" variable
public void setName(String newName){
name = newName;
}

public String getName() {
return name;
}


// set and get methods for the "max_speed" variable
public void setMaxSpeed(Double newMaxSpeed){
max_speed = newMaxSpeed;
}

public Double getMaxSpeed() {
return max_speed;
}


// set and get methods for the "number_of_cylinders" variable
public void setNumCylinders(int newNumCylinders){
number_of_cylinders = newNumCylinders;
}

public int getNumCylinders() {
return number_of_cylinders();
}


public void setCOST_PER_CYLINDER_PER_HOUR = (double COST_PER_CYLINDER_PER_HOUR){
 COST_PER_CYLINDER_PER_HOUR = newCOST_PER_CYLINDER_PER_HOUR;

}


public double getCOST_PER_CYLINDER_PER_HOUR(){
return  COST_PER_CYLINDER_PER_HOUR();
}



public void toString(){
   System.out.println("Name is: " + name);
   System.out.println("Max speed is: " + max_speed);
   System.out.println("Number of cylinders is: " + number_of_cylinders);
   System.out.println("The runningCost of an Airplane will be equal to:" +
   hours * COST_PER_ ENGINE _PER_HOUR * number_of_engines);
   }

}

