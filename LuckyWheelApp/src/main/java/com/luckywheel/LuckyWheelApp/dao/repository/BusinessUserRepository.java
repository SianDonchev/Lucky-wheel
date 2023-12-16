package com.luckywheel.LuckyWheelApp.dao.repository;

import com.luckywheel.LuckyWheelApp.dao.entity.BusinessUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessUserRepository extends JpaRepository<BusinessUser, Long> {
    // Custom query methods can be added here
}
