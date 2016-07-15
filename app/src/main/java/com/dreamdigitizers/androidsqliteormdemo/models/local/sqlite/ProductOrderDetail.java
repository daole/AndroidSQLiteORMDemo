package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidbaselibrary.models.ModelBase;
import com.dreamdigitizers.androidsqliteorm.FetchType;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.ForeignKey;
import com.dreamdigitizers.androidsqliteorm.annotations.ManyToOne;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

@Table(name = "product_order_detail")
public class ProductOrderDetail extends ModelBase {
    @Column(name = "_id", nullable = false)
    @PrimaryKey(autoIncrement = true)
    private long mId;

    @Column(name = "sale_price", nullable = false)
    private int mSalePrice;

    @Column(name = "quantity", nullable = false)
    private int mQuantity;

    @Column(name = "order_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private ProductOrder mProductOrder;

    @Column(name = "product_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private Product mProduct;

    public long getId() {
        return this.mId;
    }

    public void setId(long pId) {
        this.mId = pId;
    }

    public int getSalePrice() {
        return this.mSalePrice;
    }

    public void setSalePrice(int pSalePrice) {
        this.mSalePrice = pSalePrice;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public void setQuantity(int pQuantity) {
        this.mQuantity = pQuantity;
    }

    public ProductOrder getProductOrder() {
        return this.mProductOrder;
    }

    public void setProductOrder(ProductOrder pProductOrder) {
        this.mProductOrder = pProductOrder;
    }

    public Product getProduct() {
        return this.mProduct;
    }

    public void setProduct(Product pProduct) {
        this.mProduct = pProduct;
    }
}
