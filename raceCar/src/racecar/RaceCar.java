/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package racecar;

import java.util.Scanner;

/**
 *
 * @author trisha
 */
public class RaceCar {
    
    private String brand = "ISUZU";
    private String model = "SUV";
    private String year = "2017";
    private String color = "white";
    private int speed = 0;

    /**
     * @param 
     */
    
    public void getInfo() {
        System.out.println("brand: "+ brand + "\nmodel:" + model +"\nyear: "+ year + "\ncolor: " + color + "\nspeed: " + speed + " km/h");
    }
    
    public void accelerate(int value) {
        this.speed = + value;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public void breakk(int value) {
        //insert code
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        RaceCar carOne = new RaceCar();

        Scanner sc = new Scanner(System.in);
        
        int shifter=0;
        
        do{
            System.out.println("1. Accelerate\n2. Break\n3. Get current speed\n4. Get info\n5. Exit");
            shifter = sc.nextInt();
            switch(shifter){
                case 1:
                    System.out.println("Enter value of speed to be added: ");
                    int value = sc.nextInt();
                    carOne.accelerate(value);
                    
                    System.out.println("Your car's speed is increased by "+ carOne.getSpeed() + "km/h");

                    break;
                case 2:
                    //decrease speed of the car
                    //carOne.breakk() must be called
                    break;
                case 3:
                    System.out.println("Your car's current speed is: "+ carOne.getSpeed() + " km/h");
                    break;
                case 4:
                    carOne.getInfo();
                    break;
                
                default:
                    System.out.println("Enter numbers 1-5 only");
                    break;
            }
                      
      
        }while(shifter != 5);
    
    }
}
        