/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class CustomerTest {
    
   @Test
    public void printCommonCustomerBenefits() {
        AbstractFactory factory = new FactoryCustomerCommon();
        Customer customer = new Customer(factory);
        assertEquals("Beneficios cliente comum", customer.printBenefits());
    }

    @Test
    public void printCommonCustomerDiscount() {
        AbstractFactory factory = new FactoryCustomerCommon();
        Customer customer = new Customer(factory);
        assertEquals("Descontos cliente comum", customer.printDiscount());
    }

    @Test
    public void printVipCustomerBenefits() {
        AbstractFactory factory = new FactoryCustomerVip();
        Customer customer = new Customer(factory);
        assertEquals("Beneficios cliente vip", customer.printBenefits());
    }

    @Test
    public void printVipCustomerDiscount() {
        AbstractFactory factory = new FactoryCustomerVip();
        Customer customer = new Customer(factory);
        assertEquals("Descontos cliente vip", customer.printDiscount());
    }
}
