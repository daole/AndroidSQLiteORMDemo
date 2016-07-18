package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidbaselibrary.models.ModelBase;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.ForeignKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Relationship;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

@Table(name = "contact")
public class Contact extends ModelBase {
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
    @Relationship
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

    public String getCellPhone() {
        return this.mCellPhone;
    }

    public void setCellPhone(String pCellPhone) {
        this.mCellPhone = pCellPhone;
    }

    public User getUser() {
        return this.mUser;
    }

    public void setUser(User pUser) {
        this.mUser = pUser;
    }

    /*
    @OneToMany(optional = true, foreignTableClass = ContactProperty.class, foreignColumnName = "contact_id", fetchType = FetchType.EAGER)
    private List<ContactProperty> mContactProperties;

    public List<ContactProperty> getContactProperties() {
        return this.mContactProperties;
    }

    public void setContactProperties(List<ContactProperty> pContactProperties) {
        this.mContactProperties = pContactProperties;
    }
    */
}
