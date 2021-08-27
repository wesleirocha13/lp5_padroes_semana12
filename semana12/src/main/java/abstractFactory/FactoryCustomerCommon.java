package abstractFactory;

/**
 *
 * @author Weslei
 */
public class FactoryCustomerCommon implements AbstractFactory{
    @Override
    public Benefits createBenefits() {
        return new BenefitsCustomerCommon();
    }

    @Override
    public Discount createDiscount() {
        return new DiscountCustomerCommon();
    }
}
