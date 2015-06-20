import java.io.*;
import java.util.*;

public class CoinPurse {
    private int amount;
    
    public void CoinPurse() {
    }

    public void setAmount(int n) {
	amount = n;
    }

    public void addTo(Coin c) {
	amount = amount + c.getValue();
    }

    public void removeFrom(Coin c) {
	amount = amount - c.getValue();
    }

    public int getAmount() {
	return amount;
    }

}