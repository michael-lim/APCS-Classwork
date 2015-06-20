public class Driver {

    public static void main(String[] args) {
	Coin c = new Coin();
	c.setFlips(5);
	System.out.println(c.getFlips());
	c.reset();
	System.out.println(c.getFlips());
	c.setCoin("Quarter");
	System.out.println(c.getValue());

	Coin c1 = new Coin();
	Coin c2 = new Coin();
	Coin c3 = new Coin();

	c1.setCoin("Quarter");
	c2.setCoin("Dime");
	c3.setCoin("Penny");
	System.out.println("First coin: " + c1.getName() + " Second coin: " + c2.getName() + " Third coin: " + c3.getName());
	
	CoinPurse p = new CoinPurse();
	p.addTo(c1);
	p.addTo(c2);
	System.out.println(p.getAmount());
	p.removeFrom(c3);
	System.out.println(p.getAmount());
    }


}