import Entity.ByWeight;
import Entity.InBoxes;
import Interfaces.iPrice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Classname: Main
 *
 * @version     22 June 2020
 * @author      Klymenko Sergij, ONPU
 *
Laboratory work. (6 points)

Topic: Object-oriented programming,  JavaCollectionFramework

Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.

Six methods must be written like in the following example. A point for each one.

Creative approaches are welcome.

EXAMPLE

A company contains two types of employees:  full-time and  part-time ones.
1. Create two appropriate classes and 5 objects of each one.
2. Calculate the total salary of a month.
3. Find the highest salary employee.
4. Find he lowest salary employee
5. The average salary.
6. Who get more salary, part-time or full-time employees?

/----------------  Subjects according to your number ------------------

-------------------------------------------------------------------------------------
-------------------------2. Candies in boxes and by weight.--------------------------
-------------------------------------------------------------------------------------
 *
 * */

public class Main {

    public static void main(String[] args) {

        /**
         * Initializing InBoxes class entities
         */
        InBoxes b1 = new InBoxes("Lindt",5,2);
        InBoxes b2 = new InBoxes("RitterSport",1.09,8);
        InBoxes b3 = new InBoxes("Milka",1.89,5);
        InBoxes b4 = new InBoxes("Snickers",2.3,10);
        InBoxes b5 = new InBoxes("Haribo",2.48,1);
        /**
         * Initializing ByWeight class entities
         */
        ByWeight w1 = new ByWeight("Lindt",0.5,17);
        ByWeight w2 = new ByWeight("RitterSport",1.5,8.4);
        ByWeight w3 = new ByWeight("Milka",0.8,9.4);
        ByWeight w4 = new ByWeight("Snickers",4.3,6.4);
        ByWeight w5 = new ByWeight("Haribo",6,7);

        /**
         * Adding these items to an ArrayList
         */
        List<iPrice> candies = new ArrayList<>();
            candies.add(b1);
            candies.add(b2);
            candies.add(b3);
            candies.add(b4);
            candies.add(b5);
            candies.add(w1);
            candies.add(w2);
            candies.add(w3);
            candies.add(w4);
            candies.add(w5);

        /**
         * Finding out the Total Price of all items
         */
        double priceTotal = candies.stream()
                .mapToDouble(iPrice::getPrice).sum();
        /**
         * Finding out the Average Price of all items
         */
        double avg = candies.stream()
                .mapToDouble(iPrice::getPrice).average()
                .orElse(0);
        /**
         * Finding out the Most Expensive item
         */
        iPrice mostExpensive = candies.stream()
                .max(Comparator.comparingDouble(iPrice::getPrice))
                .orElse(null);
        /**
         * Finding out the Cheapest item
         */
        iPrice cheapest = candies.stream()
                .min(Comparator.comparingDouble(iPrice::getPrice))
                .orElse(null);
        /**
         * Finding out the Total Price of all InBoxes items
         */
        double inBoxesTotalPrice = candies.stream().filter(el->
                el instanceof InBoxes).mapToDouble(iPrice::getPrice)
                .sum();
        /**
         * Finding out the Total Price of all ByWeight items
         */
        double byWeightTotalPrice = candies.stream().filter(el->
                el instanceof ByWeight).mapToDouble(iPrice::getPrice)
                .sum();
        /**
         * their Total Prices comparison
         */
        if (inBoxesTotalPrice > byWeightTotalPrice) {
            System.out.println("\nAll the candies in boxes cost more in this store.");
        } else {
            System.out.println("\nAll the candies by weight cost more in this store.");
        }

        System.out.println("\nThe store enlists " + candies.size() + " items to sell," +
                "\n\twith the total price: " + priceTotal + " EUR," +
                "\n\tAverage price: " + avg + " EUR," +
                "\n\tMost expensive stuff: " + mostExpensive +
                "\n\tCheapest stuff: " + cheapest +
                "\n\tTotal price of candies in boxes: " + inBoxesTotalPrice +
                "\n\tTotal price of candies in boxes: " + byWeightTotalPrice
                );

    }
}
