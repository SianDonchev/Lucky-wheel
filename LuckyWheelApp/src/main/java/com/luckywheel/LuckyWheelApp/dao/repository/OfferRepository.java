package com.luckywheel.LuckyWheelApp.dao.repository;

import com.luckywheel.LuckyWheelApp.dao.entity.Offer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
    // Custom query methods can be added here

    Page<Offer> findAll(Pageable pageable);
}
