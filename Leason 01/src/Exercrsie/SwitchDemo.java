package Exercrsie;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = (int)(Math.random()*10)+1;
		System.out.println(day);
		
		switch(day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("teusaday");
			break;
		case 4:
			System.out.println("wensday");
			break;
		case 5:
			System.out.println("tursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("Shabbes");
			default:
				System.out.println("the Value" + day+ " is not a valid day good");
		}
		

	}

}
