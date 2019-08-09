package com.sicc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sicc.vo.UserVO;

/**
 * 회원 가입/가입여부/수정 등 관련 RestController
 * @author Woongs
 * @since 19.08.09
 * @version 0.1v(생성-19.08.09)
 */
@RestController
public class JoinRestController {
	/**
	 * 신규 회원가입
	 * @return
	 */
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinUser(UserVO userVO) {
		return "join complete";
	}

	/**
	 * 회원 가입여부
	 * @return
	 */
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String isThereUser(String id) {
		return "join complete";
	}
	
	/**
	 * 회원정보 수정
	 * @return
	 */
	@RequestMapping(value="/join", method=RequestMethod.PUT)
	public String updateUser(UserVO userVO) {
		return "join complete";
	}
}
