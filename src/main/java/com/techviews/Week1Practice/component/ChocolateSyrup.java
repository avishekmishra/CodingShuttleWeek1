package com.techviews.Week1Practice.component;

import com.techviews.Week1Practice.base.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup", havingValue = "chocoSyrup")
public class ChocolateSyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Chosen chocolate syrup";
    }
}
