package com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite;

import com.dreamdigitizers.androidbaselibrary.models.ModelBase;
import com.dreamdigitizers.androidsqliteorm.annotations.Column;
import com.dreamdigitizers.androidsqliteorm.annotations.PrimaryKey;
import com.dreamdigitizers.androidsqliteorm.annotations.Relationship;
import com.dreamdigitizers.androidsqliteorm.annotations.Table;

import java.util.List;

@Table(name = "product_categorize")
public class ProductCategorize extends ModelBase {
    @Column(name = "_id", nullable = false)
    @PrimaryKey(autoIncrement = true)
    private long mId;

    @Column(name = "name", nullable = false)
    private String mName;

    @Column(name = "description")
    private String mDescription;

    @Relationship(optional = true, foreignColumnName = "product_categorize_id")
    private List<Product> mProducts;

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

    public String getDescription() {
        return this.mDescription;
    }

    public void setDescription(String pDescription) {
        this.mDescription = pDescription;
    }

    public List<Product> getProducts() {
        return this.mProducts;
    }

    public void setProducts(List<Product> pProducts) {
        this.mProducts = pProducts;
    }
}
