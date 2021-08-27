package abstractFactory;

/**
 *
 * @author Weslei
 */
public class FactoryCustomerVip implements AbstractFactory{
    @Override
    public Benefits createBenefits() {
        return new BenefitsCustomerVip();
    }

    @Override
    public Discount createDiscount() {
        return new DiscountCustomerVip();
    }
}
