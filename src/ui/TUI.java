package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TUI extends Interface{

    @Override
    public String inputLine() {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));  
        try {
            return obj.readLine();
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    @Override
    public char inputChar() {
        return inputLine().charAt(0);
    }

    @Override
    public int inputInt() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void output(String text) {
        // TODO Auto-generated method stub
        
    }
    
}
