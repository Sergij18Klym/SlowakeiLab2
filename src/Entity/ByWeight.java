package Entity;

import Interfaces.iPrice;

/**
 * Classname: ByWeight
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

public class ByWeight implements iPrice {

    public String name;
    public double weight;
    public double pricePerKilo;

    public ByWeight() { }

    public ByWeight(String name, double weight, double pricePerKilo) {
        this.name = name;
        this.weight = weight;
        this.pricePerKilo = pricePerKilo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    @Override
    public double getPrice() {
        return (this.getPricePerKilo() * this.getWeight());
    }

    @Override
    public String toString() {
        return "ByWeight{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", pricePerKilo=" + pricePerKilo +
                '}';
    }
}
