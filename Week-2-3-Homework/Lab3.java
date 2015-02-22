/** Lab 3
 * @author
 * @version Version 1 02/03/2015
 */

public class Book
{
    private String _authorLastName;
    private String _authorFirstName;
    private String _bookTitle;
    private String _pubDate;
    private int _numberofPages;

    public int get_numberofPages() {
        return _numberofPages;
    }

    public void set_numberofPages(int numberofPages) {
        if(numberofPages < 10)
        {
            System.out.println("Error! Pages is below 10!");
        }
        else
        {
            this._numberofPages = numberofPages;
        }
    }

    public String get_authorLastName() {
        return _authorLastName;
    }

    public void set_authorLastName(String authorLastName) {
        this._authorLastName = authorLastName;
    }

    public String get_authorFirstName() {
        return _authorFirstName;
    }

    public void set_authorFirstName(String authorFirstName) {
        this._authorFirstName = authorFirstName;
    }

    public String get_bookTitle() {
        return _bookTitle;
    }

    public void set_bookTitle(String bookTitle) {
        this._bookTitle = bookTitle;
    }

    public String get_pubDate() {
        return _pubDate;
    }

    public void set_pubDate(String pubDate) {
        this._pubDate = pubDate;
    }
}
