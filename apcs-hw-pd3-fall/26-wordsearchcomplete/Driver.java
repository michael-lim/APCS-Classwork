import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch2 w = new WordSearch2();
	for (int i = 0; i<20; i++){
	    while(!w.tryToAddWord());
	}
	System.out.println(w);
	w.fillIn();
	System.out.println(w);
    }
}
