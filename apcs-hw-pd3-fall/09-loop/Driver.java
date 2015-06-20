public class Driver {
    public static void main(String[] args) {
	Loop l = new Loop();
	//collaboration with Jason Huang and Isaac Gluck
	System.out.println(l.fact(7));
	System.out.println(l.fact2(7));
	System.out.println(l.gcd(12,8));
	System.out.println(l.gcd2(12,8));

	System.out.println(l.isPrime(2));
	System.out.println(l.isPrime(83));
	System.out.println(l.isPrime(75));
    }
}
