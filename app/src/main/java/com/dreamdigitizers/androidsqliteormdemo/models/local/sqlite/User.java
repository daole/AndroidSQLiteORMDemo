package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidbaselibrary.models.ModelBase;
import com.dreamdigitizers.androidsqliteorm.FetchType;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.OneToMany;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

import java.util.List;

@Table(name = "user")
public class User extends ModelBase {
    @Column(name = "_id", nullable = false)
    @PrimaryKey(autoIncrement = true)
    private long mId;

    @Column(name = "username", unique = true, nullable = false)
    private String mUsername;

    @Column(name = "first_name", nullable = false)
    private String mFirstName;

    @Column(name = "last_name", nullable = false)
    private String mLastName;

    @OneToMany(optional = true, foreignTableClass = Contact.class, foreignColumnName = "user_id", fetchType = FetchType.EAGER)
    private List<Contact> mContacts;

    public long getId() {
        return this.mId;
    }

    public void setId(long pId) {
        this.mId = pId;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public void setUsername(String pUsername) {
        this.mUsername = pUsername;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public void setFirstName(String pFirstName) {
        this.mFirstName = pFirstName;
    }

    public String getLastName() {
        return this.mLastName;
    }

    public void setLastName(String pLastName) {
        this.mLastName = pLastName;
    }

    public List<Contact> getContacts() {
        return this.mContacts;
    }

    public void setContacts(List<Contact> pContacts) {
        this.mContacts = pContacts;
    }
}
