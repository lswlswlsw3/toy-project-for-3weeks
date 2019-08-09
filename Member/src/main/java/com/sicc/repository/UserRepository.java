package com.sicc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sicc.vo.UserVO;

/**
 * User repository
 * @author Woongs
 */
public interface UserRepository extends JpaRepository<UserVO, Long> {

}
