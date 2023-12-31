package com.gechan.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gechan.bbs.models.UserDto;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Long> {

}
