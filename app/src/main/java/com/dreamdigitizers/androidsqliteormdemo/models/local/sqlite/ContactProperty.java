package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidbaselibrary.models.ModelBase;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.ForeignKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Relationship;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

@Table(name = "contact_property")
public class ContactProperty extends ModelBase {
    @Column(name = "_id", nullable = false)
    @PrimaryKey(autoIncrement = true)
    private long mId;

    @Column(name = "contact_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @Relationship
    private Contact mContact;

    public long getId() {
        return this.mId;
    }

    public void setId(long pId) {
        this.mId = pId;
    }

    public Contact getContact() {
        return this.mContact;
    }

    public void setContact(Contact pContact) {
        this.mContact = pContact;
    }
}
