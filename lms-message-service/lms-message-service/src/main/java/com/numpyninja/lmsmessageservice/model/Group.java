package com.numpyninja.lmsmessageservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_lms_message_groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long groupId;
    @Column(name = "group_name")
    private String groupName;
    @Column(name = "group_description")
    private String description;
    @OneToMany (cascade = CascadeType.ALL)
    @Column(name ="user_id")
    private List<User> members;
}
