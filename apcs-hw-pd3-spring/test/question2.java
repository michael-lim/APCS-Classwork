import java.io.*;
import java.util.*;
import java.lang.*;

public class question2 {
	private String input="";
	private int elapsedtime=0;
	private chore[] chorelist;

	public class chore(){
		int reqtime=0;
		chore[] tasks = null;
		int chorereq=0;
		public chore(int n1, int[] n2){
			reqtime = n1;
			tasks = n2;
		}
	}
	public question2(){
		readInput();
		writeOutput();
	}

	public void readInput(){
		File file = new File("CHORE.IN");
		try {
			Scanner sc = new Scanner(file);
			int temp = sc.nextInt();
			for(int i =0; i<temp;i++){
				chorelist[i] = new chore();
			}
			sc.close();
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public boolean isDone(chore c){
		if(elapsedtime>=c.reqtime)
			return true;
		return false;
	}

	public boolean allDone(chore[] clist){
		for(int i =0; i<clist.length; i++){
			if(!clist[i].isDone)
				return false;
		}
		return true;
	}

	public int calculateReq(chore c){
		int temp = c.reqtime;
		for(int i=0; i<c.tasks.length; i++){
			temp+=calculateReq(tasks[i]);
		}
		return temp;
	}

	public int countDown(){
		while(!allDone())
	}

	public void writeOutput(){

		PrintWriter out=null;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("CHORE.OUT")));
			
		} catch (Exception e){}
		out.close();
	}

	public static void main(String[] args) {
		question2 q = new question2();
	}
}