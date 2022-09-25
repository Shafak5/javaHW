package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'E';
		
		switch (grade) {
		case 'A':
			System.out.println("A ile geçtiniz");
			break;
		case'B':
			System.out.println("B ile geçtiniz");
			break;
		case 'C':
			System.out.println("C ile geçtiniz");
			break;
		case 'D':
		case 'E':
			System.out.println("şartlı geçtiniz");
			break;
		case 'F':
			System.out.println("kaldınız");
			break;
		default:
			System.out.println("geçersiz not girdiniz");
		}

	}

}
