package io.stevejamison;

import java.util.Scanner;
/**
 * Created by stevejaminson on 4/30/16.
 */




public class Display {

    public static void main(String[]args){

    }


    Scanner input = new Scanner(System.in);
    public boolean error = false;
    public boolean test = false;
    public int operator = 100;
    public double currentVal = 0;
    private double secondNum = 0;
    public double memory = 0;
    public int dispMode = 4;
    private String errorMsg = "Err \nPress '333' to clear the error.";
    private String help = "Enter '99' to see a list of operators.";


    /**
     * Takes user input to set the current number and returns that value.
     * @return
     */
    public void setCurrentVal(){

        System.out.println("Enter your first number: ");
        currentVal = input.nextDouble();
    }

    /**
     * Returns the current number.
     */
    public double getCurrentVal(){
        if(test){
            currentVal = 15;
            return currentVal;
        } else {
            return currentVal;
        }
    }

    /**
     * Display the current number.
     */
    public void displayCurrent(){

        System.out.println("Display: " + currentVal);

    }

    /**
     * Takes user input to get the operator for the next action.
     */
    public void setOperator(){

        operator = input.nextInt();
    }

    /**
     * Returns operator.
     * @return
     */
    public int getOperator(){

        return operator;
    }

    /**
     * Takes user input to set the second number if required and returns that number.
     * @return
     */
    public double setSecondNum(){

        secondNum = input.nextDouble();
        return secondNum;
    }

    /**
     * Returns second number.
     * @return
     */
    public double getSecondNum(){
        if(test){
            secondNum = 5;
            return secondNum;
        } else {
            return secondNum;
        }
    }

    /**
     * Clears display and sets it back to zero unless there is an error.
     */
    public void clearDisplay(){

        if(error){
            System.out.println("Must select 'Clear Error' operator to clear the error");
        } else {
            currentVal = 0;
            operator = 100;
        }
    }

    /**
     * Prints error message.
     */
    public void error(){

        error = true;
        System.out.println(errorMsg);
    }

    /**
     * Clears an error message.
     */
    public void clearError(){

        currentVal = 0;
        operator = 100;
        error = false;
        System.out.println("Error has been cleared.");
    }

    /**
     * Check for error values.
     */
    public void checkForError(){

        if(currentVal == Double.POSITIVE_INFINITY || currentVal == Double.NEGATIVE_INFINITY || Double.isNaN(currentVal)){
            error();
        }
    }

    /**
     * Adds current value to memory, stores new value in memory, and updates display.
     * @return
     */
    public double addToMemory(){

        memory += currentVal;
        currentVal = memory;
        System.out.println("Current memory value: " + memory);
        return currentVal;
    }

    /**
     * Resets memory to 0.
     * @return
     */
    public double resetMemory(){

        memory = 0;
        return memory;
    }

    /**
     * Recalls number from memory and sets it as the current value in the display.
     * @return
     */
    public double callMemory(){

        currentVal = memory;

        return currentVal;
    }

    /**
     * Displays current number in binary.
     */
    public void displayToBinary(){

        System.out.println("Display in binary: " + Long.toBinaryString(Double.doubleToRawLongBits(currentVal)));
        dispMode = 1;
    }

    /**
     * Displays current number in octal.
     */
    public void displayToOctal(){

        System.out.println("Display in octal: " + Long.toOctalString(Double.doubleToRawLongBits(currentVal)));
        dispMode = 2;
    }

    /**
     * Displays current number in decimal.
     */
    public void displayToDecimal(){

        System.out.println("Display in decimal: " + currentVal);
        dispMode = 4;
    }

    /**
     * Displays current number in hexadecimal.
     */
    public void displayToHex(){

        System.out.println("Display in hexadecimal: " + Long.toHexString(Double.doubleToRawLongBits(currentVal)));
        dispMode = 3;
    }

    /**
     * Cycles through display modes.
     */
    public void switchDisplayMode(){

        if(dispMode == 4){
            displayToBinary();
        } else if(dispMode == 1){
            displayToOctal();
        } else if(dispMode == 2){
            displayToHex();
        } else if(dispMode == 3){
            displayToDecimal();
        }

    }

}
