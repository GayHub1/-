package com.example.mall.entity;

import java.io.Serializable;

public class GoodsSpec implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_spec.id
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_spec.goodsid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private Integer goodsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_spec.specName
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private String specname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_spec.sperValue
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private String spervalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_spec
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_spec.id
     *
     * @return the value of goods_spec.id
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_spec.id
     *
     * @param id the value for goods_spec.id
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_spec.goodsid
     *
     * @return the value of goods_spec.goodsid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_spec.goodsid
     *
     * @param goodsid the value for goods_spec.goodsid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_spec.specName
     *
     * @return the value of goods_spec.specName
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String getSpecname() {
        return specname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_spec.specName
     *
     * @param specname the value for goods_spec.specName
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setSpecname(String specname) {
        this.specname = specname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_spec.sperValue
     *
     * @return the value of goods_spec.sperValue
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String getSpervalue() {
        return spervalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_spec.sperValue
     *
     * @param spervalue the value for goods_spec.sperValue
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setSpervalue(String spervalue) {
        this.spervalue = spervalue;
    }
}