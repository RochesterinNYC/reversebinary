import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int query = input.nextInt();
		BinaryProcessor binary = new BinaryProcessor(query);
		binary.checkMaxPower();
		binary.formBinary();
		System.out.println(binary.reversedBinary());
		
	}

}
