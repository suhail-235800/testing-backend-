package com.usttaxi.passenger.VO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class OfferRide {
	private int tripid;
    private int uid;
    private String name;    
    private String phone;
    private String v_no;
    private String start_point;
    private String dest_point;
    private String start_time;
    private String dest_time;
    private int price;
    private String email;
    
    
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getV_no() {
        return v_no;
    }
    public void setV_no(String v_no) {
        this.v_no = v_no;
    }
    public String getStart_point() {
        return start_point;
    }
    public void setStart_point(String start_point) {
        this.start_point = start_point;
    }
    public String getDest_point() {
        return dest_point;
    }
    public void setDest_point(String dest_point) {
        this.dest_point = dest_point;
    }
    public String getStart_time() {
        return start_time;
    }
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
    public String getDest_time() {
        return dest_time;
    }
    public void setDest_time(String dest_time) {
        this.dest_time = dest_time;
    }
    
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getTripid() {
        return tripid;
    }
    public void setTripid(int tripid) {
        this.tripid = tripid;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
        
}
