package MsgBoyuHesaplama;

public class Msg {

	public static void main(String[] args) {
		String msg = "Lorem ipsum dolor sit amet consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna, test 321 sint occeecat cupi datat non proident sunt in culpa, qui officia deserunt mollit  ";
		double smsLength = (int) Math.ceil(msg.length() / 160.0);
		System.out.println("Mesajınız: " + msg.length() + " Karakterden oluşuyor ve " + smsLength + " SMS'e bölünebilir.");

	}

}
