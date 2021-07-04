package life.afeng.community.community.pojo;

import org.springframework.stereotype.Component;

/**
 * 地址信息
 * @author 阿锋
 *
 */
@Component
public class Address {
    private int aid;
    private int uid;
    private String address;
    private String tel;
    private String receiver;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
    
}
