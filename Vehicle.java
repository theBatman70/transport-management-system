import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.concurrent.Callable;

/**
 * Description of Vehicle class:
 * Five different attributes are declared, a constructor is made where we assign the parameter values to the instance variables. Then we have accessor methods, setter method and then a display method to show the values of all attributes.
 * @author Rasel Bajracharya
 * @version JDK 18.0.1.1
 */

// The Parent Class of AutoRickshaw and ElectricScooter
public class Vehicle
{
    // Declaration of the Attributes
    private int vehicleID;
    private String vehicleName;
    private String vehicleWeight;
    private String vehicleColor;
    private int vehicleSpeed;
    
    // Constructor of the Vehicle class
    public Vehicle (int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor)
    {
        // Assignment of the value of constructor's parameters to the instance variables
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.vehicleWeight = vehicleWeight;
        this.vehicleColor = vehicleColor;
    }
    
    //Accessor Methods aka Getter Methods
    public int getVehicleID()
    {
        return this.vehicleID;
    }
    public String getVehicleName()
    {
        return this.vehicleName;
    }
    public String getVehicleWeight()
    {
        return this.vehicleWeight;
    }
    public String getVehicleColor()
    {
        return this.vehicleColor;
    }
    public int getVehicleSpeed()
    {
        return this.vehicleSpeed;
    }
    
    // Setter Methods:
    
    // This method sets the vehicle speed to a new desired value of speed 
    public void setSpeed (int vehicleSpeed)
    {
        this.vehicleSpeed = vehicleSpeed;
    }
    
    // This method sets the vehicle color to a new color.
    public void setColor (String vehicleColor)
    {
        this.vehicleColor = vehicleColor;
    }
    
    // Display Method to display all the values of the attributes
    public void display()
    {
        System.out.println("\nThe ID of the vehicle is " + vehicleID);
        System.out.println("The name of the vehicle is " + vehicleName);
        System.out.println("The speed of the vehicle is " + vehicleSpeed);
        System.out.println("The color of the vehicle is " + vehicleID);
        
        if (vehicleWeight == "") {
            System.out.println("The given attribute is empty");
        } else {
            System.out.println("The weight of the vehicle is " + vehicleWeight);
        }
    }
}

