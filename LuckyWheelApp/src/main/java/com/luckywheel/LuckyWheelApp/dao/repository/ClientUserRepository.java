package com.luckywheel.LuckyWheelApp.dao.repository;

import com.luckywheel.LuckyWheelApp.dao.entity.ClientUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {
    // Custom query methods can be added here
}
