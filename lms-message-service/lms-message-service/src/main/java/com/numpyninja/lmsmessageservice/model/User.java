package com.numpyninja.lmsmessageservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_lms_message_users")
public class User {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_first_name")
    private String userFirstName;
    @Column(name = "user_last_name")
    private String userLastName;
    @Column(name = "user_middle_name")
    private String userMiddleName;
    @Column(name = "user_phone_number")
    private Long userPhoneNumber;
    @Column(name = "user_location")
    private String userLocation;
    @Column(name = "user_time_zone")
    private String userTimeZone;
    @Column(name = "user_linkedin_url")
    private String userLinkedinUrl;
    @Column(name = "user_edu_ug")
    private String userEduUg;
    @Column(name = "user_edu_pg")
    private String userEduPg;
    @Column(name = "user_comments")
    private String userComments;
    @Column(name = "user_visa_status")
    private String userVisaStatus;
    @Column(name = "creation_time")
    @JsonIgnore
    private Timestamp creationTime;
    @Column(name = "last_mod_time")
    @JsonIgnore
    private Timestamp lastModTime;


}
