package com.techviews.Week1Practice.service;

import com.techviews.Week1Practice.base.Frosting;
import com.techviews.Week1Practice.base.Syrup;
import org.springframework.stereotype.Service;

@Service
public class CakeBakerService {

    final Frosting frostingChoice;
    final Syrup syrupChoice;

    public CakeBakerService(Frosting frosting, Syrup syrup){
        this.frostingChoice = frosting;
        this.syrupChoice = syrup;
    }

    public void bakeCake(){
        System.out.println("Cake baking has started");
        System.out.println(frostingChoice.getFrostingType());
        System.out.println(syrupChoice.getSyrupType());
        System.out.println("Cake baking completed");
    }

}
