import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		in.close();
	}

	public static void q1() {
		System.out.print("In: ");
		System.out.println(in.nextLine());
	}

	public static void q2() {
		System.out.print("In: ");
		int a = in.nextInt();
		int b = in.nextInt();
		in.nextLine();
		System.out.println(a/b);
		System.out.println(a%b);
	}

	public static void q3() {
		System.out.print("In: ");
		System.out.println(in.nextLine() + " was the text you wrote");
	}

	public static void q4() {
		System.out.print("In: ");
		System.out.println(in.nextInt() * 5));
		in.nextLine();
	}

	public static void q5() {
		System.out.print("In: ");
		System.out.println(in.nextBoolean());
		in.nextLine();
	}

	public static void q6() {
		System.out.print("In: ");
		System.out.println(in.nextDouble());
		in.nextLine();
	}

}
