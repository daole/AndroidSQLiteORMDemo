package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidbaselibrary.models.ModelBase;
import com.dreamdigitizers.androidsqliteorm.FetchType;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.ForeignKey;
import com.dreamdigitizers.androidsqliteorm.annotations.ManyToOne;
import com.dreamdigitizers.androidsqliteorm.annotations.OneToMany;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

import java.util.Date;
import java.util.List;

@Table(name = "order")
public class Order extends ModelBase {
    @Column(name = "_id", nullable = false)
    @PrimaryKey(autoIncrement = true)
    private long mId;

    @Column(name = "order_date", nullable = false)
    private Date mOrderDate;

    @Column(name = "user_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private User mUser;

    @Column(name = "user_id1", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private User mUser1;

    @Column(name = "user_id2", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private User mUser2;

    @OneToMany(foreignColumnName = "order_id", fetchType = FetchType.EAGER)
    private List<OrderDetail> mOrderDetails;

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

    public List<OrderDetail> getOrderDetails() {
        return this.mOrderDetails;
    }

    public void setOrderDetails(List<OrderDetail> pOrderDetails) {
        this.mOrderDetails = pOrderDetails;
    }
}
