package bank;

public class Customer {
    private int customerId;
    private String customerName;
    private boolean loadAvailed;

    public Customer(int customerId, String customerName, boolean loadAvailed) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.loadAvailed = loadAvailed;
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isLoadAvailed() {
        return loadAvailed;
    }

    public void setLoadAvailed(boolean loadAvailed) {
        this.loadAvailed = loadAvailed;
    }
}
