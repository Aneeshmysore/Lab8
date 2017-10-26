import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
/**
 *
 */
/**
 *
 */
/**
 *
 */
/**
 *
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
    /**
     *
     * @param name - name of Bank account.
     * @param accountCategory - account categtory we are in.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
       ownerName = name;
       accountType = accountCategory;
       /*
         * Implement this function
         */
    }
    /**
     *
     * @return ownerName - returns owner name.
     */
    public String getownerName() {
        return ownerName;
    }
    /**
     *
     * @return accountBalance - balance of account.
     */
    public double getaccountBal() {
        return accountBalance;
    }
    /**
     *
     * @param bal - balance of account.
     */
    public void setBalance(final double bal) {
        accountBalance = bal;
    }
    /**
     *
     * @param name - name of account.
     */
    public void setOwnerName(final String name) {
        ownerName = name;

    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}