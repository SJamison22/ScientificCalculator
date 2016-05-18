package io.stevejamison;
import java.util.*;

/**
 * Created by stevejaminson on 4/29/16.
 */
public class Calculator {


    private boolean exit = false;
    private boolean basExit = false;
    private boolean dispExit = false;
    private boolean trigExit = false;
    private boolean logExit = false;
    private boolean degrees = false;
    private double factorial;
    private double tool;
    Display display = new Display();
    private OpMaps oplist = new OpMaps();
    Scanner getIn = new Scanner(System.in);

    /**
     * Returns current number added to second number.
     *
     * @return
     */
    public double add() {

        System.out.println("Enter a number to add to " + display.getCurrentVal() + ": ");
        if (!display.test) {
            display.setSecondNum();
        }
        display.currentVal = display.getCurrentVal() + display.getSecondNum();
        return display.currentVal;
    }

    /**
     * Returns second number subtracted from current number.
     *
     * @return
     */
    public double subtract() {

        System.out.println("Enter a number to subtract from " + display.getCurrentVal() + ": ");
        if (!display.test) {
            display.setSecondNum();
        }
        display.currentVal = display.getCurrentVal() - display.getSecondNum();
        return display.currentVal;
    }

    /**
     * Returns current number multiplied by second number.
     *
     * @return
     */
    public double multiply() {

        System.out.println("Enter a number to multiply " + display.getCurrentVal() + " by: ");
        if (!display.test) {
            display.setSecondNum();
        }
        display.currentVal = display.getCurrentVal() * display.getSecondNum();
        return display.currentVal;
    }

    /**
     * Returns current number divided by second number.
     *
     * @return
     */
    public double divide() {

        System.out.println("Enter a number to divide " + display.getCurrentVal() + " by: ");
        if (!display.test) {
            display.setSecondNum();
        }

        display.currentVal = display.getCurrentVal() / display.getSecondNum();

        return display.currentVal;
    }

    /**
     * Returns the square of the current number.
     *
     * @return
     */
    public double square() {

        display.currentVal = display.getCurrentVal() * display.getCurrentVal();
        return display.currentVal;
    }

    /**
     * Returns the square root of the current number.
     *
     * @return
     */
    public double squareRoot() {

        display.currentVal = Math.sqrt(display.getCurrentVal());
        return display.currentVal;
    }

    /**
     * Returns the current number to the power of the second number.
     *
     * @return
     */
    public double exponent() {

        System.out.println("To what power would you like to raise " + display.getCurrentVal() + " : ");
        if (!display.test) {
            display.setSecondNum();
        }
        display.currentVal = Math.pow(display.getCurrentVal(), display.getSecondNum());
        return display.currentVal;
    }

    /**
     * Returns the inverse of the current number.
     *
     * @return
     */
    public double inverse() {

        display.currentVal = 1 / display.getCurrentVal();
        return display.currentVal;
    }

    /**
     * Returns the current number with the sign inverted.
     *
     * @return
     */
    public double invertSign() {

        display.currentVal = display.getCurrentVal() * -1;
        return display.currentVal;
    }

    /**
     * Returns the sine of current number.
     *
     * @return
     */
    public double sine() {

        if(degrees){
            display.currentVal = Math.sin(display.currentVal*(Math.PI/180));
        } else {
            display.currentVal = Math.sin(display.getCurrentVal());
        }
        return display.currentVal;
    }

    /**
     * Returns the cosine of current number.
     *
     * @return
     */
    public double cosine() {

        if(degrees){
            display.currentVal = Math.cos(display.currentVal*(Math.PI/180));
        } else {
            display.currentVal = Math.cos(display.getCurrentVal());
        }
        return display.currentVal;
    }

    /**
     * Returns tangent of current number.
     *
     * @return
     */
    public double tangent() {

        if(degrees){
            display.currentVal = Math.tan(display.currentVal*(Math.PI/180));
        } else {
            display.currentVal = Math.tan(display.getCurrentVal());
        }
        return display.currentVal;
    }

    /**
     * Returns inverse sine of current number.
     *
     * @return
     */
    public double invSine() {

        if(degrees){
            display.currentVal = Math.asin(display.currentVal*(Math.PI/180));
        } else {
            display.currentVal = Math.asin(display.getCurrentVal());
        }
        return display.currentVal;
    }

    /**
     * Returns inverse cosine of current number.
     *
     * @return
     */
    public double invCosine() {

        if(degrees){
            display.currentVal = Math.acos(display.currentVal*(Math.PI/180));
        } else {
            display.currentVal = Math.acos(display.getCurrentVal());
        }
        return display.currentVal;
    }

    /**
     * Returns inverse tangent of current number.
     *
     * @return
     */
    public double invTangent() {

        if(degrees){
            display.currentVal = Math.atan(display.currentVal*(Math.PI/180));
        } else {
            display.currentVal = Math.atan(display.getCurrentVal());
        }
        return display.currentVal;
    }

    /**
     * Returns log10 of current number.
     * @return
     */
    public double log(){

        display.currentVal = (Math.log10(display.getCurrentVal()));
        return display.currentVal;
    }

    /**
     * Returns the natural log of the current number.
     * @return
     */
    public double naturalLog(){

        display.currentVal = Math.log(display.getCurrentVal());
        return display.currentVal;
    }

    /**
     * Returns the inverse log of the current number.
     * @return
     */
    public double invLog(){

        display.currentVal = Math.pow(10, display.getCurrentVal());
        return display.currentVal;
    }

    /**
     * Returns the inverse natural log of the current number.
     * @return
     */
    public double invNaturalLog(){

        display.currentVal = Math.exp(display.getCurrentVal());
        return display.currentVal;
    }

    /**
     * Toggles trig setting for Degree/Radian.
     */
    public void toggleDeg(){

        if(degrees){
            degrees = false;
        } else {
            degrees = true;
        }
    }

    public double factorial(){

        factorial = display.currentVal;
        tool = display.currentVal;
        while(tool > 1){
            factorial *= (tool-1);
            tool--;
        }
        display.currentVal = factorial;
        return factorial;
    }

    /**
     * Run Program.
     */
    public void run() {
        while (!exit) {

            if (display.currentVal == 0) {
                display.displayCurrent();
                display.setCurrentVal();
            }

            if (display.getCurrentVal() != 0 && display.getOperator() != 0 && !display.error) {
                display.displayCurrent();
                System.out.println(oplist.commandList());
                int first = getIn.nextInt();
                basExit = false;
                trigExit = false;
                dispExit = false;
                switch (first) {
                    case 1:
                        while (!basExit) {
                            if(display.currentVal == 0){
                                display.displayCurrent();
                                display.setCurrentVal();
                            }

                            display.checkForError();
                            while(display.error){
                                display.setOperator();
                                    if(display.operator == 333){
                                        display.clearError();
                                    }
                            }

                            display.displayCurrent();
                            System.out.println(oplist.getBasicOps());
                            int second = getIn.nextInt();
                            switch (second) {
                                case 1:
                                    add();
                                    break;
                                case 2:
                                    subtract();
                                    break;
                                case 3:
                                    multiply();
                                    break;
                                case 4:
                                    divide();
                                    break;
                                case 5:
                                    square();
                                    break;
                                case 6:
                                    squareRoot();
                                    break;
                                case 7:
                                    exponent();
                                    break;
                                case 8:
                                    inverse();
                                    break;
                                case 9:
                                    invertSign();
                                    break;
                                case 10:
                                    basExit = true;
                                    break;
                                case 101:
                                    System.out.println("Goodbye");
                                    basExit = true;
                                    exit = true;
                                    break;
                                case 999:
                                    display.clearDisplay();
                                    break;
                            }
                        }
                        break;

                    case 2:
                        while(!trigExit) {
                            if(display.currentVal == 0){
                                display.displayCurrent();
                                display.setCurrentVal();
                            }

                            display.checkForError();
                            while(display.error){
                                display.setOperator();
                                if(display.operator == 333){
                                    display.clearError();
                                }
                            }

                            display.displayCurrent();
                            System.out.println(oplist.getTrigOps());
                            int third = getIn.nextInt();
                            switch (third) {
                                case 1:
                                    sine();
                                    break;
                                case 2:
                                    cosine();
                                    break;
                                case 3:
                                    tangent();
                                    break;
                                case 4:
                                    invSine();
                                    break;
                                case 5:
                                    invCosine();
                                    break;
                                case 6:
                                    invTangent();
                                    break;
                                case 7:
                                    toggleDeg();
                                    break;
                                case 8:
                                    trigExit = true;
                                    break;
                                case 101:
                                    System.out.println("Goodbye");
                                    trigExit = true;
                                    exit = true;
                                    break;
                                case 999:
                                    display.clearDisplay();
                                    break;
                            }
                        }
                        break;

                    case 3:
                        while(!logExit) {
                            if(display.currentVal == 0){
                                display.displayCurrent();
                                display.setCurrentVal();
                            }

                            display.checkForError();
                            while(display.error){
                                display.setOperator();
                                if(display.operator == 333){
                                    display.clearError();
                                }
                            }

                            display.displayCurrent();
                            System.out.println(oplist.getLogOps());
                            int fourth = getIn.nextInt();
                            switch (fourth) {
                                case 1:
                                    log();
                                    break;
                                case 2:
                                    invLog();
                                    break;
                                case 3:
                                    naturalLog();
                                    break;
                                case 4:
                                    invNaturalLog();
                                    break;
                                case 5:
                                    logExit = true;
                                    break;
                                case 101:
                                    System.out.println("Goodbye");
                                    logExit =true;
                                    exit = true;
                                    break;
                                case 999:
                                    display.clearDisplay();
                                    break;
                            }
                        }
                        break;


                    case 4:

                        while (!dispExit) {

                            if(display.currentVal == 0){
                                display.displayCurrent();
                                display.setCurrentVal();
                            }

                            display.checkForError();
                            while(display.error){
                                display.setOperator();
                                if(display.operator == 333){
                                    display.clearError();
                                }
                            }

                            display.displayCurrent();
                            System.out.println(oplist.displayOptions());
                            int fifth = getIn.nextInt();
                            switch (fifth) {
                                case 1:
                                    display.switchDisplayMode();
                                    break;
                                case 2:
                                    toggleDeg();
                                    break;
                                case 3:
                                    dispExit = true;
                                    break;
                                case 101:
                                    dispExit = true;
                                    exit = true;
                                    System.out.println("Goodbye");
                                    break;
                                case 999:
                                    display.clearDisplay();
                                    break;
                            }
                        }

                        break;


                    case 5:
                        System.out.println(oplist.memoryOptions());
                        int sixth = getIn.nextInt();
                        switch(sixth){
                            case 1:
                                display.addToMemory();
                                break;
                            case 2:
                                display.resetMemory();
                                break;
                            case 3:
                                display.callMemory();
                                break;
                            case 101:
                                System.out.println("Goodbye");
                                exit = true;
                                break;
                            case 999:
                                display.clearDisplay();
                                break;
                        }
                        break;

                    case 6:
                        factorial();
                        break;

                    case 101:
                        System.out.println("Goodbye");
                        exit = true;
                        break;
                    case 999:
                        display.clearDisplay();
                        break;
                }

            }

        }

    }
}
