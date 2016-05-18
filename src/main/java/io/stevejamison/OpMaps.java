package io.stevejamison;
import java.util.*;

/**
 * Created by stevejaminson on 5/1/16.
 */
public class OpMaps {


    SortedMap<Integer, String> commandList = new TreeMap<Integer, String>();

    public SortedMap<Integer, String> commandList() {
        commandList.put(1, "Basic Operators");
        commandList.put(2, "Trig Functions");
        commandList.put(3, "Logarithmic Functions");
        commandList.put(4, "Display Options");
        commandList.put(5, "Memory Options");
        commandList.put(6, "Factorial");
        commandList.put(101, "Exit Calculator");
        commandList.put(999, "Clear Display");

        return commandList;
    }

    SortedMap<Integer, String> basicOps = new TreeMap<Integer, String>();

    public SortedMap<Integer, String> getBasicOps() {
        basicOps.put(1, "Add");
        basicOps.put(2, "Subtract");
        basicOps.put(3, "Multiply");
        basicOps.put(4, "Divide");
        basicOps.put(5, "Square");
        basicOps.put(6, "Square Root");
        basicOps.put(7, "Exponent");
        basicOps.put(8, "Inverse");
        basicOps.put(9, "Invert Sign");
        basicOps.put(10, "Exit Basic Operatros");
        basicOps.put(101, "Exit Calculator");
        basicOps.put(999, "Clear Display");

        return basicOps;
    }

    SortedMap<Integer, String> trigOps = new TreeMap<Integer, String>();

    public SortedMap<Integer, String> getTrigOps() {
        trigOps.put(1, "Sine");
        trigOps.put(2, "Cosine");
        trigOps.put(3, "Tangent");
        trigOps.put(4, "Inverse Sine");
        trigOps.put(5, "Inverse Cosine");
        trigOps.put(6, "Inverse Tangent");
        trigOps.put(7, "Toggle Degrees/Radians");
        trigOps.put(8, "Exit Trig Functions");
        trigOps.put(101, "Exit Calculator");
        trigOps.put(999, "Clear Display");

        return trigOps;
    }

    SortedMap<Integer, String> logOps = new TreeMap<Integer, String>();

    public SortedMap<Integer, String> getLogOps() {
        logOps.put(1, "Log");
        logOps.put(2, "10^x (Inverse Log)");
        logOps.put(3, "Ln (Natural Logarithm)");
        logOps.put(4, "e^x (Inverse Natural Logarithm)");
        logOps.put(5, "Exit logarithm Functions");
        logOps.put(101, "Exit Calculator");
        logOps.put(999, "Clear Display");

        return logOps;
    }

    SortedMap<Integer, String> memoryOptions = new TreeMap<Integer, String>();

    public SortedMap<Integer, String> memoryOptions() {
        memoryOptions.put(1, "(M+) Add Current Display to Memory");
        memoryOptions.put(2, "(MC) Reset Memory to 0");
        memoryOptions.put(3, "(MRC) Recall Value From Memory");
        memoryOptions.put(101, "Exit Calculator");
        memoryOptions.put(999, "Clear Display");

        return memoryOptions;
    }

    SortedMap<Integer, String> displayOptions = new TreeMap<Integer, String>();

    public SortedMap<Integer, String> displayOptions() {
        displayOptions.put(1, "Cycle Through Displays");
        displayOptions.put(2, "Toggle Degrees/Radians");
        displayOptions.put(3, "Exit Display Mode");
        displayOptions.put(101, "Exit Calculator");
        displayOptions.put(999, "Clear Display");

        return displayOptions;
    }
}
