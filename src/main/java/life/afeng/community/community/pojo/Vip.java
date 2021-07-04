package life.afeng.community.community.pojo;

import org.springframework.stereotype.Component;


/**
 * VIP
 * @author 阿锋
 *
 */
@Component
public class Vip {
    private int id;
    private int uid;
    private String username;
    private int sid;
    private String shopName;
	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
    
}
