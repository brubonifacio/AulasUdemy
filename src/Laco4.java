import java.util.Scanner;

public class Laco4 {



	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int i,n,m = 0;
	        int x = 10;
	        

	        for(i=1; i<=10; i++) {
	            System.out.println("Digite um número ai bostão: ");
	            n = sc.nextInt();

	            if(n>m) {
	                n = m;
	            }
	        }
	        System.out.println("O maior número é : " + m);
	    }

	}