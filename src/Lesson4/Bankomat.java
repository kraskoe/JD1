package Lesson4;

import java.util.Scanner;

/**
 * Created by User on 17.06.2017.
 */
public class Bankomat {
    private int bucks20, bucks50, bucks100;
    private int hundred = 0, fifty = 0, twenty = 0;
    private boolean flag;

    Bankomat(int b20, int b50, int b100) {
        bucks20 = b20;
        bucks50 = b50;
        bucks100 = b100;
    }

    public void push20Bucks(int b20) {
        bucks20 += b20;
    }

    public void push50Bucks(int b50) {
        bucks50 += b50;
    }

    public void push100Bucks(int b100) {
        bucks100 += b100;
    }

    public void getMoney() {

        int sumOfMoney = bucks20 * 20 + bucks50 * 50 + bucks100 * 100;

        System.out.println(bucks20);
        System.out.println(bucks50);
        System.out.println(bucks100);
        System.out.println(sumOfMoney);

        int money = 0;
        Scanner moneyIn = new Scanner(System.in);
        System.out.println("Enter the sum of money you need to withdraw:");

        if (moneyIn.hasNextInt()) {
            money = moneyIn.nextInt();
        } else System.out.println("The entered data is incorrect");

        if (money <= sumOfMoney) {
            if (money % 10 == 0) {
                switch (money % 100) {
                    case 0:
                        moneyCounter(money, 0);
                    case 50: {
                        moneyCounter(money, 50);
                        fifty = 1;
                    }
                    case 70: {
                        moneyCounter(money, 70);
                        fifty = 1;
                        twenty = 1;
                    }
                    case 90: {
                        moneyCounter(money, 90);
                        fifty = 1;
                        twenty = 2;
                    }
                    case 20: {
                        moneyCounter(money, 20);
                        twenty = 1;
                    }
                    case 40: {
                        moneyCounter(money, 40);
                        twenty = 2;
                    }
                    case 60: {
                        moneyCounter(money, 60);
                        twenty = 3;
                    }
                    case 80: {
                        moneyCounter(money, 80);
                        twenty = 4;
                    }
                    case 10: {
                        moneyCounter(money, 110);
                        fifty = 1;
                        twenty = 3;
                    }
                    case 30: {
                        moneyCounter(money, 130);
                        fifty = 1;
                        twenty = 4;
                    }
                }
            } else {
                System.out.println("Pls, enter the number, multiple to 10");
            }
        } else {
            System.out.println("Insufficient money");
        }

        if (flag) {
            bucks100 -= hundred;
            bucks50 -= fifty;
            bucks20 -= twenty;
            withdrawalSuccess();
        }
    }

    private void moneyCounter(int m, int tempM) {
        if ((hundred += (m - tempM) / 100) <= bucks100) {
            if ((fifty += ((m - tempM) - hundred * 100) / 50) <= bucks50) {
                if ((twenty += ((m - tempM) - hundred * 100 - fifty * 50) / 20) <= bucks20) {
                    flag = true;
                } else {
                    fifty = bucks50;
                    if ((twenty += ((m - tempM) - hundred * 100 - fifty * 50) / 20) <= bucks20) {
                        flag = true;
                    }
                }
            }
        } else {
            hundred = bucks100;
            if ((fifty += ((m - tempM) - hundred * 100) / 50) <= bucks50) {
                if ((twenty += ((m - tempM) - hundred * 100 - fifty * 50) / 20) <= bucks20) {
                    flag = true;
                }
            } else {
                fifty = bucks50;
                if ((twenty += ((m - tempM) - hundred * 100 - fifty * 50) / 20) <= bucks20) {
                    flag = true;
                }
            }
        }
    }

    private void withdrawalSuccess() {
        System.out.printf("Receive the sum requested: 100 bucks - %d, 50 bucks - %d, 20 bucks - %d", hundred, fifty, twenty);
    }

}
