/**
 * Description of Class ElectricScooter:
 * Eight different attributes are declared as private , a constructor is made  where we assign the parameter values to the instance variables or desired values, we also call two setter methods of the parent class in the constructor method. Then we have accessor methods of the private attributes, setter method and a display method to show the values of all attributes.
 * @author Rasel Bajracharya
 * @version JDK 18.0.1.1
 */

// Child class of Vehicle class
public class ElectricScooter extends Vehicle
{
 // Declaration of the Attributes
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    
    // Constructor of Vehicle Class
    public ElectricScooter(int vehicleID, String vehicleName, String vehicleWeight, int vehicleSpeed, String vehicleColor, int batteryCapacity)
    {
        super(vehicleID, vehicleName, vehicleColor, vehicleWeight);
        super.setSpeed(vehicleSpeed);
        super.setColor(vehicleColor);
        this.batteryCapacity = batteryCapacity;
        this.range = 0;
        this.price = 0;
        this.brand = "";
        this.mileage = "";
        this.chargingTime = "";
        this.hasPurchased = false;
        this.hasSold = false;
    }
    
    // Getter/Accessor Methods
    public int getBatteryCapacity()
    {
        return this.batteryCapacity;
    }
    
    public int getRange()
    {
        return this.range;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public String getChargingTime()
    {
        return this.chargingTime;
    }
    
    public String getMileage()
    {
        return this.mileage;
    }
    
    public boolean getHasPurchased()
    {
        return this.hasPurchased;
    }
    
    public boolean getHasSold()
    {
        return this.hasSold;
    }
    
    public String getBrand()
    {
        return this.brand;
    }
    
    // Setter Methods
    public void setBrand(String brand)
    {
        if (hasPurchased==false) {
            this.brand = brand;
        }
        else{
            System.out.println("The scooter is already purchased so we can't change the brand.");
        }
    }
    
    public void purchaseScooter(String brand, int price, String chargingTime, String mileage, int range)
    {
        if (hasPurchased == false) {
            setBrand(brand);
            this.price = price;
            this.chargingTime = chargingTime;
            this.mileage = mileage;
            this.range = range;
            hasPurchased = true;
        }
    }
    
    public void sellScooter(int price)
    {
        if (hasSold == false) {
            this.price = price;
            range = 0;
            chargingTime = "";
            mileage = "";
            batteryCapacity = 0;
            hasSold = true;
            hasPurchased = false;
        }
        else{
            System.out.println("Sorry, the scooter has already been sold");
        }
    }
    
    // Display method
    public void display()
    {
        super.display();
        if (hasPurchased == true) {
            System.out.println("The Brand of the scooter is " + brand);
            System.out.println("The Battery Capacity of the scooter is " + batteryCapacity);
            System.out.println("The Mileage of the scooter is " + mileage);
            System.out.println("The Range of the scooter is " + range);
            System.out.println("The Recharge time of the scooter is " + chargingTime);            
        }
    }
}
