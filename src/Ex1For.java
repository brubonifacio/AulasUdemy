import java.util.Scanner;

public class Ex1For {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int i,impar;
		int x = 8;
		impar = 0;
		for(i=1;i<=8;i++) {
			impar = impar + 1;
			if(impar % 2 != 0 ) {
				System.out.println(impar);
			}
		}	
	}
}
