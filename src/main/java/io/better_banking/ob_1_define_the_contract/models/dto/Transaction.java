package io.better_banking.ob_1_define_the_contract.models.dto;


import java.util.Date;

public class Transaction {

    private String type;
    private Date date;
    private String accountNumber;
    private String currency;
    private Long amount;
    private String merchantName;
    private String merchantLogo;

    // Constructor
    public Transaction(String type, Date date, String accountNumber, String currency, Long amount, String merchantName, String merchantLogo) {
        this.type = type;
        this.date = date;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
        this.merchantName = merchantName;
        this.merchantLogo = merchantLogo;
    }


    //Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantLogo() {
        return merchantLogo;
    }

    public void setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
    }


    // toString
    @Override
    public String toString() {
        return "Transaction [type=" + type + ", date=" + date + ", accountNumber=" + accountNumber + ", currency="
                + currency + ", amount=" + amount + ", merchantName=" + merchantName + ", merchantLogo=" + merchantLogo
                + "]";
    }


    
    

    

}
