package com.example.mall.entity;

import java.io.Serializable;

public class Discuss implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss.discussid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private Integer discussid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss.userid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss.goodsid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private Integer goodsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss.content
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss.grade
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private Integer grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table discuss
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss.discussid
     *
     * @return the value of discuss.discussid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public Integer getDiscussid() {
        return discussid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss.discussid
     *
     * @param discussid the value for discuss.discussid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setDiscussid(Integer discussid) {
        this.discussid = discussid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss.userid
     *
     * @return the value of discuss.userid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss.userid
     *
     * @param userid the value for discuss.userid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss.goodsid
     *
     * @return the value of discuss.goodsid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss.goodsid
     *
     * @param goodsid the value for discuss.goodsid
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss.content
     *
     * @return the value of discuss.content
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss.content
     *
     * @param content the value for discuss.content
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss.grade
     *
     * @return the value of discuss.grade
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss.grade
     *
     * @param grade the value for discuss.grade
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}