public class EnhancedCashRegister {
    /**
     A cash register totals up sales and computes change due.
     */
        private double purchase;
        private double payment;
        private int purchasecount;

        /**
         Constructs a cash register with no money in it.
         */
        public EnhancedCashRegister()
        {
            purchase = 0;
            payment = 0;
        }

        /**
         Records the sale of an item.
         @param amount the price of the item
         */
        public void recordPurchase(double amount)
        {
            purchase = purchase + amount;
            purchasecount = purchasecount + 1;
        }

        /**
         Processes a payment received from the customer.
         @param amount the amount of the payment
         */
        public void receivePayment(double amount)
        {
            payment = payment + amount;
        }

        /**
         Computes the change due and resets the machine for the next customer.
         @return the change due to the customer
         */
        public double giveChange()
        {
            double change = payment - purchase;
            purchase = 0;
            payment = 0;
            return change;
        }

        public int getPurchasecount() {
            return purchasecount;
        }
}

