package Entity;

import Interfaces.iPrice;

/**
 * Classname: InBoxes
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

public class InBoxes implements iPrice {

    private String name;
    private double nominalPrice;
    private int boxQuantity;

    public InBoxes() { }

    public InBoxes(String name, double nominalPrice, int boxQuantity) {
        this.name = name;
        this.nominalPrice = nominalPrice;
        this.boxQuantity = boxQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNominalPrice() {
        return nominalPrice;
    }

    public void setNominalPrice(double nominalPrice) {
        this.nominalPrice = nominalPrice;
    }

    public int getBoxQuantity() {
        return boxQuantity;
    }

    public void setBoxQuantity(int boxQuantity) {
        this.boxQuantity = boxQuantity;
    }

    @Override
    public double getPrice() {
        return (this.getNominalPrice() * this.getBoxQuantity());
    }

    @Override
    public String toString() {
        return "InBoxes{" +
                "name='" + name + '\'' +
                ", nominalPrice=" + nominalPrice +
                ", boxQuantity=" + boxQuantity +
                '}';
    }
}
