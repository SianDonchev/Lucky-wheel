package com.luckywheel.LuckyWheelApp.dto;

import com.luckywheel.LuckyWheelApp.dao.entity.BusinessUser;
import com.luckywheel.LuckyWheelApp.dao.entity.Offer;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class OfferDto {
    private String description;
    private Double prize;
    private String owner_email;

    public OfferDto(final Offer offer) {
        description = offer.getDescription();
        prize = offer.getPrize();
        owner_email = offer.getOwner().getEmail();
    }


}
