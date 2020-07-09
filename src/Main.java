
public class Main {
	public static void main(String[] args) {
		int age = 30;
		System.out.println("私の年齢は"+ age +"歳です");
		age = 24;
		System.out.println("嘘をつきました。本当は"+ age +"歳です");
		final int num = 5;
		// int num = 4; 書き換えることができないためエラーになる。
	}
}