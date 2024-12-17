package com.netpace.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chai {

    @Autowired
    Leaf leaves;

    @Override
    public String toString() {
        leaves.mix();
        return "Chai";
    }
}
