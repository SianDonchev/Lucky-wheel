package com.luckywheel.LuckyWheelApp.controller;

import com.luckywheel.LuckyWheelApp.dto.OfferDto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.luckywheel.LuckyWheelApp.service.OfferService;

@RestController
@AllArgsConstructor
@Slf4j
@Validated
public class OfficeController {

    @Autowired
    private OfferService offerService;

    @CrossOrigin(origins = "*") // Allows all origins
    @GetMapping("/offers")
    public ResponseEntity<Page<OfferDto>> getOffers(
            @RequestParam(value = "page", defaultValue = "0") @Min(0) final int page,
            @RequestParam(value = "size", defaultValue = "10") @Min(0) @Max(100) final int size
    ) {
        log.info("Starting to fetch offers - page: {}, size: {}", page, size);

        final var offers = offerService.getOffers(page, size);
        return ResponseEntity.ok(offers);
    }

}
