/**
 * Quiz 1 – Understanding programming terminology & class layouts.
 * Write a java program in BlueJ that contains one class. The class should be in a package called QuizOne.
 * Ensure that its state includes three fields. One field should be of a primitive type that accepts whole
 * numbers which will hold a person’s age, another should be a primitive type that accepts decimal
 * numbers which will be the cost of a book purchase, and the last field should be a class reference (object)
 * type that will be a person’s last name. Ensure the behavior of the class includes mutator and accessor
 * methods for each field. Each mutator method signature must include a formal parameter that initializes
 * its field to the parameterized value. Write a constructor that initializes each field to a default starting
 * value. Write a worker method that contains a variable that is locally-scoped and is assigned a tax
 * amount. Allow the variable to be added to the cost field, increasing it by the resultant amount. Include
 * JavaDoc for the class, constructor, and each method. Include a single-line comment in the worker
 * method describing the local variable.
 *
 * @author .
 * @version 2015.09.02
 */


public class Quiz {

    private int _yourAge;
    private double _cost;
    private String _lastName;



    public Quiz()
    {
        _yourAge = 0;
        _cost = 0;
        _lastName = "";
    }


    private void taxAmount()
    {
        double taxCost = 0.06;
        _cost = (_cost + (_cost * taxCost));
    }

    public int get_yourAge() {
        return _yourAge;
    }

    /**
     * @param yourAge the age of the person purchasing the book
     */
    public void set_yourAge(int yourAge) {
        this._yourAge = yourAge;
    }

    public double get_bookPurchase() {
        return _cost;
    }

    /**
     * @param bookPurchase the price of the book to purchase
     */
    public void set_bookPurchase(long bookPurchase) {
        this._cost = bookPurchase;
    }

    public String get_lastName() {
        return _lastName;
    }

    /**
     * @param lastName the last name of the person purchasing the book
     */
    public void set_lastName(String lastName) {
        this._lastName = lastName;
    }
}
