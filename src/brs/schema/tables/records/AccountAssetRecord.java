/*
 * This file is generated by jOOQ.
 */
package brs.schema.tables.records;


import brs.schema.tables.AccountAsset;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountAssetRecord extends UpdatableRecordImpl<AccountAssetRecord> implements Record7<Long, Long, Long, Long, Long, Integer, Boolean> {

    private static final long serialVersionUID = 715361395;

    /**
     * Setter for <code>DB.account_asset.db_id</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>DB.account_asset.db_id</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB.account_asset.account_id</code>.
     */
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>DB.account_asset.account_id</code>.
     */
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>DB.account_asset.asset_id</code>.
     */
    public void setAssetId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>DB.account_asset.asset_id</code>.
     */
    public Long getAssetId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>DB.account_asset.quantity</code>.
     */
    public void setQuantity(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>DB.account_asset.quantity</code>.
     */
    public Long getQuantity() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>DB.account_asset.unconfirmed_quantity</code>.
     */
    public void setUnconfirmedQuantity(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>DB.account_asset.unconfirmed_quantity</code>.
     */
    public Long getUnconfirmedQuantity() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>DB.account_asset.height</code>.
     */
    public void setHeight(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>DB.account_asset.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB.account_asset.latest</code>.
     */
    public void setLatest(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>DB.account_asset.latest</code>.
     */
    public Boolean getLatest() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Long, Long, Integer, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Long, Long, Integer, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AccountAsset.ACCOUNT_ASSET.DB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return AccountAsset.ACCOUNT_ASSET.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return AccountAsset.ACCOUNT_ASSET.ASSET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return AccountAsset.ACCOUNT_ASSET.QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return AccountAsset.ACCOUNT_ASSET.UNCONFIRMED_QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return AccountAsset.ACCOUNT_ASSET.HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return AccountAsset.ACCOUNT_ASSET.LATEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAssetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getUnconfirmedQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getLatest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAssetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getUnconfirmedQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getLatest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountAssetRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountAssetRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountAssetRecord value3(Long value) {
        setAssetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountAssetRecord value4(Long value) {
        setQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountAssetRecord value5(Long value) {
        setUnconfirmedQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountAssetRecord value6(Integer value) {
        setHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountAssetRecord value7(Boolean value) {
        setLatest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountAssetRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Integer value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountAssetRecord
     */
    public AccountAssetRecord() {
        super(AccountAsset.ACCOUNT_ASSET);
    }

    /**
     * Create a detached, initialised AccountAssetRecord
     */
    public AccountAssetRecord(Long dbId, Long accountId, Long assetId, Long quantity, Long unconfirmedQuantity, Integer height, Boolean latest) {
        super(AccountAsset.ACCOUNT_ASSET);

        set(0, dbId);
        set(1, accountId);
        set(2, assetId);
        set(3, quantity);
        set(4, unconfirmedQuantity);
        set(5, height);
        set(6, latest);
    }
}
