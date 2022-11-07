package ui;

public abstract class Interface {
    public String inputLine(){
        return null;
    }
    public char inputChar(){
        return 0;
    }
    public int inputInt(){
        return 0;
    }
    public void output(String text) {}
    public String question(boolean lock, String prompt, String... acceptable) {
        String awnser;
        do {
            output(prompt);
            awnser = inputLine();
            for (String accept : acceptable) {
                if (awnser.equals(accept)) {
                    lock = false;
                    break;
                }
            }
        } while (lock);
        return awnser;
    }
    public String question(String prompt, String... acceptable) {
        return question(true, prompt, acceptable);
    }
}
