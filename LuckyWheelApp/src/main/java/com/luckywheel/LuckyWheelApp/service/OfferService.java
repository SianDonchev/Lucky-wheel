package com.luckywheel.LuckyWheelApp.service;

import com.luckywheel.LuckyWheelApp.dao.repository.OfferRepository;
import com.luckywheel.LuckyWheelApp.dto.OfferDto;
import com.luckywheel.LuckyWheelApp.util.OfferMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;
    @Autowired
    private OfferMapper offerMapper;

    /**
     * Fetch the offers for given page and size.
     *
     * @return Page of {@link OfferDto}
     */
    public Page<OfferDto> getOffers(final int page, final int size) {
        var pageable = PageRequest.of(page, size);

        log.debug("Fetching offers from the database for page {} and size {}", page, size);
        var offerPage = offerRepository.findAll(pageable);
        log.info("Successfully fetched offers. Total offers: {}", offerPage.getTotalElements());

        return offerPage.map(offerMapper::mapToOfferDto);
    }
}
