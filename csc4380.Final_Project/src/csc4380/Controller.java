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
        balance = m.getBalance();
    }

    int getMoney() {
        return model.getBalance();
    }
    void setMoney(int m)
    {
        model.setBalance(m);
    }
    
    void setLastScore(int s)
    {
        model.addNewScore(s);
    }    
        //to be implemented, connected to the model
        
    
    void highScore(){
       // model.getHighScore();
       
        
    }
    
    void btnDeleteAction(View v){
        model.getCurrent_user();
        model.deleteUser();
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
        else if(model.getBalance() >= 2000)
        {
            model.purchaseVehicle("blueCar");
            model.setBalance(model.getBalance()-2000);
            v.updateMoney();
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
        else if(model.getBalance() >= 3000)
        {
            model.purchaseVehicle("greenCar");
            model.setBalance(model.getBalance()-3000);
            v.updateMoney();
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
        else if(model.getBalance() >= 4000)
        {
            model.purchaseVehicle("purpleCar");
            model.setBalance(model.getBalance()-4000);
            v.updateMoney();
            v.setCurrentVehicle("/src/resources/purple_car.png");
            v.setCurrentVehicleText("Purple Car");
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
        else if(model.getBalance() >= 5000)
        {
            model.purchaseVehicle("yellowCar");
            model.setBalance(model.getBalance()-5000);
            v.updateMoney();
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
        else if(model.getBalance() >= 6000)
        {
            model.purchaseVehicle("redTruck");
            model.setBalance(model.getBalance()-6000);
            v.updateMoney();
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
        else if(model.getBalance() >= 7000)
        {
            model.purchaseVehicle("blueTruck");
            model.setBalance(model.getBalance()-7000);
            v.updateMoney();
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
        else if(model.getBalance() >= 8000)
        {
            model.purchaseVehicle("greenTruck");
            model.setBalance(model.getBalance()-8000);
            v.updateMoney();
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
        else if(model.getBalance() >= 9000)
        {
            model.purchaseVehicle("purpleTruck");
            model.setBalance(model.getBalance()-9000);
            v.updateMoney();
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
        else if(model.getBalance() >= 10000)
        {
            model.purchaseVehicle("yellowTruck");
            model.setBalance(model.getBalance()-10000);
            v.updateMoney();
            v.setCurrentVehicle("/src/resources/yellow_truck.png");
            v.setCurrentVehicleText("Yellow Truck");
        }
        else {
            System.out.println("You don't have enough money to complete this purchase");
        }
        
    }
    
    
    
    
    
    String getCurrentUser()
    {
        return model.getCurrent_user();
    }
}
