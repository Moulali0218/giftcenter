package com.giftCorner.giftCenter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Giftcorner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long giftID;
    private String giftName;
    private String giftAddress;
    private String giftCode;
	public long getGiftID() {
		return giftID;
	}
	public void setGiftID(long giftID) {
		this.giftID = giftID;
	}
	public String getGiftName() {
		return giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	public String getGiftAddress() {
		return giftAddress;
	}
	public void setGiftAddress(String giftAddress) {
		this.giftAddress = giftAddress;
	}
	public String getGiftCode() {
		return giftCode;
	}
	public void setGiftCode(String giftCode) {
		this.giftCode = giftCode;
	}
    
    


}
