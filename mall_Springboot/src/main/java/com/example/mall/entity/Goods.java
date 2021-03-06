package com.example.mall.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Goods implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
//    public Goods(Integer id, String name, String attribute, Integer price, String details, Integer imageid, Integer salesvolume, String store, Integer storeid, Date date) {
//        this.id = id;
//        this.name = name;
//        this.attribute = attribute;
//        this.price = price;
//        this.details = details;
//        this.imageid = imageid;
//        this.salesvolume = salesvolume;
//        this.store = store;
//        this.storeid = storeid;
//        this.date = date;
//    }
    private List<GoodsSpec> goodsSpecList;



    private List<GoodsSku> goodsSkuList;
    public List<GoodsSpec> getGoodsSpecList() {
        return goodsSpecList;
    }

    public void setGoodsSpecList(List<GoodsSpec> goodsSpecList) {
        this.goodsSpecList = goodsSpecList;
    }

    public List<GoodsSku> getGoodsSkuList() {
        return goodsSkuList;
    }

    public void setGoodsSkuList(List<GoodsSku> goodsSkuList) {
        this.goodsSkuList = goodsSkuList;
    }
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.attribute
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private String attribute;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.details
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private String details;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.Imageid
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private String imageid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.salesvolume
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private Integer salesvolume;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.store
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private String store;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.storeid
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private Integer storeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.date
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.name
     *
     * @return the value of goods.name
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.name
     *
     * @param name the value for goods.name
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.attribute
     *
     * @return the value of goods.attribute
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.attribute
     *
     * @param attribute the value for goods.attribute
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.details
     *
     * @return the value of goods.details
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public String getDetails() {
        return details;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.details
     *
     * @param details the value for goods.details
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.Imageid
     *
     * @return the value of goods.Imageid
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public String getImageid() {
        return imageid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.Imageid
     *
     * @param imageid the value for goods.Imageid
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.salesvolume
     *
     * @return the value of goods.salesvolume
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public Integer getSalesvolume() {
        return salesvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.salesvolume
     *
     * @param salesvolume the value for goods.salesvolume
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setSalesvolume(Integer salesvolume) {
        this.salesvolume = salesvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.store
     *
     * @return the value of goods.store
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public String getStore() {
        return store;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.store
     *
     * @param store the value for goods.store
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setStore(String store) {
        this.store = store;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.storeid
     *
     * @return the value of goods.storeid
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public Integer getStoreid() {
        return storeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.storeid
     *
     * @param storeid the value for goods.storeid
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.date
     *
     * @return the value of goods.date
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.date
     *
     * @param date the value for goods.date
     *
     * @mbg.generated Tue Jan 21 13:36:59 CST 2020
     */
    public void setDate(Date date) {
        this.date = date;
    }
}