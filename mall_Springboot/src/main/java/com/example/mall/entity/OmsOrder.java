package com.example.mall.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class OmsOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.id
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Long id;
    private List<OmsOrderItem> omsOrderItems;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.member_id
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.order_sn
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.create_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.member_username
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private String memberUsername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.pay_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private BigDecimal payAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.integration_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private BigDecimal integrationAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.coupon_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private BigDecimal couponAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_name
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private String receiverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_phone
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private String receiverPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_adress
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private String receiverAdress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.note
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.confirm_status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Integer confirmStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.delete_status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Integer deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.payment_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Date paymentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.delivery_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Date deliveryTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receive_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Date receiveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.comment_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private Date commentTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.id
     *
     * @return the value of oms_order.id
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.id
     *
     * @param id the value for oms_order.id
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.member_id
     *
     * @return the value of oms_order.member_id
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.member_id
     *
     * @param memberId the value for oms_order.member_id
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.order_sn
     *
     * @return the value of oms_order.order_sn
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.order_sn
     *
     * @param orderSn the value for oms_order.order_sn
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.create_time
     *
     * @return the value of oms_order.create_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.create_time
     *
     * @param createTime the value for oms_order.create_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.member_username
     *
     * @return the value of oms_order.member_username
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.member_username
     *
     * @param memberUsername the value for oms_order.member_username
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.pay_amount
     *
     * @return the value of oms_order.pay_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.pay_amount
     *
     * @param payAmount the value for oms_order.pay_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.integration_amount
     *
     * @return the value of oms_order.integration_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.integration_amount
     *
     * @param integrationAmount the value for oms_order.integration_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.coupon_amount
     *
     * @return the value of oms_order.coupon_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.coupon_amount
     *
     * @param couponAmount the value for oms_order.coupon_amount
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.status
     *
     * @return the value of oms_order.status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.status
     *
     * @param status the value for oms_order.status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_name
     *
     * @return the value of oms_order.receiver_name
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_name
     *
     * @param receiverName the value for oms_order.receiver_name
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_phone
     *
     * @return the value of oms_order.receiver_phone
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_phone
     *
     * @param receiverPhone the value for oms_order.receiver_phone
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_adress
     *
     * @return the value of oms_order.receiver_adress
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public String getReceiverAdress() {
        return receiverAdress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_adress
     *
     * @param receiverAdress the value for oms_order.receiver_adress
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setReceiverAdress(String receiverAdress) {
        this.receiverAdress = receiverAdress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.note
     *
     * @return the value of oms_order.note
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.note
     *
     * @param note the value for oms_order.note
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.confirm_status
     *
     * @return the value of oms_order.confirm_status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.confirm_status
     *
     * @param confirmStatus the value for oms_order.confirm_status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.delete_status
     *
     * @return the value of oms_order.delete_status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.delete_status
     *
     * @param deleteStatus the value for oms_order.delete_status
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.payment_time
     *
     * @return the value of oms_order.payment_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.payment_time
     *
     * @param paymentTime the value for oms_order.payment_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.delivery_time
     *
     * @return the value of oms_order.delivery_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.delivery_time
     *
     * @param deliveryTime the value for oms_order.delivery_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receive_time
     *
     * @return the value of oms_order.receive_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receive_time
     *
     * @param receiveTime the value for oms_order.receive_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.comment_time
     *
     * @return the value of oms_order.comment_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.comment_time
     *
     * @param commentTime the value for oms_order.comment_time
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public List<OmsOrderItem> getOmsOrderItems() {
        return omsOrderItems;
    }

    public void setOmsOrderItems(List<OmsOrderItem> omsOrderItems) {
        this.omsOrderItems = omsOrderItems;
    }
}