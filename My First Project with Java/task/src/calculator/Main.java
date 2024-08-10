package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Implementing scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Declaring variables and finding total income
        int Bubblegum = 202;
        int Toffee = 118;
        int Icecream = 2250;
        int MilkChocolate = 1680;
        int Doughnut = 1075;
        int Pancake = 80;
        int totalIncome = Bubblegum + Toffee + Icecream + MilkChocolate + Doughnut + Pancake;



        // Outputting item names and earned amounts
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + Bubblegum);
        System.out.println("Toffee: $" + Toffee);
        System.out.println("Ice cream: $" + Icecream);
        System.out.println("Milk chocolate: $" + MilkChocolate);
        System.out.println("Doughnut: $" + Doughnut);
        System.out.println("Pancake: $" + Pancake);

        // Outputting total income
        System.out.println("\nIncome: $" + totalIncome);

        //Outputting staff expenses
        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();




        //Outputting other expenses

        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();


        //Outputting net income
        int netIncome = totalIncome - staffExpenses - otherExpenses;
        System.out.println("Net income: $" + netIncome);


    }
}