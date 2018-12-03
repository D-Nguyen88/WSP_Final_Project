/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

/**
 *
 * @author aaron
 */
public class Controller {
    Model model;
    int balance;
    
    
    
    public Controller(Model m) {
        model = m;
        balance = 0;
    }

    int getMoney() {
        return balance;
    }
    void setMoney(int m)
    {
        //to be implemented, connected to the model
    }
    void btnRedCarAction(View v)
    {
            v.setCurrentVehicle("/src/resources/red_car.png");
            v.setCurrentVehicleText("Red Car");
    }

    void btnBlueCarAction(View v) {
       if(model.userOwnsVehicle("blueCar"))
        {
            v.setCurrentVehicle("/src/resources/blue_car.png");
            v.setCurrentVehicleText("Blue Car");
        }
        else if(balance >= 2000)
        {
            model.purchaseVehicle("blueCar");
            balance -=2000;
            v.setCurrentVehicle("/src/resources/blue_car.png");
            v.setCurrentVehicleText("Blue Car");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
    }

    void btnGreenCarAction(View v) {
       if(model.userOwnsVehicle("greenCar"))
        {
            v.setCurrentVehicle("/src/resources/green_car.png");
            v.setCurrentVehicleText("Green Car");
        }
        else if(balance >= 3000)
        {
            model.purchaseVehicle("greenCar");
            balance -=3000;
            v.setCurrentVehicle("/src/resources/green_car.png");
            v.setCurrentVehicleText("Green Car");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
    }

    void btnPurpleCarAction(View v) {
       if(model.userOwnsVehicle("purpleCar"))
        {
            v.setCurrentVehicle("/src/resources/purple_car.png");
            v.setCurrentVehicleText("Purple Car");
        }
        else if(balance >= 4000)
        {
            model.purchaseVehicle("purpleCar");
            balance -=4000;
            v.setCurrentVehicle("/src/resources/purple_car.png");
            v.setCurrentVehicleText("purple Car");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
    }

    void btnYellowCarAction(View v) {
         if(model.userOwnsVehicle("yellowCar"))
        {
            v.setCurrentVehicle("/src/resources/yellow_car.png");
            v.setCurrentVehicleText("Yellow Car");
        }
        else if(balance >= 5000)
        {
            model.purchaseVehicle("yellowCar");
            balance -=5000;
            v.setCurrentVehicle("/src/resources/yellow_car.png");
            v.setCurrentVehicleText("Yellow Car");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
    }

    void btnRedTruckAction(View v) {
         if(model.userOwnsVehicle("redTruck"))
        {
            v.setCurrentVehicle("/src/resources/red_truck.png");
            v.setCurrentVehicleText("Red Truck");
        }
        else if(balance >= 6000)
        {
            model.purchaseVehicle("redTruck");
            balance -=6000;
            v.setCurrentVehicle("/src/resources/red_truck.png");
            v.setCurrentVehicleText("Red Truck");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
        
    }

    void btnBlueTruckAction(View v) {
        if(model.userOwnsVehicle("blueTruck"))
        {
            v.setCurrentVehicle("/src/resources/blue_truck.png");
            v.setCurrentVehicleText("Blue Truck");
        }
        else if(balance >= 7000)
        {
            model.purchaseVehicle("blueTruck");
            balance -=7000;
            v.setCurrentVehicle("/src/resources/blue_truck.png");
            v.setCurrentVehicleText("Blue Truck");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
        
    }

    void btnGreenTruckAction(View v) {
        if(model.userOwnsVehicle("greenTruck"))
        {
            v.setCurrentVehicle("/src/resources/green_truck.png");
            v.setCurrentVehicleText("Green Truck");
        }
        else if(balance >= 8000)
        {
            model.purchaseVehicle("greenTruck");
            balance -=8000;
            v.setCurrentVehicle("/src/resources/green_truck.png");
            v.setCurrentVehicleText("Green Truck");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
        
    }

    void btnPurpleTruckAction(View v) {
        if(model.userOwnsVehicle("purpleTruck"))
        {
            v.setCurrentVehicle("/src/resources/purple_truck.png");
            v.setCurrentVehicleText("Purple Truck");
        }
        else if(balance >= 9000)
        {
            model.purchaseVehicle("purpleTruck");
            balance -=9000;
            v.setCurrentVehicle("/src/resources/purple_truck.png");
            v.setCurrentVehicleText("Purple Truck");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
        
    }

    void btnYellowTruckAction(View v) {
        if(model.userOwnsVehicle("yellowTruck"))
        {
            v.setCurrentVehicle("/src/resources/yellow_truck.png");
            v.setCurrentVehicleText("Yellow Truck");
        }
        else if(balance >= 10000)
        {
            model.purchaseVehicle("yellowTruck");
            balance -=10000;
            v.setCurrentVehicle("/src/resources/yellow_truck.png");
            v.setCurrentVehicleText("Yellow Truck");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
        
    }
}
