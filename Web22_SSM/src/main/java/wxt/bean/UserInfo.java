package wxt.bean;

import java.io.Serializable;
import java.util.List;

public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -786302514843270920L;

	private String id;
	private String username;
	private String email;
	private String password;
	private String phoneNum;
	private int status;			//状态	0未开启 1开启

	private String statusStr;
	private List<Role> roles;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getStatusStr() {
		if(status == 0) {
			this.statusStr = "未开启";
		}else if(status == 1) {
			this.statusStr = "已开启";
		}else {
			this.statusStr = "状态码错误(状态码为0或1)";
		}
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
