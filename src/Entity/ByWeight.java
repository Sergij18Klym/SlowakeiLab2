package Entity;

import Interfaces.iPrice;

import java.util.Objects;

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

    public String name;             // candy name
    public double weight;           // the weight of candies
    public double pricePerKilo;     // the price of candy type per kilogram

    /**
     * Default constructor
     */
    public ByWeight() { }

    /**
     * Class constructor with parameters
     */
    public ByWeight(String name, double weight, double pricePerKilo) {
        this.name = name;
        this.weight = weight;
        this.pricePerKilo = pricePerKilo;
    }

    /**
     * Getter for ByWeight name field
     * @return Returns name of ByWeight object
     */
    public String getName() {
        return name;
    }
    /**
     * Setter for ByWeight name field
     * @param name Sets name of ByWeight object
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for ByWeight weight field
     * @return Returns weight of ByWeight object
     */
    public double getWeight() {
        return weight;
    }
    /**
     * Setter for ByWeight weight field
     * @param weight Sets weight of ByWeight object
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * Getter for ByWeight pricePerKilo field
     * @return Returns price per kilo of ByWeight object
     */
    public double getPricePerKilo() {
        return pricePerKilo;
    }
    /**
     * Setter for ByWeight pricePerKilo field
     * @param pricePerKilo Sets pricePerKilo of ByWeight object
     */
    public void setPricePerKilo(double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }
    /**
     * Method to get the total price of ByWeight item
     * @return Returns totalPrice of ByWeight object
     */
    @Override
    public double getPrice() {
        return (this.getPricePerKilo() * this.getWeight());
    }

    /**
     * Method toString() for class ByWeight
     * @return Returns info about ByWeight
     */
    @Override
    public String toString() {
        return "ByWeight{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", pricePerKilo=" + pricePerKilo +
                '}';
    }
    /**
     * Method to check whether object equals by value
     * @param o Object as parameter
     * @return Return boolean value as a result of comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ByWeight)) return false;
        ByWeight byWeight = (ByWeight) o;
        return Double.compare(byWeight.getWeight(), getWeight()) == 0 &&
                Double.compare(byWeight.getPricePerKilo(), getPricePerKilo()) == 0 &&
                Objects.equals(getName(), byWeight.getName());
    }

}
