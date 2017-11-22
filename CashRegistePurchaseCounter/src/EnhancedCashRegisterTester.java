public class EnhancedCashRegisterTester {
    /**
     A class to test the CashRegister class.
     */
        public static void main(String[] args)
        {
            EnhancedCashRegister register = new EnhancedCashRegister();

            register.recordPurchase(29.50);
            register.recordPurchase(9.25);
            register.receivePayment(50);

            double change = register.giveChange();

            System.out.println(change);
            System.out.println("Expected: 11.25");
            System.out.println(register.getPurchasecount());
        }
    }

