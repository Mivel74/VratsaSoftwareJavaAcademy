import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[1000];
		System.out.print("Enter the number of days: ");
		int days = input.nextInt();
		if (days < 0)
			System.out.println("This is not a valid number!");   //проверка на валидността на броят на дните
		int[] b = new int[days];   //инициализиране на втори масив, в който ще се съдържа резултатът
		for (int i = 0; i < days; i++) {
			System.out.println("Enter the number of activities and the position of an activity you want to see.");
			System.out.println("The position is calculated according to the duration of the activities, from the longest to the shortest.");
			System.out.print("Number of activities and position for day "+ (i + 1) + ": ");         //въвеждане на N и К
			int n = input.nextInt();
			int k = input.nextInt();
			if(k<=0&&n<=0){
				System.out.println("This is not a valid number!");
			}
			if (k > n) {
				System.out.println("This is not a valid position!");     //проверка на валидността на K
			} else {
				for (int j = 0; j < n; j++) {
					System.out.print("Enter the duration of activity "+ (j + 1) + " of day " + (i + 1) + ": ");
					a[j] = input.nextInt();   //въвеждане на масив от N числа
				}
				for (int h = 0; h < n; h++)
					for (int l = 1; l < n - h; l++)
						if (a[l - 1] < a[l]) {
							int swap = a[l - 1];      //сортиране на въведеният масив по метода на мехурчето
							a[l - 1] = a[l];
							a[l] = swap;
						}
				b[i] = a[k-1];     //вторият масив присвоява стойността на желаната позиция K за извеждане по-късно
			}
		}
		for (int v = 0; v < days; v++)
			System.out.println(b[v]);  //извеждане на окончателните резултати
	}
}