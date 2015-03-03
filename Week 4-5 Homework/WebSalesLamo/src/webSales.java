/**
 * @author
 * @version 03.02.2015.01
 * ASSIGNMENT: WebSite Sales, Lab 5
 * PURPOSE: Demonstrate looping
 */

import java.util.ArrayList;
 public class webSales {

     private ArrayList<Customers> customer;
     private int customerNumber;
     private int[][] designArray;
     private int currentCustNum;
     private int customerTotal;

     public int getCustomerTotal() {
         return customerTotal;
     }

     public void setCustomerTotal(int customerTotal) {
         this.customerTotal = customerTotal;
     }

     public int getCurrentDesign() {
         return currentDesign;
     }

     public int getCustomerNumber() {
         return customerNumber;
     }

     public void setCustomerNumber(int customerNumber) {
         this.customerNumber = customerNumber;
     }

     private int currentDesign;
     public webSales()
     {
         currentCustNum = 0;
         customerTotal = 0;
         customerNumber = 0;
         designArray = new int[][]{
                 {300, 10, 15, 20, 25, 30},
                 {350, 20, 30, 40, 50, 60},
                 {375, 30, 40, 50, 60, 70},
                 {400, 85, 95, 110, 130, 210},
                 {500, 100, 200, 300, 400, 500}};
         customer = new ArrayList<Customers>();
     }

     private void setcurrentDesign(String design)
     {
         if(design.equals("Nature"))
         {
             this.currentDesign = 1;
         }
         else if(design.equals("Tech"))
         {
             this.currentDesign = 2;
         }
         else if(design.equals("Business"))
         {
             this.currentDesign = 3;
         }
         else if(design.equals("Music"))
         {
             this.currentDesign = 4;
         }
         else if(design.equals("Naughty"))
         {
             this.currentDesign = 5;
         }
     }



     public void selectFeatures(int feature)
     {
         int i = getCurrentDesign();
         if(feature == 1)
         {
             customerTotal = designArray[i][0];
         }
         else if(feature == 2)
         {
             customerTotal = designArray[i][0] + designArray[i][1];
         }
         else if(feature == 3)
         {
             customerTotal = designArray[i][0] + designArray[i][2];
         }
         else if(feature == 4)
         {
             customerTotal = designArray[i][0] + designArray[i][3];
         }
         else if(feature == 5)
         {
             customerTotal = designArray[i][0] + designArray[i][4];
         }
         else if(feature == 5)
         {
             customerTotal = designArray[i][0] + designArray[i][5];
         }
     }

     public void generateNumber()
     {
         setCustomerNumber(currentCustNum + 1);
         currentCustNum = currentCustNum + 1;
     }

     public void generateBill()
     {
         for(Customers cust : customer)
         {
             cust.getconstructInfo();
         }
     }
     public void generateBill(int customerNum)
     {
         customer.get(customerNum).getconstructInfo();
     }

     public void createCustomer(int numbeh, String firstName, String lastName, String companyName, String address, String city, String zip, int priceBill, int phone) {
         generateNumber();
         numbeh = currentCustNum;
         priceBill = getCustomerTotal();
       //  customer.add(new Customers().setconstructInfo(numbeh, firstName, lastName, companyName, address, city, zip, priceBill, phone); //can't figure this out :/
     }
}
