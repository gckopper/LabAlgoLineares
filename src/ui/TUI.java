package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class TUI extends UserInterface{
    private static final ResourceBundle configBundle = ResourceBundle.getBundle("ui.Menu");

    @Override
    public String inputLine() {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));  
        try {
            return obj.readLine();
        } catch (IOException e) {
            System.err.println(configBundle.getString("IOException"));
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
        } catch (NumberFormatException e) {
            System.err.println(configBundle.getString("NumberFormatException"));
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public void output(String text) {
        System.out.println(text);
    }
    
}
