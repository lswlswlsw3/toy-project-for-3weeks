package com.sicc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sicc.vo.UserVO;

/**
 * ȸ�� ����/���Կ���/���� �� ���� RestController
 * @author Woongs
 * @since 19.08.09
 * @version 0.1v(����-19.08.09)
 */
@RestController
public class JoinRestController {
	/**
	 * �ű� ȸ������
	 * @return
	 */
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinUser(UserVO userVO) {
		return "join complete";
	}

	/**
	 * ȸ�� ���Կ���
	 * @return
	 */
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String isThereUser(String id) {
		return "join complete";
	}
	
	/**
	 * ȸ������ ����
	 * @return
	 */
	@RequestMapping(value="/join", method=RequestMethod.PUT)
	public String updateUser(UserVO userVO) {
		return "join complete";
	}
}
