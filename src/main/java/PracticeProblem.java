import java.util.Scanner;
public class PracticeProblem {
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		System.out.println(in.nextLine());
		in.close();
	}

	public static void q2() {
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		int a = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int b = in.nextInt();
		in.nextLine();
		System.out.println(a/b);
		System.out.println(a%b);
		in.close();
	}

	public static void q3() {
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		System.out.println(in.nextLine() + " was the text you wrote");
		in.close();
	}

	public static void q4() {
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		System.out.println(in.nextInt() * 5);
		in.nextLine();
		in.close();
	}

	public static void q5() {
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		System.out.println(in.nextBoolean() + " is a boolean");
		in.nextLine();
		in.close();
	}

	public static void q6() {
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		System.out.println((in.nextDouble() - 3.2));
		in.nextLine();
		in.close();
	}

}
