package Entity;

import Interfaces.iPrice;

import java.util.Objects;

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

    private String  name;           // candy name
    private double  nominalPrice;   // the price of a candy box
    private int     boxQuantity;    // number of candy boxes

    /**
     * Default constructor
     */
    public InBoxes() { }

    /**
     * Class constructor with parameters
     */
    public InBoxes(String name, double nominalPrice, int boxQuantity) {
        this.name = name;
        this.nominalPrice = nominalPrice;
        this.boxQuantity = boxQuantity;
    }

    /**
     * Getter for InBoxes name field
     * @return Returns name of InBoxes object
     */
    public String getName() {
        return name;
    }
    /**
     * Setter for InBoxes name field
     * @param name Sets name of InBoxes object
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for InBoxes nominalPrice field
     * @return Returns nominal price of InBoxes object
     */
    public double getNominalPrice() {
        return nominalPrice;
    }
    /**
     * Setter for InBoxes nominalPrice field
     * @param nominalPrice Sets nominal price of InBoxes object
     */
    public void setNominalPrice(double nominalPrice) {
        this.nominalPrice = nominalPrice;
    }
    /**
     * Getter for InBoxes boxQuantity field
     * @return Returns boxQuantity of InBoxes object
     */
    public int getBoxQuantity() {
        return boxQuantity;
    }
    /**
     * Setter for InBoxes boxQuantity field
     * @param boxQuantity Sets box quantity of InBoxes object
     */
    public void setBoxQuantity(int boxQuantity) {
        this.boxQuantity = boxQuantity;
    }
    /**
     * Method to get the total price of InBoxes item
     * @return Returns totalPrice of InBoxes object
     */
    @Override
    public double getPrice() {
        return (this.getNominalPrice() * this.getBoxQuantity());
    }
    
    /**
     * Method toString() for class InBoxes
     * @return Returns info about InBoxes
     */
    @Override
    public String toString() {
        return "InBoxes{" +
                "name='" + name + '\'' +
                ", nominalPrice=" + nominalPrice +
                ", boxQuantity=" + boxQuantity +
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
        if (!(o instanceof InBoxes)) return false;
        InBoxes inBoxes = (InBoxes) o;
        return Double.compare(inBoxes.getNominalPrice(), getNominalPrice()) == 0 &&
                getBoxQuantity() == inBoxes.getBoxQuantity() &&
                Objects.equals(getName(), inBoxes.getName());
    }

}
