package wxt.bean;

import java.io.Serializable;
import java.util.List;

public class Permission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4774648399521770606L;

	private String id;
	private String permissionName;
	private String url;
	private List<Role> roles;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
