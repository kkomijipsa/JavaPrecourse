import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) {
		// 8, 9단
		System.out.println("구구단을 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);
		
		if(number < 2) {
			System.out.println("값을 잘못 입력했습니다.");
		} else if(number > 9) {
			System.out.println("값을 잘못 입력했습니다.");
		} else {
		for(int i=1; i<10; i++) {
			System.out.println(number * i);
		}
		}
		}
		}