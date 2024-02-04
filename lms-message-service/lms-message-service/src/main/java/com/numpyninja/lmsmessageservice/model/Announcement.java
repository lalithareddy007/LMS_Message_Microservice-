package com.numpyninja.lmsmessageservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_lms_message_announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "announcement_id")
    private Long id;
    @Column(name ="announcement_senderId")
    private String sender;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Group recipients;
    @Column(name = "content")
    private String content;
    @Column(name = "posting_time")
    private Timestamp postingTime;

}
