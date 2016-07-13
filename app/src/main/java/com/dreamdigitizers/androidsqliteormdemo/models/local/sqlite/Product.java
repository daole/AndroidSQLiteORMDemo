package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidbaselibrary.models.ModelBase;
import com.dreamdigitizers.androidsqliteorm.FetchType;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.ForeignKey;
import com.dreamdigitizers.androidsqliteorm.annotations.ManyToOne;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

@Table(name = "product")
public class Product extends ModelBase {
    @Column(name = "_id", nullable = false)
    @PrimaryKey(autoIncrement = true)
    private long mId;

    @Column(name = "name", nullable = false)
    private String mName;

    @Column(name = "price", nullable = false)
    private int mPrice;

    @Column(name = "description")
    private String mDescription;

    @Column(name = "product_categorize_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private ProductCategorize mProductCategorize;

    @Column(name = "supplier_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private Supplier mSupplier;

    @Column(name = "manufacturer_id", nullable = false)
    @ForeignKey(primaryColumnName = "_id")
    @ManyToOne(fetchType = FetchType.EAGER)
    private Manufacturer mManufacturer;

    public long getId() {
        return this.mId;
    }

    public void setId(long pId) {
        this.mId = pId;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String pName) {
        this.mName = pName;
    }

    public int getPrice() {
        return this.mPrice;
    }

    public void setPrice(int pPrice) {
        this.mPrice = pPrice;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public void setDescription(String pDescription) {
        this.mDescription = pDescription;
    }

    public ProductCategorize getProductCategorize() {
        return this.mProductCategorize;
    }

    public void setProductCategorize(ProductCategorize pProductCategorize) {
        this.mProductCategorize = pProductCategorize;
    }

    public Supplier getSupplier() {
        return this.mSupplier;
    }

    public void setSupplier(Supplier pSupplier) {
        this.mSupplier = pSupplier;
    }

    public Manufacturer getManufacturer() {
        return this.mManufacturer;
    }

    public void setManufacturer(Manufacturer pManufacturer) {
        this.mManufacturer = pManufacturer;
    }
}
