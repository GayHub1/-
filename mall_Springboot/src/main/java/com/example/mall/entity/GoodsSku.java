package com.example.mall.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class GoodsSku implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.sp
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private String sp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.goodsid
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Integer goodsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.stock
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.price
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku.pic
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_sku
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.sp
     *
     * @return the value of goods_sku.sp
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public String getSp() {
        return sp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.sp
     *
     * @param sp the value for goods_sku.sp
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setSp(String sp) {
        this.sp = sp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.goodsid
     *
     * @return the value of goods_sku.goodsid
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.goodsid
     *
     * @param goodsid the value for goods_sku.goodsid
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.stock
     *
     * @return the value of goods_sku.stock
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.stock
     *
     * @param stock the value for goods_sku.stock
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.price
     *
     * @return the value of goods_sku.price
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.price
     *
     * @param price the value for goods_sku.price
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku.pic
     *
     * @return the value of goods_sku.pic
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku.pic
     *
     * @param pic the value for goods_sku.pic
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic;
    }
}