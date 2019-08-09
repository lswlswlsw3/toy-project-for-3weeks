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

@Table(name = "tb_user") // ���̺� tb_user�� ����
@Entity // JPA ���
@Data // lombok ���
@Builder // builder ���� Ȱ��
public class UserVO {
	// �ø����ȣ
	@Id				// ������ ����
	@GeneratedValue	// �ڵ� ����
	@Column			// ���̺� �÷����� ���
	private Long sn;

	// ����� ID
	@Column		// ���̺� �÷����� ���
	@NotNull	// null�� ���ġ ����
	@NotEmpty	// �� ���ġ ����
	private String id;
	
	// ����� PASSWORD
	@Column		// ���̺� �÷����� ���
	@NotNull	// null�� ���ġ ����
	@NotEmpty	// �� ���ġ ����
	private String password;
	
	// ����� �̸�	
	@Column		// ���̺� �÷����� ���
	@NotNull	// null�� ���ġ ����
	@NotEmpty	// �� ���ġ ����
	private String name;

	// ����� ���� type (admin, user...)
	@Column		// ���̺� �÷����� ���
	@NotNull	// null�� ���ġ ����
	@NotEmpty	// �� ���ġ ����
	private String grant;
	
	// ����� ����
	@Column		// ���̺� �÷����� ���
	@NotNull	// null�� ���ġ ����
	@NotEmpty	// �� ���ġ ����
	private String gender;
	
	// ����� SNS ���� (kakao, naver, google)
	@Column		// ���̺� �÷����� ���
	private String sns;
	
	// ���� ���� ����Ʈ
	@Column		// ���̺� �÷����� ���
	private List<String> userList;
}
