package life.afeng.community.community.pojo;

import org.springframework.stereotype.Component;

/**
 * 店铺
 * @author 阿锋
 *
 */
@Component
public class Shop {
    private int sid;
    private String shopName;
    private String photo;
    private String location;
    private String boss;
    private int vipStandard;
    private String password;
    private String details;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public int getVipStandard() {
		return vipStandard;
	}
	public void setVipStandard(int vipStandard) {
		this.vipStandard = vipStandard;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
    
}
