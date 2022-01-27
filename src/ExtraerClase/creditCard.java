package ExtraerClase;
import java.util.Date;

public class creditCard {
    private String creditCard;
    private Date creditCardDate;
    private int creditCardControlNumber;

    public String getCreditCard() {
        return creditCard;
    }

    public creditCard(String creditCard, Date creditCardDate, int creditCardControlNumber) {
        super();
        this.creditCard = creditCard;
        this.creditCardDate = creditCardDate;
        this.creditCardControlNumber = creditCardControlNumber;
    }
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Date getCreditCardDate() {
        return creditCardDate;
    }

    public void setCreditCardDate(Date creditCardDate) {
        this.creditCardDate = creditCardDate;
    }

    public int getCreditCardControlNumber() {
        return creditCardControlNumber;
    }

    public void setCreditCardControlNumber(int creditCardControlNumber) {
        this.creditCardControlNumber = creditCardControlNumber;
    }
    public boolean isCardExpired() {
        return creditCardDate.before(new Date());
    }
}