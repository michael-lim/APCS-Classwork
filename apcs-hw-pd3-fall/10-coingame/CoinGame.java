import java.io.*;
import java.util.*;

public class CoinGame {
    private double pot;
    private BankAccount p1, p2;
    private Coin c1, c2;
    private int count;
    private double totalpot;
    private boolean canplay;

    public CoinGame(BankAccount a, BankAccount b) {
	p1 = a;
	p2 = b;
	c1 = new Coin();
	c2 = new Coin();
	p1.deposit(1000.0);
	p2.deposit(1000.0);
	totalpot = 0;
	pot = 100.0;
	count = 1;
	canplay = true;
    } 

    public void turn() {
	if (p1.getBalance() < pot || p2.getBalance() < pot) {
	    System.out.println("Cannot play.");
	    canplay = false;
	} else {
	    p1.withdraw(pot);
	    p2.withdraw(pot);
	    totalpot = totalpot + 2*pot;
	    c1.flip();
	    c2.flip();
	    count = count+1;
	    
	    if (c1.getFace() == 1 && c2.getFace() == 1) {
		p1.deposit(totalpot);
		System.out.println(p1.getName() + " Won!");
		totalpot = 0;
	    } else if (c1.getFace() == 0 && c2.getFace() == 0) {
		p2.deposit(totalpot);
		System.out.println(p2.getName() + " Won!");
		totalpot = 0;
	    }	else
		    System.out.println("Nobody won.") ;
	    }
    }

    public void play(int n) {
	while (n > 0 && canplay) {
	    n = n - 1;
	    System.out.println("Turn " + count);
	    printStatus();
	    turn();
	}
    }

    public void printStatus() {
	System.out.println(p1.getName() + " " + p1.getBalance() + p2.getName() + " " +  p2.getBalance());
	System.out.println("Current pot: " + totalpot + " Pot: " + pot);
	System.out.println();
    }

    public static void main(String[] args) {
	BankAccount p1 = new BankAccount("Michael", 1);
	BankAccount p2 = new BankAccount("Jason", 2);
	CoinGame cg = new CoinGame(p1, p2);
	cg.play(21);



    }

    
}
