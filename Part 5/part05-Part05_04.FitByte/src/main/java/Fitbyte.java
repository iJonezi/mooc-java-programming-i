/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jones
 */
public class Fitbyte {
    private int age;
    private int heartrate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.heartrate = restingHeartRate;
    }
    
    public double maximumHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (maximumHeartRate() - this.heartrate) * (percentageOfMaximum) + this.heartrate;
    }
}
