package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidbaselibrary.models.ModelBase;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.ForeignKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Relationship;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

import java.util.Date;
import java.util.List;

@Table(name = "product_order")
public class ProductOrder extends ModelBase {
    @Column(name = "_id", nullable = false)
    @PrimaryKey(autoIncrement = true)
    private long mId;

    @Column(name = "order_date", nullable = false)
    private Date mOrderDate;

    @Column(name = "user_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @Relationship
    private User mUser;

    @Relationship(foreignColumnName = "order_id")
    private List<ProductOrderDetail> mProductOrderDetails;

    public long getId() {
        return this.mId;
    }

    public void setId(long pId) {
        this.mId = pId;
    }

    public Date getOrderDate() {
        return this.mOrderDate;
    }

    public void setOrderDate(Date pOrderDate) {
        this.mOrderDate = pOrderDate;
    }

    public User getUser() {
        return this.mUser;
    }

    public void setUser(User pUser) {
        this.mUser = pUser;
    }

    public List<ProductOrderDetail> getProductOrderDetails() {
        return this.mProductOrderDetails;
    }

    public void setProductOrderDetails(List<ProductOrderDetail> pProductOrderDetails) {
        this.mProductOrderDetails = pProductOrderDetails;
    }

    /*
    @Column(name = "user_id1", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @Relationship
    private User mUser1;

    @Column(name = "user_id2", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @Relationship
    private User mUser2;

    public User getUser1() {
        return this.mUser1;
    }

    public void setUser1(User pUser1) {
        this.mUser1 = pUser1;
    }

    public User getUser2() {
        return this.mUser2;
    }

    public void setUser2(User pUser2) {
        this.mUser2 = pUser2;
    }
    */
}
