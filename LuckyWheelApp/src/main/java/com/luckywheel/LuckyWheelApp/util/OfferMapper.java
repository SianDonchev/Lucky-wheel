package com.luckywheel.LuckyWheelApp.util;

import com.luckywheel.LuckyWheelApp.dao.entity.Offer;
import com.luckywheel.LuckyWheelApp.dto.OfferDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfferMapper {

    public OfferDto mapToOfferDto(final Offer offer) {

        return new OfferDto(offer);
    }

    public List<OfferDto> mapToOfferDto(final List<Offer> offer) {

        return new ArrayList<>();
    }
}
