package com.mycompany.app.domain;

import java.math.BigDecimal;

public class Card {

    private Long id;
    private String flag;
    private BigDecimal card_limit;
    private Account card_account;

    public Card create() {
        return this;
    }
}
