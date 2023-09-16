package com.example.lab_04_02_yearlymaintenancecost;

public class Lab_04_02_YearlyMaintenanceCost {
        public static void main(String[] args) {

            double springCost = 200.00;
            double summerCost = 150.00;
            double autumnCost = 100.00;
            double winterCost = 250.00;


            double totalYearlyCost = springCost + summerCost + autumnCost + winterCost;


            System.out.println("Spring Maintenance Cost: $" + springCost);
            System.out.println("Summer Maintenance Cost: $" + summerCost);
            System.out.println("Autumn Maintenance Cost: $" + autumnCost);
            System.out.println("Winter Maintenance Cost: $" + winterCost);
            System.out.println("Total Yearly Maintenance Cost: $" + totalYearlyCost);
        }

}
