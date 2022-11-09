package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TUI extends UserInterface{

    @Override
    public String inputLine() {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));  
        try {
            return obj.readLine();
        } catch (IOException e) {
            System.err.println(e);
        }
        return null;
    }

    @Override
    public char inputChar() {
        return inputLine().charAt(0);
    }

    @Override
    public int inputInt() {
        try {
            return Integer.parseInt(inputLine());
        } catch (Exception e) {
            System.err.println(e);
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public void output(String text) {
        System.out.println(text);
    }
    
}
