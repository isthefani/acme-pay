package com.mycompany.app.domain;

import com.mycompany.app.exception.BalanceToWithdrawException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private Long id;
    private Integer number;
    private Integer agency;
    private BigDecimal balance;
    private Customer customer;
    private List<Card> cards;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Boolean close;

    private List<Account> accountsCreated = new ArrayList<>();

    public void create(Account account) {
        this.setId(account.id);
        this.setCreated_at(LocalDateTime.now());
        this.setUpdated_at(null);
        this.setCustomer(createCustomer());
        this.setCards(new ArrayList<>());
        this.setBalance(BigDecimal.ZERO);
        this.setNumber(account.number);
        this.setAgency(account.agency);
        this.setClose(account.close);
        this.accountsCreated.add(this);
    }

    public void deposit(BigDecimal amount) {
        this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws BalanceToWithdrawException {
        if (this.balance.compareTo(amount) >= 0) {
            this.balance.subtract(amount);
        } else {
            throw new BalanceToWithdrawException("error withdraw");
        }
    }

    public void transfer(BigDecimal amount) {
        if (this.balance.compareTo(amount) >= 0) {
            this.number
        }
    }

    private Customer createCustomer(){
        var customer = new Customer();
        customer.setId(1L);
        customer.setName("Isthefani Vitoria");
        customer.setEmail("isthefani@gmail.com");
        customer.setDocument("123456789");
        customer.setPhone("83991999999");
        customer.setCreated_at(LocalDateTime.now());
        customer.setUpdated_at(null);
        customer.setAccounts(new ArrayList<>());
        return customer;
    }
}
