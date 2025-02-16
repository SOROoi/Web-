package wxt.bean;

import java.io.Serializable;

/**
 * 会员类
 * 
 * @author asus pc
 *
 */
public class Member implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6058684489434467514L;
	private String id;			//主键uuid
	private String name;		//姓名
	private String nickname;	//昵称
	private String phoneNum;	//电话
	private String email;		//邮箱

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
