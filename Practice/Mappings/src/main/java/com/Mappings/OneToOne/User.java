package com.Mappings.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    private int userid;
    private String username;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn( name = "address_id", referencedColumnName = "addressid")
    @JsonManagedReference
    private UserAddress userAddress;

    public User() {
    }

    public User(int userid, String username, UserAddress userAddress) {
        this.userid = userid;
        this.username = username;
        this.userAddress = userAddress;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userAddress=" + userAddress +
                '}';
    }
}
