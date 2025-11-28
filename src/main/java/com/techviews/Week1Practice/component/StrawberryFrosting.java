package com.techviews.Week1Practice.component;

import com.techviews.Week1Practice.base.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.frosting", havingValue = "strawberryFrost")
public class StrawberryFrosting implements Frosting {

    @Override
    public String getFrostingType() {
        return "Chosen strawberry frosting";
    }

}
