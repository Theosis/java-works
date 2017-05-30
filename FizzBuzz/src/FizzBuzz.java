
public class FizzBuzz {

	public static void main(String[] args) {

		String msg;
		for (int i=1; i<101; i++) {
			msg="";
			if (i%2 == 0) {msg += "Copy";}
			if (i%3 == 0) {msg += "Fizz";}
			if (i%5 == 0) {msg += "Buzz";}
			if (i%10 == 0) {msg += "Cat";}
			if (msg.equals("")) {msg= "" + i;}
			System.out.println(msg);
			}
	}

}
