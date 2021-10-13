package itAcademy;

import java.util.Scanner;


public class Main {






    public static void main(String[] args)





    {


        int min=0;
        int max=9;
	int randomNumber = (int)(Math.random()*(max-min) + min);

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Введите рандомное число:");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();

            if(randomNumber == userNumber)
            {
                System.out.println("you won!!");
                break;
            }
            else {
                if (randomNumber > userNumber) {
                    System.out.println("vi ne ygadali, vashe chislo menshe.");

                }
                if (randomNumber < userNumber) {
                    System.out.println("vi ne ygadali, vashe chislo bolshe.");

                }

            }

        }
            System.out.println("do you want to continue? 0-net / 1-da");
        Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();


            if (num == 0)
            {
                System.out.println("spasibo za igry");

            }
            else
            {

            }

    }





}
