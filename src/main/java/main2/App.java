package main;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();

        System.out.println("Anna auton malli: ");
        String model = sc.nextLine();

        Car car = new Car(brand, model);

        boolean exit = false;
        while(!exit) {
            System.out.println( "1) Näytä auton tila" );
            System.out.println( "2) Muokkaa auton merkkiä ja mallia" );
            System.out.println( "3) Kiihdytä autoa" );
            System.out.println( "4) Hidasta autoa" );
            System.out.println( "0) Lopeta ohjelma" );
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) { //Switch case
                    case 1:
                        car.status();
                        break;
                    
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        String newBrand = sc.nextLine();
                        System.out.print("Anna uusi auton malli: ");
                        String newModel = sc.nextLine();
                        car.setBrand(newBrand);
                        car.setModel(newModel);
                        break;

                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        int increase = 0;
                        String increaseString = sc.nextLine();
                        increase = Integer.parseInt(increaseString);
                        if (increase < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        } else {
                            car.accelerate(increase);
                        }
                        break;
                        
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        int decrease = 0;
                        String decreaseString = sc.nextLine();
                        decrease = Integer.parseInt(decreaseString);
                        if (decrease < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        } else {
                            car.decelerate(decrease);
                        }
                        break;

                    case 0:
                        System.out.print("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                    }
            }
        }

        
    }
}