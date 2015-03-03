public class Customers
{
    private int number;
    private String firstName;
    private String lastName;
    private String companyName;
    private String address;
    private String city;
    private String zip;
    private int phone, priceBill;

    public void setconstructInfo(int cnumber, String firstName, String lastName, String companyName, String address, String city, String zip, int phone, int currentBill)
    {
        setPriceBill(currentBill);
        setNumber(cnumber);
        setFirstName(firstName);
        setLastName(lastName);
        setCompanyName(companyName);
        setAddress(address);
        setCity(city);
        setZip(zip);
        setPhone(phone);
    }

    public boolean getconstructInfo()
    {
        getPriceBill();
        getNumber();
        getFirstName();
        getLastName();
        getCompanyName();
        getAddress();
        getCity();
        getZip();
        getPhone();
        return true;
    }


    public int getPriceBill() {
        return priceBill;
    }

    public void setPriceBill(int priceBill) {
        this.priceBill = priceBill;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}