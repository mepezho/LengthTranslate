package LengthTranslate;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			Scanner scanner = new Scanner(System.in);
				
			System.out.println("Введите длину");
			double lengthTranslaten = scanner.nextDouble();
								
			System.out.println("Выберите шкалу ввода: ");
			System.out.println("1. Миллиметры ");
			System.out.println("2. Метры ");
			System.out.println("3. Сантиметры ");
			int scale = scanner.nextInt();
				
			switch (scale) {
				
			case 1: //если выбраны миллиметры
				System.out.printf("Длина в сантиметрах: %.2f\n", millimetersToCentimeters(lengthTranslaten));
				System.out.printf("Длина в метрах: %.2f\n", millimetersToMeters(lengthTranslaten));
			break;
				
			case 2: //если выбраны метры 
				System.out.printf("Длина в миллиметрах: %.2f\n", metersToMillimeters(lengthTranslaten));
				System.out.printf("Длина в сантиметрах: %.2f\n", metersToCentimeters(lengthTranslaten));
			break;
				
			case 3: //если выбраны сантиметры
				System.out.printf("Длина в миллиметрах: %.2f\n", centimetersToMillimeters(lengthTranslaten));
				System.out.printf("Длина в метрах: %.2f\n", centimetersToMeters(lengthTranslaten));
			break;
				
			default:
				System.out.println("Некорректный ввод, выберите 1, 2 или 3.");
			break;
				
			}
				
			scanner.close();
				
		}
				
			public static double millimetersToMeters(double millimeters) {
				return millimeters / 1000;
			}
				
			public static double millimetersToCentimeters(double millimeters) {
				return millimeters / 10;
			}
				
			public static double metersToMillimeters(double meters) {
				return meters * 1000;
			}
				
			public static double metersToCentimeters(double meters) {
				return meters * 100;
			}
				
			public static double centimetersToMillimeters(double centimeters) {
				return centimeters * 10;
			}
				
			public static double centimetersToMeters(double centimeters) {
				return centimeters / 100;

			}

	}


	


