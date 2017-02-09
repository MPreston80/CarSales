import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       String userinput = "yes";

           ArrayList<Car> carList = new ArrayList<Car>();
           carList.add(new Car("Ford", "Explorer", 2016, 27999.99));
           carList.add(new Car("Jeep", "Patriot", 2016, 36998.99));
           carList.add(new Car("Jeep", "Cherokee", 2017, 42998.99));
           carList.add(new Car("Chevy", "Suburban", 2016, 56998.99));
           carList.add(new UsedCar("Chevy", "Camero", 2008, 11500.00, 78000));
           carList.add(new UsedCar("Ford", "Focus", 2009, 8700.00, 67892));
           carList.add(new UsedCar("Dodge", "Ram", 2010, 19999.99, 100567));

           carList.get(1).setMake("Fiat");
           carList.get(1).setModel("Spyder");
           carList.get(1).setYear(2017);
           carList.get(1).setPrice(15999.99);

           do{

           Scanner scan1 = new Scanner(System.in);

           for (int i = 0; i < carList.size(); i++) {

               System.out.printf("%-3s ", i + 1);
               System.out.println(carList.get(i));
           }

           System.out.println("Which car would you like?");
           int input = scan1.nextInt();

           System.out.println(carList.get(input - 1));
           System.out.println("Would you like to buy this car? (y/n)");
           String buyCar = scan1.next();
           if (buyCar.charAt(0) == 'y' || buyCar.charAt(0) == 'Y') {
               carList.remove(input - 1);
           } else {
               System.out.println("Good Bye!");
               return;
           }
           for (int i = 0; i < carList.size(); i++) {
               System.out.printf("%-2s .", i + 1);
               System.out.println(carList.get(i));

           }
           scan1.nextLine();
           System.out.println("Would you like to buy another car?(yes/no)");
           userinput = scan1.nextLine();
           //scan1.nextLine();


       }
       while (userinput.equalsIgnoreCase("yes"));


    }
}
