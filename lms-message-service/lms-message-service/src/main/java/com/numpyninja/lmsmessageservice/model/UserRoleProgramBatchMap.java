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
@Table(name="tbl_lms_message_user_role_pro_batch")
public class UserRoleProgramBatchMap {
    @Id
    @Column(name ="ur_pb_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userRoleProgramBatchId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "role_id", nullable = false)
    private String roleId;

    @Column(name = "program_id", nullable = false)
    private Long programId;

    @Column(name = "batch_id", nullable = false)
    private Integer batchId;

    @Column(name ="user_role_program_batch_status")
    private String userRoleProgramBatchStatus;

    @JsonIgnore
    @Column(name ="creation_time")
    private Timestamp creationTime;

    @JsonIgnore
    @Column(name ="last_mod_time")
    private Timestamp lastModTime;
}
