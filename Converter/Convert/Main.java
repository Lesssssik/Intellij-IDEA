package Convert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Сколько у Вас рублей?");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();

        System.out.println("В какую валюту Вы хотите конвертировать?");
        Scanner scanner1 = new Scanner(System.in);
        String currency = scanner1.nextLine();

        if (currency.equals("доллар")|| currency.equals("Доллар")){
            money = money*0.011;
            System.out.println("У Вас " + money +"долларов");
        }else if (currency.equals("евро") || currency.equals("Евро")){
            money = money*0.0098;
            System.out.println("У Вас " + money + "евро");
        }else if (currency.equals("юаней")||currency.equals("Юаней")){
            money = money*0.077;
            System.out.println("У Вас " + money + "юаней");
        }else{
            System.out.println("Неверная валюта");
        }

    }

}
