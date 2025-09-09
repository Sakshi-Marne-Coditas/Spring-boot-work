package com.Mappings.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class UserAddress {
    @Id
    private int addressid;
    private String state;
    private String contry;
    @OneToOne(mappedBy = "userAddress", fetch = FetchType.EAGER)// ithe Lazy pn asu shakt
    @JsonBackReference
    private User user;

    public UserAddress() {
    }

    public UserAddress(int addressid, String state, String contry, User user) {
        this.addressid = addressid;
        this.state = state;
        this.contry = contry;
        this.user = user;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "addressid=" + addressid +
                ", state='" + state + '\'' +
                ", contry='" + contry + '\'' +
                ", user=" + user +
                '}';
    }
}
