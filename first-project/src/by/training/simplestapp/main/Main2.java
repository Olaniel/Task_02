package by.training.simplestapp.main;

public class Main2 {

	public static void main(String[] args) {
		int year = 0, month = 0, numberOfDays = 0;
		year = 2021;
		month = 2;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDays = 31;
			break;
		case 2:
	        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				numberOfDays = 29;
			} else {
				numberOfDays = 28;
			}
				break;
		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDays = 30;
			break;
		}

		System.out.println("Количество дней равно - " + numberOfDays);


	}

}
