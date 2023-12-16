package com.luckywheel.LuckyWheelApp.dao.repository;

import com.luckywheel.LuckyWheelApp.dao.entity.UserWins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWinsRepository extends JpaRepository<UserWins, Long> {
    // Custom query methods can be added here
}
