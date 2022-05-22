package com.fsb.eblood.dao.repositories;


import com.fsb.eblood.dao.entities.Event;
import com.fsb.eblood.dao.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
    void deleteByEvent(Event event);
}
