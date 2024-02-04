package com.numpyninja.lmsmessageservice.repository;

import com.numpyninja.lmsmessageservice.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, String> {
}
