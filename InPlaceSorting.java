import java.util.ArrayList;
import java.util.Scanner;

class main{
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>();
		int i = 0;
		Scanner in = new Scanner(System.in);

		do {
			Scanner in2 = new Scanner(System.in);

			System.out.println("Want to continue ? (y/n)");
			String c = in2.nextLine();

			if (c.startsWith("y")) {
				System.out.println("Enter Element Number " + (++i) + ": ");
				int getVal = in.nextInt();
				arr.add(getVal);
			} else {

				break;
			}
		} while (true);

		for (int j = 0; j < arr.size(); j++) {
			System.out.print(arr.get(j) + " ");
		}
		System.out.println(" ");
		System.out.println("enter first index number to be swapped: ");
		int a = in.nextInt();
		System.out.println("enter second index number to be swapped: ");
		int b = in.nextInt();
		arr = swap (arr, a, b);
		for (int k = 0; k < arr.size(); k++) {
			System.out.print(arr.get(k) + " ");
		}

	}

	public static ArrayList<Integer> swap(ArrayList<Integer> arrayL, int a, int b) {
		int n1 = arrayL.get(a-1);
		int n2 = arrayL.get(b-1);

		n1 = n2 - n1;
		n2 = n2 - n1;
		n1 = n1 + n2;
		arrayL.add(a-1, n1);
		arrayL.remove(a);

		arrayL.add(b-1, n2);
		arrayL.remove(b);
		
		return arrayL;
	}

}
