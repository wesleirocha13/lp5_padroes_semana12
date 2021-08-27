package abstractFactory;

/**
 *
 * @author Weslei
 */
public class Customer {
    private Benefits benefits;
    private Discount discount;

    public Customer (AbstractFactory factory) {
        this.benefits = factory.createBenefits();
        this.discount = factory.createDiscount();
    }

    public String printBenefits() {
        return this.benefits.print();
    }

    public String printDiscount() {
        return this.discount.print();
    }
}
