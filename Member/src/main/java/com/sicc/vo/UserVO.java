package com.sicc.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

@Table(name = "tb_user") // 테이블 tb_user로 저장
@Entity // JPA 사용
@Data // lombok 사용
@Builder // builder 패턴 활용
public class UserVO {
	// 시리얼번호
	@Id				// 구분자 설정
	@GeneratedValue	// 자동 증가
	@Column			// 테이블 컬럼으로 사용
	private Long sn;

	// 사용자 ID
	@Column		// 테이블 컬럼으로 사용
	@NotNull	// null값 허용치 않음
	@NotEmpty	// 빈값 허용치 않음
	private String id;
	
	// 사용자 PASSWORD
	@Column		// 테이블 컬럼으로 사용
	@NotNull	// null값 허용치 않음
	@NotEmpty	// 빈값 허용치 않음
	private String password;
	
	// 사용자 이름	
	@Column		// 테이블 컬럼으로 사용
	@NotNull	// null값 허용치 않음
	@NotEmpty	// 빈값 허용치 않음
	private String name;

	// 사용자 권한 type (admin, user...)
	@Column		// 테이블 컬럼으로 사용
	@NotNull	// null값 허용치 않음
	@NotEmpty	// 빈값 허용치 않음
	private String grant;
	
	// 사용자 성별
	@Column		// 테이블 컬럼으로 사용
	@NotNull	// null값 허용치 않음
	@NotEmpty	// 빈값 허용치 않음
	private String gender;
	
	// 사용자 SNS 종류 (kakao, naver, google)
	@Column		// 테이블 컬럼으로 사용
	private String sns;
	
	// 관심 유저 리스트
	@Column		// 테이블 컬럼으로 사용
	private List<String> userList;
}
