import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting, sadgreeting;
    
    public Greeter() {
	setHappy("Nice to meet you");
	setSad("Go away");
    }

    public Greeter(String h, String s) {
	setHappy(h);
	setSad(s);
    }

    public void setHappy(String happy1) {
	happygreeting = happy1;
    }

    public void setSad(String sad1){
	sadgreeting = sad1;
    }

    public String happyGreet(String name){
	String message;
	message = happygreeting + " " + name;
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
}
