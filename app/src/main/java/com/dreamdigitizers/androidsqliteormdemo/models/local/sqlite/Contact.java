package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidsqliteorm.FetchType;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.ForeignKey;
import com.dreamdigitizers.androidsqliteorm.annotations.ManyToOne;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

@Table(name = "contact")
public class Contact {
    @Column(name = "_id", nullable = false)
    @PrimaryKey(autoIncrement = true)
    private long mId;

    @Column(name = "address", nullable = false)
    private String mAddress;

    @Column(name = "home_phone", nullable = false)
    private String mHomePhone;

    @Column(name = "cell_phone")
    private String mCellPhone;

    @Column(name = "user_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private User mUser;

    public long getId() {
        return this.mId;
    }

    public void setId(long pId) {
        this.mId = pId;
    }

    public String getAddress() {
        return this.mAddress;
    }

    public void setAddress(String pAddress) {
        this.mAddress = pAddress;
    }

    public String getHomePhone() {
        return this.mHomePhone;
    }

    public void setHomePhone(String pHomePhone) {
        this.mHomePhone = pHomePhone;
    }

    public String getFirstName() {
        return this.mCellPhone;
    }

    public void setFirstName(String pCellPhone) {
        this.mCellPhone = pCellPhone;
    }

    public User getUser() {
        return this.mUser;
    }

    public void setUser(User pUser) {
        this.mUser = pUser;
    }
}
