package com.mycompany.app.domain;

import java.util.List;

public class Customer {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String document;
    private List<Account> accounts;

    public Customer create() {
        return this;
    }
}
