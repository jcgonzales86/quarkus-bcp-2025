package com.bcp.training;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class ExpenseValidator {

    @Inject
    ExpenseConfiguration config;

    private static final boolean DEBUG_ENABLED = true;

    private static final int RANGE_HIGH = 1000;

    private static final int RANGE_LOW = 250;

    public void debugRanges() {
        config.debugMessage().ifPresent(System.out::println);
    }

    public boolean isValidAmount(int amount) {
        if (config.debugEnabled()) {
            debugRanges();
        }

        return amount >= config.rangeLow() && amount <= config.rangeHigh();
    }
}
