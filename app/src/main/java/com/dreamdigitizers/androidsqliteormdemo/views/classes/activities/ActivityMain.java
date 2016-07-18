package com.dreamdigitizers.androidsqliteormdemo.views.classes.activities;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;

import com.dreamdigitizers.androidbaselibrary.views.classes.activities.ActivityBase;
import com.dreamdigitizers.androidbaselibrary.views.classes.fragments.screens.ScreenBase;
import com.dreamdigitizers.androidsqliteorm.Repository;
import com.dreamdigitizers.androidsqliteorm.helpers.HelperSQLiteConfiguration;
import com.dreamdigitizers.androidsqliteormdemo.R;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.Contact;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.ContactProperty;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.Manufacturer;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.Product;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.ProductCategorize;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.ProductOrder;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.ProductOrderDetail;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.Supplier;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.User;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.UserProperty;
import com.dreamdigitizers.androidsqliteormdemo.views.classes.fragments.screens.ScreenMain;

import java.util.Date;

public class ActivityMain extends ActivityBase {
    private CoordinatorLayout mCoordinatorLayout;

    @Override
    protected void onCreate(Bundle pSavedInstanceState) {
        super.onCreate(pSavedInstanceState);
        this.initializeDatabase();
    }

    @Override
    protected CoordinatorLayout getCoordinatorLayout() {
        return this.mCoordinatorLayout;
    }

    @Override
    protected void setLayout() {
        this.setContentView(R.layout.activity__main);
    }

    @Override
    protected void retrieveItems() {
        this.mCoordinatorLayout = (CoordinatorLayout) this.findViewById(R.id.coordinatorLayout);
    }

    @Override
    protected void mapInformationToItems() {
    }

    @Override
    protected ScreenBase getStartScreen() {
        return new ScreenMain();
    }

    @Override
    protected int getScreenContainerViewId() {
        return R.id.placeHolderScreen;
    }

    private void initializeDatabase() {
        String databaseName = "test";
        this.deleteDatabase(databaseName);
        HelperSQLiteConfiguration.SQLiteConfigurationInformation sqliteConfigurationInformation = new HelperSQLiteConfiguration.SQLiteConfigurationInformation();
        sqliteConfigurationInformation.setDatabaseContext(this);
        sqliteConfigurationInformation.setDatabaseName(databaseName);
        sqliteConfigurationInformation.setDatabaseVersion(1);
        sqliteConfigurationInformation.setTableClasses(
                Contact.class,
                ContactProperty.class,
                Manufacturer.class,
                ProductOrder.class,
                ProductOrderDetail.class,
                Product.class,
                ProductCategorize.class,
                Supplier.class,
                User.class,
                UserProperty.class
        );
        HelperSQLiteConfiguration helperSQLiteConfiguration = new HelperSQLiteConfiguration(sqliteConfigurationInformation);
        Repository.initialize(helperSQLiteConfiguration);

        Repository repository = Repository.getInstance();

        User user1 = new User();
        user1.setId(1);
        user1.setUsername("user1");
        user1.setFirstName("first name 1");
        user1.setLastName("last name 1");
        repository.insert(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setUsername("user2");
        user2.setFirstName("first name 2");
        user2.setLastName("last name 2");
        repository.insert(user2);

        UserProperty userProperty1 = new UserProperty();
        userProperty1.setId(1);
        userProperty1.setUser(user1);
        repository.insert(userProperty1);

        UserProperty userProperty2 = new UserProperty();
        userProperty2.setId(2);
        userProperty2.setUser(user2);
        repository.insert(userProperty2);

        UserProperty userProperty3 = new UserProperty();
        userProperty3.setId(3);
        userProperty3.setUser(user2);
        repository.insert(userProperty3);

        UserProperty userProperty4 = new UserProperty();
        userProperty4.setId(4);
        userProperty4.setUser(user2);
        repository.insert(userProperty4);

        Contact contact1 = new Contact();
        contact1.setId(1);
        contact1.setAddress("user 1 address 1");
        contact1.setHomePhone("user 1 home phone 1");
        contact1.setCellPhone("user 1 cell phone 1");
        contact1.setUser(user1);
        repository.insert(contact1);

        Contact contact2 = new Contact();
        contact2.setId(2);
        contact2.setAddress("user 1 address 2");
        contact2.setHomePhone("user 1 home phone 2");
        contact2.setCellPhone("user 1 cell phone 2");
        contact2.setUser(user1);
        repository.insert(contact2);

        Contact contact3 = new Contact();
        contact3.setId(3);
        contact3.setAddress("user 2 address 1");
        contact3.setHomePhone("user 2 home phone 1");
        contact3.setCellPhone("user 2 cell phone 1");
        contact3.setUser(user2);
        repository.insert(contact3);

        Contact contact4 = new Contact();
        contact4.setId(4);
        contact4.setAddress("user 2 address 2");
        contact4.setHomePhone("user 2 home phone 2");
        contact4.setCellPhone("user 2 cell phone 2");
        contact4.setUser(user2);
        repository.insert(contact4);

        ContactProperty contactProperty1 = new ContactProperty();
        contactProperty1.setId(1);
        contactProperty1.setContact(contact1);
        repository.insert(contactProperty1);

        ContactProperty contactProperty2 = new ContactProperty();
        contactProperty2.setId(2);
        contactProperty2.setContact(contact1);
        repository.insert(contactProperty2);

        ContactProperty contactProperty3 = new ContactProperty();
        contactProperty3.setId(3);
        contactProperty3.setContact(contact1);
        repository.insert(contactProperty3);

        ContactProperty contactProperty4 = new ContactProperty();
        contactProperty4.setId(4);
        contactProperty4.setContact(contact2);
        repository.insert(contactProperty4);

        Manufacturer manufacturer1 = new Manufacturer();
        manufacturer1.setId(1);
        manufacturer1.setName("Manufacture 1");
        manufacturer1.setDescription("Manufacture 1 Description");
        repository.insert(manufacturer1);

        Manufacturer manufacturer2 = new Manufacturer();
        manufacturer2.setId(2);
        manufacturer2.setName("Manufacture 2");
        manufacturer2.setDescription("Manufacture 2 Description");
        repository.insert(manufacturer2);

        ProductCategorize productCategorize1 = new ProductCategorize();
        productCategorize1.setId(1);
        productCategorize1.setName("Product Categorize 1");
        productCategorize1.setDescription("Product Categorize 1 Description");
        repository.insert(productCategorize1);

        ProductCategorize productCategorize2 = new ProductCategorize();
        productCategorize2.setId(2);
        productCategorize2.setName("Product Categorize 2");
        productCategorize2.setDescription("Product Categorize 2 Description");
        repository.insert(productCategorize2);

        Supplier supplier1 = new Supplier();
        supplier1.setId(1);
        supplier1.setName("Supplier 1");
        supplier1.setDescription("Supplier 1 Description");
        repository.insert(supplier1);

        Supplier supplier2 = new Supplier();
        supplier2.setId(2);
        supplier2.setName("Supplier 2");
        supplier2.setDescription("Supplier 2 Description");
        repository.insert(supplier2);

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Product 1");
        product1.setPrice(111);
        product1.setDescription("Product 1 Description");
        product1.setProductCategorize(productCategorize1);
        product1.setSupplier(supplier1);
        product1.setManufacturer(manufacturer1);
        repository.insert(product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Product 2");
        product2.setPrice(222);
        product2.setDescription("Product 2 Description");
        product2.setProductCategorize(productCategorize1);
        product2.setSupplier(supplier1);
        product2.setManufacturer(manufacturer1);
        repository.insert(product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Product 3");
        product3.setPrice(333);
        product3.setDescription("Product 3 Description");
        product3.setProductCategorize(productCategorize2);
        product3.setSupplier(supplier2);
        product3.setManufacturer(manufacturer2);
        repository.insert(product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setName("Product 4");
        product4.setPrice(444);
        product4.setDescription("Product 4 Description");
        product4.setProductCategorize(productCategorize2);
        product4.setSupplier(supplier2);
        product4.setManufacturer(manufacturer2);
        repository.insert(product4);

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.setId(1);
        productOrder1.setOrderDate(new Date());
        productOrder1.setUser(user1);
        //productOrder1.setUser1(user1);
        //productOrder1.setUser2(user2);
        repository.insert(productOrder1);

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.setId(2);
        productOrder2.setOrderDate(new Date());
        productOrder2.setUser(user2);
        //productOrder2.setUser1(user1);
        //productOrder2.setUser2(user2);
        repository.insert(productOrder2);

        ProductOrderDetail productOrderDetail1 = new ProductOrderDetail();
        productOrderDetail1.setId(1);
        productOrderDetail1.setProduct(product1);
        productOrderDetail1.setSalePrice(product1.getPrice());
        productOrderDetail1.setQuantity(1);
        productOrderDetail1.setProductOrder(productOrder1);
        repository.insert(productOrderDetail1);

        ProductOrderDetail productOrderDetail2 = new ProductOrderDetail();
        productOrderDetail2.setId(2);
        productOrderDetail2.setProduct(product2);
        productOrderDetail2.setSalePrice(product2.getPrice());
        productOrderDetail2.setQuantity(2);
        productOrderDetail2.setProductOrder(productOrder1);
        repository.insert(productOrderDetail2);

        ProductOrderDetail productOrderDetail3 = new ProductOrderDetail();
        productOrderDetail3.setId(3);
        productOrderDetail3.setProduct(product1);
        productOrderDetail3.setSalePrice(product1.getPrice());
        productOrderDetail3.setQuantity(3);
        productOrderDetail3.setProductOrder(productOrder2);
        repository.insert(productOrderDetail3);

        ProductOrderDetail productOrderDetail4 = new ProductOrderDetail();
        productOrderDetail4.setId(4);
        productOrderDetail4.setProduct(product2);
        productOrderDetail4.setSalePrice(product2.getPrice());
        productOrderDetail4.setQuantity(4);
        productOrderDetail4.setProductOrder(productOrder2);
        repository.insert(productOrderDetail4);
    }
}
