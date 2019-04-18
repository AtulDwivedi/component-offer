package com.quickcart.component.offer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {

    @Value("${offer-new-year}")
    private String offer;

    @GetMapping(value = "/new-year-offer")
    public String newYearOffer(){
        return offer;
    }
}
