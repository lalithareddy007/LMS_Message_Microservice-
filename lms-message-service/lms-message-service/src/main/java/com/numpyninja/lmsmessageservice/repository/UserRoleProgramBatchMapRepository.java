package com.numpyninja.lmsmessageservice.repository;

import com.numpyninja.lmsmessageservice.model.UserRoleProgramBatchMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleProgramBatchMapRepository extends JpaRepository<UserRoleProgramBatchMap, Long> {
}
