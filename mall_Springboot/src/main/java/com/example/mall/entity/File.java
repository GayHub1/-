package com.example.mall.entity;

import java.io.Serializable;

public class File implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.id
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.url
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.name
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table file
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.id
     *
     * @return the value of file.id
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.id
     *
     * @param id the value for file.id
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.url
     *
     * @return the value of file.url
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.url
     *
     * @param url the value for file.url
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.name
     *
     * @return the value of file.name
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.name
     *
     * @param name the value for file.name
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }
}