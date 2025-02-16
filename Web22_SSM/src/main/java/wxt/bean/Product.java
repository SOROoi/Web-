package wxt.bean;

import java.io.Serializable;
import java.util.Date;

import wxt.util.DateToString;

/**
 * 产品类
 * 
 * @author asus pc
 *
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5398495733405402077L;
	private String id;						// 主键
	private String productNum;				// 产品编号
	private String productName;				// 产品名
	private String cityName;				// 城市
	private Date departureTime;				// 出发时间
	private String departureTimeStr;
	private double productPrice;	 		// 产品价格
	private String productDesc;				// 产品描述
	private Integer productStatus;			// 状态 0关闭 1开启
	private String productStatusStr;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	//手动修改
	public String getDepartureTimeStr() {
		if(departureTime != null) {
			this.departureTimeStr = DateToString.toString(departureTime, "yyyy-MM-dd HH:mm");
		}
		return departureTimeStr;
	}

	public void setDepartureTimeStr(String departureTimeStr) {
		this.departureTimeStr = departureTimeStr;
		
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	//手动修改
	public String getProductStatusStr() {
		if(productStatus != null) {
			if(productStatus == 0) {
				productStatusStr ="关闭";
			}
			if(productStatus == 1) {
				productStatusStr ="开启";
			}
		}
		return productStatusStr;
	}

	public void setProductStatusStr(String productStatusStr) {
		this.productStatusStr = productStatusStr;
	}

}
