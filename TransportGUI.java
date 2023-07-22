import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TransportGUI implements ActionListener {

    // instance variables

    // JFrames
    private JFrame addAutoRickshawPage, addScooterPage, bookAutoRickshawPage, purchaseScooterPage, sellScooterPage,
            homePage;

    // JLabels in the HomePage
    private JLabel title, title1, title2;

    // ArrayList to store the objects of AutoRickshaw and ElectricScooter class
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    // Labels
    private JLabel vehicleName, vehicleID, vehicleWeight, vehicleColor, vehicleSpeed, engineDisplacement, torque, seats,
            fuelTankCapacity, groundClearance, chargeAmount, range, capacity, price, chargingTime, brand, mileage,
            bookedDate;

    // TextFields
    private JTextField vehicleNameTF, vehicleIDTF, vehicleWeightTF, vehicleColorTF, vehicleSpeedTF,
            engineDisplacementTF, torqueTF, seatsTF, fuelTankCapacityTF, groundClearanceTF, chargeAmountTF, rangeTF,
            capacityTF, priceTF, chargingTimeTF, brandTF, mileageTF;

    private JComboBox bookedDateCombo;

    // Buttons for executing the main functions of the program
    private JButton addAutoButton, bookButton, addScooterButton, purchaseButton, sellButton;

    private JPanel blank1, blank2;

    private JPanel main;

    private JButton clearButton, displayAutoButton, displayScooterButton;

    // Panels for producing desired layout in the GUI
    private JPanel form, formPanel, formPanelLeft, formPanelRight, titleP, buttonPanel;

    // Home Page Buttons
    private JButton addAuto, bookAuto, addScooter, purchaseScooter, sellScooter;

    // GO TO HOME buttons for each pages
    private JButton homebtn1, homebtn2, homebtn3, homebtn4, homebtn5;

    // Dialog Panel
    private JPanel message;

    // The main method which calls the Home Page of our GUI
    public static void main(String[] args) {
        TransportGUI aa = new TransportGUI();
        aa.homePage();
    }

    /** Home Page **/
    public void homePage() {

        homePage = new JFrame("Home");
        homePage.setBounds(400, 180, 600, 290);
        homePage.setLayout(null);

        main = new JPanel();
        main.setBounds(35, 10, 500, 280);
        main.setLayout(new BorderLayout(20, 40));

        title = new JLabel("Transportation Manager");
        title.setFont(new Font("Monospaced", Font.BOLD, 25));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);

        title1 = new JLabel("AutoRickshaw");
        title1.setAlignmentX(Component.CENTER_ALIGNMENT);
        title1.setFont(new Font("Serif", Font.PLAIN, 20));

        title2 = new JLabel("Electric Scooter");
        title2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        title2.setFont(new Font("Serif", Font.PLAIN, 20));

        blank1 = new JPanel();

        addAuto = new JButton("Add an AutoRickshaw");
        addAuto.setAlignmentX(Component.CENTER_ALIGNMENT);

        bookAuto = new JButton("Book an AutoRickshaw");
        bookAuto.setAlignmentX(Component.CENTER_ALIGNMENT);

        addScooter = new JButton("Add an Electric Scooter");
        addScooter.setAlignmentX(Component.RIGHT_ALIGNMENT);

        purchaseScooter = new JButton("Purchase scooter");
        purchaseScooter.setAlignmentX(Component.RIGHT_ALIGNMENT);

        sellScooter = new JButton("Sell scooter");
        sellScooter.setAlignmentX(Component.RIGHT_ALIGNMENT);

        formPanelLeft = new JPanel();
        formPanelLeft.setLayout(new BoxLayout(formPanelLeft, BoxLayout.Y_AXIS));
        formPanelLeft.add(title1);
        formPanelLeft.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanelLeft.add(addAuto);
        formPanelLeft.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanelLeft.add(bookAuto);

        formPanelRight = new JPanel();
        formPanelRight.setLayout(new BoxLayout(formPanelRight, BoxLayout.Y_AXIS));
        formPanelRight.add(title2);
        formPanelRight.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanelRight.add(addScooter);
        formPanelRight.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanelRight.add(purchaseScooter);
        formPanelRight.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanelRight.add(sellScooter);

        main.add(title, BorderLayout.NORTH);
        main.add(formPanelLeft, BorderLayout.WEST);
        main.add(formPanelRight, BorderLayout.EAST);
        main.add(blank1, BorderLayout.CENTER);

        // creating object of the class that handles events in the home page
        // homePageEvents homePageE = new homePageEvents();

        addAuto.addActionListener(this);
        bookAuto.addActionListener(this);
        addScooter.addActionListener(this);
        purchaseScooter.addActionListener(this);
        sellScooter.addActionListener(this);

        homePage.add(main);

        homePage.setVisible(true);
        homePage.setResizable(false);
    }

    /** Add an AutoRickshaw Page **/
    public void addAutoRickshawPage() {
        addAutoRickshawPage = new JFrame("Add an Auto-Rickshaw");
        addAutoRickshawPage.setLayout(null);
        addAutoRickshawPage.setBounds(40, 10, 700, 440);

        form = new JPanel();
        form.setBounds(40, 30, 600, 350);
        form.setLayout(new BorderLayout(20, 30));

        formPanelLeft = new JPanel();
        formPanelLeft.setLayout(new GridLayout(5, 2, 5, 20));

        formPanelRight = new JPanel();
        formPanelRight.setLayout(new GridLayout(5, 2, 5, 20));

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1, 2, 60, 0));

        title = new JLabel("Add an AutoRickshaw to the list");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Monospaced", Font.BOLD, 20));

        // filler panels
        blank1 = new JPanel();
        blank2 = new JPanel();

        vehicleID = new JLabel("Vehicle ID: ");
        vehicleName = new JLabel("Vehicle Name: ");
        vehicleWeight = new JLabel("Vehicle Weight: ");
        vehicleColor = new JLabel("Vehicle Color: ");
        vehicleSpeed = new JLabel("Vehicle Speed: ");
        engineDisplacement = new JLabel("Engine Displacement: ");
        torque = new JLabel("Torque: ");
        fuelTankCapacity = new JLabel("Fuel Tank Capacity: ");
        groundClearance = new JLabel("Ground Clearance: ");

        vehicleIDTF = new JTextField();
        vehicleNameTF = new JTextField();
        vehicleWeightTF = new JTextField();
        vehicleColorTF = new JTextField();
        vehicleSpeedTF = new JTextField();

        engineDisplacementTF = new JTextField();
        torqueTF = new JTextField();
        fuelTankCapacityTF = new JTextField();
        groundClearanceTF = new JTextField();

        formPanelLeft.add(vehicleID); formPanelLeft.add(vehicleIDTF); formPanelRight.add(vehicleSpeed); formPanelRight.add(vehicleSpeedTF);
        formPanelLeft.add(vehicleName); formPanelLeft.add(vehicleNameTF); formPanelRight.add(engineDisplacement); formPanelRight.add(engineDisplacementTF);
        formPanelLeft.add(vehicleWeight);
        formPanelLeft.add(vehicleWeightTF);
        formPanelRight.add(torque);
        formPanelRight.add(torqueTF);
        formPanelLeft.add(vehicleColor);
        formPanelLeft.add(vehicleColorTF);
        formPanelRight.add(fuelTankCapacity);
        formPanelRight.add(fuelTankCapacityTF);
        formPanelLeft.add(groundClearance);
        formPanelLeft.add(groundClearanceTF);
        formPanelRight.add(blank1);
        formPanelRight.add(blank2);

        formPanel.add(formPanelLeft);
        formPanel.add(formPanelRight);

        addAutoButton = new JButton("Add");
        displayAutoButton = new JButton("Display");
        clearButton = new JButton("Clear");
        homebtn1 = new JButton("Go to Home Page");

        addAutoButton.addActionListener(this);
        displayAutoButton.addActionListener(this);
        clearButton.addActionListener(this);
        homebtn1.addActionListener(this);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));

        buttonPanel.add(addAutoButton);
        buttonPanel.add(displayAutoButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(homebtn1);

        form.add(title, BorderLayout.NORTH);
        form.add(formPanel, BorderLayout.CENTER);
        form.add(buttonPanel, BorderLayout.SOUTH);

        addAutoRickshawPage.add(form);

        addAutoRickshawPage.setVisible(true);
        addAutoRickshawPage.setResizable(false);
    }

    /** Book an AutoRickshaw Page **/
    public void bookAutoRickshawPage() {
        bookAutoRickshawPage = new JFrame("Book an Auto-Rickshaw");
        bookAutoRickshawPage.setLayout(null);

        form = new JPanel();
        form.setLayout(new BorderLayout(20, 20));
        form.setBounds(20, 20, 350, 240);

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 10, 10));

        title = new JLabel("Book an AutoRickshaw from the list");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Monospaced", Font.BOLD, 16));

        vehicleID = new JLabel("Vehicle ID: ");
        chargeAmount = new JLabel("Charge Amount: ");
        seats = new JLabel("No. of Seats: ");
        bookedDate = new JLabel("Booked Date: ");

        vehicleIDTF = new JTextField();
        chargeAmountTF = new JTextField();
        seatsTF = new JTextField();
        
        String[] date = {"2021-05-01","2021-05-02","2021-05-03","2021-05-04","2021-05-05","2021-05-06","2021-05-07"};
        
        bookedDateCombo = new JComboBox(date);

        formPanel.add(vehicleID);
        formPanel.add(vehicleIDTF);
        formPanel.add(chargeAmount);
        formPanel.add(chargeAmountTF);
        formPanel.add(seats);
        formPanel.add(seatsTF);
        formPanel.add(bookedDate);
        formPanel.add(bookedDateCombo);

        bookButton = new JButton("Book");
        displayAutoButton = new JButton("Display");
        clearButton = new JButton("Clear");
        homebtn2 = new JButton("Go to Home");

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));

        buttonPanel.add(bookButton);
        buttonPanel.add(displayAutoButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(homebtn2);

        homebtn2.addActionListener(this);
        bookButton.addActionListener(this);
        displayAutoButton.addActionListener(this);
        clearButton.addActionListener(this);

        form.add(title, BorderLayout.NORTH);
        form.add(formPanel, BorderLayout.CENTER);
        form.add(buttonPanel, BorderLayout.SOUTH);

        bookAutoRickshawPage.add(form);

        bookAutoRickshawPage.setBounds(700, 30, 400, 300);
        bookAutoRickshawPage.setVisible(true);
        bookAutoRickshawPage.setResizable(false);
    }

    public void addScooterPage() {
        addScooterPage = new JFrame("Add an Electric Scooter");
        addScooterPage.setBounds(40, 10, 700, 350);
        addScooterPage.setLayout(null);

        form = new JPanel();
        form.setBounds(40, 30, 600, 250);
        form.setLayout(new BorderLayout(20, 30));

        formPanelLeft = new JPanel();
        formPanelLeft.setLayout(new GridLayout(3, 2, 5, 20));

        formPanelRight = new JPanel();
        formPanelRight.setLayout(new GridLayout(3, 2, 5, 20));

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1, 2, 60, 0));

        title = new JLabel("Add an Electric Scooter to the list");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Monospaced", Font.BOLD, 20));

        // filler panels
        blank1 = new JPanel();
        blank2 = new JPanel();

        vehicleID = new JLabel("Vehicle ID: ");
        vehicleName = new JLabel("Vehicle Name: ");
        vehicleWeight = new JLabel("Vehicle Weight: ");
        vehicleColor = new JLabel("Vehicle Color: ");
        vehicleSpeed = new JLabel("Vehicle Speed: ");
        capacity = new JLabel("Battery Capacity: ");

        vehicleIDTF = new JTextField();
        vehicleNameTF = new JTextField();
        vehicleWeightTF = new JTextField();
        vehicleColorTF = new JTextField();
        vehicleSpeedTF = new JTextField();
        capacityTF = new JTextField();

        formPanelLeft.add(vehicleID);
        formPanelLeft.add(vehicleIDTF);
        formPanelRight.add(vehicleSpeed);
        formPanelRight.add(vehicleSpeedTF);
        formPanelLeft.add(vehicleName);
        formPanelLeft.add(vehicleNameTF);
        formPanelRight.add(capacity);
        formPanelRight.add(capacityTF);
        formPanelLeft.add(vehicleWeight);
        formPanelLeft.add(vehicleWeightTF);
        formPanelRight.add(vehicleColor);
        formPanelRight.add(vehicleColorTF);

        formPanel.add(formPanelLeft);
        formPanel.add(formPanelRight);

        addScooterButton = new JButton("Add");
        clearButton = new JButton("Clear");
        displayScooterButton = new JButton("Display");
        homebtn5 = new JButton("Go to Home Page");
        buttonPanel = new JPanel();

        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));

        buttonPanel.add(addScooterButton);
        buttonPanel.add(displayScooterButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(homebtn5);

        addScooterButton.addActionListener(this);
        clearButton.addActionListener(this);
        displayScooterButton.addActionListener(this);
        homebtn5.addActionListener(this);

        form.add(title, BorderLayout.NORTH);
        form.add(formPanel, BorderLayout.CENTER);
        form.add(buttonPanel, BorderLayout.SOUTH);

        addScooterPage.add(form);

        addScooterPage.setVisible(true);
        addScooterPage.setResizable(false);
    }

    public void purchaseScooterPage() {
        purchaseScooterPage = new JFrame("Purchase an Electric Scooter");
        purchaseScooterPage.setLayout(null);

        form = new JPanel();
        form.setBounds(40, 30, 600, 250);
        form.setLayout(new BorderLayout(20, 30));

        formPanelLeft = new JPanel();
        formPanelLeft.setLayout(new GridLayout(3, 2, 5, 20));

        formPanelRight = new JPanel();
        formPanelRight.setLayout(new GridLayout(3, 2, 5, 20));

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1, 2, 60, 0));

        title = new JLabel("Purchase an Electric Scooter");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Monospaced", Font.BOLD, 20));

        vehicleID = new JLabel("Vehicle ID: ");
        brand = new JLabel("Brand: ");
        price = new JLabel("Price: ");
        chargingTime = new JLabel("Charging Time: ");
        mileage = new JLabel("Mileage: ");
        range = new JLabel("Range: ");

        vehicleIDTF = new JTextField();
        brandTF = new JTextField();
        priceTF = new JTextField();
        chargingTimeTF = new JTextField();
        mileageTF = new JTextField();
        rangeTF = new JTextField();

        formPanelLeft.add(vehicleID);
        formPanelLeft.add(vehicleIDTF);
        formPanelRight.add(brand);
        formPanelRight.add(brandTF);
        formPanelLeft.add(price);
        formPanelLeft.add(priceTF);
        formPanelRight.add(chargingTime);
        formPanelRight.add(chargingTimeTF);
        formPanelLeft.add(mileage);
        formPanelLeft.add(mileageTF);
        formPanelRight.add(range);
        formPanelRight.add(rangeTF);

        formPanel.add(formPanelLeft);
        formPanel.add(formPanelRight);

        purchaseButton = new JButton("Purchase");
        displayScooterButton = new JButton("Display");
        clearButton = new JButton("Clear");
        homebtn3 = new JButton("Go to Home Page");
        buttonPanel = new JPanel();

        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));

        buttonPanel.add(purchaseButton);
        buttonPanel.add(displayScooterButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(homebtn3);

        homebtn3.addActionListener(this);
        purchaseButton.addActionListener(this);
        clearButton.addActionListener(this);
        displayScooterButton.addActionListener(this);

        form.add(title, BorderLayout.NORTH);
        form.add(formPanel, BorderLayout.CENTER);
        form.add(buttonPanel, BorderLayout.SOUTH);

        purchaseScooterPage.add(form);

        purchaseScooterPage.setBounds(40, 10, 700, 350);
        purchaseScooterPage.setVisible(true);
        purchaseScooterPage.setResizable(false);
    }

    public void sellScooterPage() {
        sellScooterPage = new JFrame("Sell an Electric Scooter");
        sellScooterPage.setLayout(null);

        form = new JPanel();
        form.setLayout(new BorderLayout(20, 20));
        form.setBounds(20, 20, 350, 180);

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2, 2, 10, 10));

        title = new JLabel("Sell an Electric Scooter");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font("Monospaced", Font.BOLD, 16));

        vehicleID = new JLabel("Vehicle ID: ");
        price = new JLabel("Price: ");

        vehicleIDTF = new JTextField();
        priceTF = new JTextField();

        formPanel.add(vehicleID);
        formPanel.add(vehicleIDTF);
        formPanel.add(price);
        formPanel.add(priceTF);

        sellButton = new JButton("Sell");
        displayScooterButton = new JButton("Display");
        clearButton = new JButton("Clear");
        homebtn4 = new JButton("Go to Home");

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));

        buttonPanel.add(sellButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(displayScooterButton);
        buttonPanel.add(homebtn4);

        homebtn4.addActionListener(this);
        clearButton.addActionListener(this);
        sellButton.addActionListener(this);
        displayScooterButton.addActionListener(this);

        form.add(title, BorderLayout.NORTH);
        form.add(formPanel, BorderLayout.CENTER);
        form.add(buttonPanel, BorderLayout.SOUTH);

        sellScooterPage.add(form);

        sellScooterPage.setBounds(700, 30, 400, 250);
        sellScooterPage.setVisible(true);
        sellScooterPage.setResizable(false);
    }

    public void actionPerformed(ActionEvent event) {

        int vehicleID;
        String vehicleName;
        String vehicleWeight;
        String vehicleColor;
        int vehicleSpeed;
        int engineDisplacement;
        String torque;
        int fuelTankCapacity;
        String groundClearance;
        String bookedDate;
        int chargeAmount;
        int seats;
        int batteryCapacity;
        int price;
        String brand;
        String chargingTime;
        String mileage;
        int range;

        if (event.getSource() == addAuto) {
            addAutoRickshawPage();
        }

        if (event.getSource() == bookAuto) {
            bookAutoRickshawPage();
        }

        if (event.getSource() == addScooter) {
            addScooterPage();
        }

        if (event.getSource() == sellScooter) {
            sellScooterPage();
        }

        if (event.getSource() == purchaseScooter) {
            purchaseScooterPage();
        }

        outer:
        if (event.getSource() == addAutoButton) {

            try {
                vehicleID = Integer.parseInt(vehicleIDTF.getText());
                vehicleName = vehicleNameTF.getText();
                vehicleWeight = vehicleWeightTF.getText();
                vehicleColor = vehicleColorTF.getText();
                vehicleSpeed = Integer.parseInt(vehicleSpeedTF.getText());
                engineDisplacement = Integer.parseInt(engineDisplacementTF.getText());
                torque = torqueTF.getText();
                fuelTankCapacity = Integer.parseInt(fuelTankCapacityTF.getText());
                groundClearance = groundClearanceTF.getText();
                
                for (Vehicle v: vehicles) {
                    if (v instanceof AutoRickshaw) {
                        if (vehicleID == v.getVehicleID()) {
                            JOptionPane.showMessageDialog(message, "Enter a new ID", "ID already added",JOptionPane.ERROR_MESSAGE);
                            break outer;
                        }
                    }
                }
                
                AutoRickshaw auto = new AutoRickshaw(vehicleID, vehicleName, vehicleWeight, vehicleColor, vehicleSpeed, engineDisplacement, torque, fuelTankCapacity, groundClearance);
                vehicles.add(auto);
                JOptionPane.showMessageDialog(message, "Vehicle added successfully!");

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(message,
                        "Error: Please check if all fields are filled with the right data type");
            }
        }
        
        outer:
        if (event.getSource() == addScooterButton) {
            try {
                vehicleID = Integer.parseInt(vehicleIDTF.getText());
                vehicleName = vehicleNameTF.getText();
                vehicleWeight = vehicleWeightTF.getText();
                vehicleColor = vehicleColorTF.getText();
                vehicleSpeed = Integer.parseInt(vehicleSpeedTF.getText());
                batteryCapacity = Integer.parseInt(capacityTF.getText());
                
                for (Vehicle v: vehicles) {
                    if (v instanceof ElectricScooter) {
                        if (vehicleID == v.getVehicleID()) {
                            JOptionPane.showMessageDialog(message, "Enter a new ID", "ID already added",JOptionPane.ERROR_MESSAGE);
                            break outer;
                        }
                    }
                }

                ElectricScooter scooter = new ElectricScooter(vehicleID, vehicleName, vehicleWeight, vehicleSpeed, vehicleColor, batteryCapacity);

                vehicles.add(scooter);
                JOptionPane.showMessageDialog(message, "Vehicle added successfully!");

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(message,
                        "Error: Please check if all fields are filled with the right data type");
            }
        }

        outer:
        if (event.getSource() == purchaseButton) {
            try {
                vehicleID = Integer.parseInt(vehicleIDTF.getText());
                price = Integer.parseInt(priceTF.getText());
                brand = brandTF.getText();
                chargingTime = chargingTimeTF.getText();
                mileage = mileageTF.getText();
                range = Integer.parseInt(rangeTF.getText());

                for (Vehicle v : vehicles) {
                    if (v instanceof ElectricScooter) {
                        ElectricScooter scooter = (ElectricScooter) v;
                        if (scooter.getVehicleID() == vehicleID) {

                            if (scooter.getHasPurchased() == true) {
                                JOptionPane.showMessageDialog(message, "Sir, the scooter is already purchased!");
                            } else {
                                scooter.purchaseScooter(brand, price, chargingTime, mileage, range);
                                JOptionPane.showMessageDialog(message, "Scooter Purchased!");
                                break outer;
                            }
                        }
                    }
                }
                
                JOptionPane.showMessageDialog(message, "Vehicle hasn't been added.", "Invalid vehicle ID!",
                                    JOptionPane.ERROR_MESSAGE);
                                    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(message,
                        "Error: Please check if all fields are filled with the right data type");
            }
        }

        outer:
        if (event.getSource() == bookButton) {

            try {
                vehicleID = Integer.parseInt(vehicleIDTF.getText());
                bookedDate = bookedDateCombo.getSelectedItem().toString();
                chargeAmount = Integer.parseInt(chargeAmountTF.getText());
                seats = Integer.parseInt(seatsTF.getText());

                for (Vehicle v : vehicles) {
                    if (v instanceof AutoRickshaw) {
                        AutoRickshaw auto = (AutoRickshaw) v;
                        if (auto.getVehicleID() == vehicleID) {
                            JOptionPane.showMessageDialog(message, "Data Entered: \nVehicleID is " + vehicleID
                                    + "\nBooked on " + bookedDate);

                            if (auto.getIsBooked() == true) {
                                JOptionPane.showMessageDialog(message,
                                        "Sir, the auto rickshaw has already been booked!");
                            } else {
                                auto.bookAutoRickshaw(bookedDate, seats, chargeAmount);
                                JOptionPane.showMessageDialog(message, "The auto rickshaw is booked now.");
                                break outer;
                            }
                        } 
                    }
                }
                JOptionPane.showMessageDialog(message, "Vehicle hasn't been added.", "Invalid vehicle ID!",
                                    JOptionPane.ERROR_MESSAGE);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(message,
                        "Error: Please check if all fields are filled with the right data type");
            }

        }

        outer:
        if (event.getSource() == sellButton) {

            try {

                vehicleID = Integer.parseInt(vehicleIDTF.getText());
                price = Integer.parseInt(priceTF.getText());

                for (Vehicle v : vehicles) {
                    if (v instanceof ElectricScooter) {
                        ElectricScooter scooter = (ElectricScooter) v;
                        if (scooter.getVehicleID() == vehicleID) {

                            if (scooter.getHasSold() == true) {
                                JOptionPane.showMessageDialog(message, "Sir, the scooter is already sold!",
                                        "Already Sold", JOptionPane.ERROR_MESSAGE);
                            } else {
                                int input = JOptionPane.showConfirmDialog(message,
                                        "Do you really want to sell this scooter?");
                                switch (input) {
                                    case 0:
                                        scooter.sellScooter(price);
                                        JOptionPane.showMessageDialog(message, "Scooter sold successfully!");
                                        break outer;
                                    case 1:
                                        break outer;
                                    case 2:
                                        break outer;
                                }
                            }
                        }
                    }
                }
                            JOptionPane.showMessageDialog(message, "Vehicle ID not found.", "Invalid vehicle ID!",
                                    JOptionPane.ERROR_MESSAGE);
    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(message,
                        "Error: Please check if all fields are filled with the right data type");
            }
        }

        if (event.getSource() == clearButton) {
            // using my clearTextfields method to clear the text from all text fields
            clearTextFields(formPanelLeft);
            clearTextFields(formPanelRight);
            clearTextFields(formPanel);
        }

        if (event.getSource() == displayAutoButton) {
            for (Vehicle v : vehicles) {
                if (v instanceof AutoRickshaw) {
                    AutoRickshaw auto = (AutoRickshaw) v;
                    auto.display();
                }
            }
        }

        if (event.getSource() == displayScooterButton) {
            for (Vehicle v : vehicles) {
                if (v instanceof ElectricScooter) {
                    ElectricScooter scooter = (ElectricScooter) v;
                    scooter.display();
                }
            }
        }

        if (event.getSource() == homebtn1) {
            addAutoRickshawPage.setVisible(false);
        }
        if (event.getSource() == homebtn2) {
            bookAutoRickshawPage.setVisible(false);
        }
        if (event.getSource() == homebtn3) {
            purchaseScooterPage.setVisible(false);
        }
        if (event.getSource() == homebtn4) {
            sellScooterPage.setVisible(false);
        }
        if (event.getSource() == homebtn5) {
            addScooterPage.setVisible(false);
        }

    }

    // method to Clear all Text Fields in the Panels using for each loop on the
    // Components
    void clearTextFields(JPanel container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }
}