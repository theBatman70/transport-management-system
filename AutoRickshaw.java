/**
 * Description of Class AutoRickshaw:
 * Eight different attributes are declared, a constructor is made  where we assign the parameter values to the instance variables or desired values, we also call two setter methods of the parent class in the constructor method. Then we have accessor methods of the private attributes, setter method and a display method to show the values of all attributes.
 * @author Rasel Bajracharya
 * @version JDK 18.0.1.1
 */

// Child class of Vehicle class
public class AutoRickshaw extends Vehicle
{
    // Declaration of the Attributes
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;
        
    public AutoRickshaw (int vehicleID,String vehicleName,String vehicleWeight, String vehicleColor, int vehicleSpeed, int engineDisplacement,String torque, int fuelTankCapacity, String groundClearance)
    {
        super(vehicleID, vehicleName,vehicleWeight,vehicleColor);
        super.setColor(vehicleColor);
        super.setSpeed(vehicleSpeed);
        this.engineDisplacement = engineDisplacement;
        this.torque = torque;
        this.numberOfSeats = numberOfSeats;
        this.fuelTankCapacity = fuelTankCapacity;
        this.groundClearance = groundClearance;
        this.isBooked=false;
    }
    
    //Accessor Methods aka Getter Methods
    public int getEngineDisplacement()
    {
        return this.engineDisplacement;
    }
    public String getTorque() {
        return this.torque;
    }
    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }
    public int getFuelTankCapacity()
    {
        return this.fuelTankCapacity;
    }
    public String getGroundClearance()
    {
        return this.groundClearance;
    }
    public int getChargeAmount()
    {
        return this.chargeAmount;
    }
    public String getBookedDate()
    {
        return this.bookedDate;
    }
    public boolean getIsBooked()
    {
        return this.isBooked;
    }
    
    //Setter Methods
    public void setNumberOfSeats (int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }
    public void setChargeAmount (int chargeAmount)
    {
        this.chargeAmount = chargeAmount;
    }
    public void bookAutoRickshaw (String bookedDate, int chargeAmount, int numberOfSeats)
    {
        if (isBooked==false) {
            this.bookedDate = bookedDate;
            setChargeAmount(chargeAmount);
            setNumberOfSeats(numberOfSeats);
            isBooked=true;
            System.out.println(super.getVehicleID() + " is booked");
        }
        else{
            System.out.println("Status of booking " + getIsBooked());
            System.out.println("Auto Rickshaw is already booked");
        }
    }
    
    //Display Method
    public void display()
    {
        super.display();
        if (isBooked==true) {        
            System.out.println("The engine displacement is " + engineDisplacement);
            System.out.println("The Torque is " + torque);
            System.out.println("The fuel tank capacity is " + fuelTankCapacity);
            System.out.println("The Ground Clearance is " + groundClearance);
            System.out.println("The Booked Date is " + bookedDate);
            
            if (chargeAmount==0) {
            System.out.println("Charge Amount is not set");
            }
            else{
                System.out.println("Charge Amount is " + chargeAmount);
            }
            if (numberOfSeats==0) {
                System.out.println("Number of seats is not set");
            }
            else{
                System.out.println("Number of seats is " + numberOfSeats);
            }
        }
        
    }
}
