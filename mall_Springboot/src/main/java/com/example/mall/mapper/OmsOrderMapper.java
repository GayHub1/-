package com.example.mall.mapper;

import com.example.mall.entity.OmsOrder;
import com.example.mall.entity.OmsOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface OmsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @SelectProvider(type=OmsOrderSqlProvider.class, method="countByExample")
    long countByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @DeleteProvider(type=OmsOrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @Delete({
        "delete from oms_order",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @Insert({
        "insert into oms_order (id, member_id, ",
        "order_sn, create_time, ",
        "member_username, pay_amount, ",
        "integration_amount, coupon_amount, ",
        "status, receiver_name, ",
        "receiver_phone, receiver_adress, ",
        "note, confirm_status, ",
        "delete_status, payment_time, ",
        "delivery_time, receive_time, ",
        "comment_time)",
        "values (#{id,jdbcType=BIGINT}, #{memberId,jdbcType=BIGINT}, ",
        "#{orderSn,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{memberUsername,jdbcType=VARCHAR}, #{payAmount,jdbcType=DECIMAL}, ",
        "#{integrationAmount,jdbcType=DECIMAL}, #{couponAmount,jdbcType=DECIMAL}, ",
        "#{status,jdbcType=INTEGER}, #{receiverName,jdbcType=VARCHAR}, ",
        "#{receiverPhone,jdbcType=VARCHAR}, #{receiverAdress,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{confirmStatus,jdbcType=INTEGER}, ",
        "#{deleteStatus,jdbcType=INTEGER}, #{paymentTime,jdbcType=TIMESTAMP}, ",
        "#{deliveryTime,jdbcType=TIMESTAMP}, #{receiveTime,jdbcType=TIMESTAMP}, ",
        "#{commentTime,jdbcType=TIMESTAMP})"
    })
    int insert(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @InsertProvider(type=OmsOrderSqlProvider.class, method="insertSelective")
    int insertSelective(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @SelectProvider(type=OmsOrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="member_username", property="memberUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="integration_amount", property="integrationAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_amount", property="couponAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="receiver_name", property="receiverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_phone", property="receiverPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_adress", property="receiverAdress", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="confirm_status", property="confirmStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="delete_status", property="deleteStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_time", property="paymentTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delivery_time", property="deliveryTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="receive_time", property="receiveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="comment_time", property="commentTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OmsOrder> selectByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @Select({
        "select",
        "id, member_id, order_sn, create_time, member_username, pay_amount, integration_amount, ",
        "coupon_amount, status, receiver_name, receiver_phone, receiver_adress, note, ",
        "confirm_status, delete_status, payment_time, delivery_time, receive_time, comment_time",
        "from oms_order",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="member_username", property="memberUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="integration_amount", property="integrationAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_amount", property="couponAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="receiver_name", property="receiverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_phone", property="receiverPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_adress", property="receiverAdress", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="confirm_status", property="confirmStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="delete_status", property="deleteStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_time", property="paymentTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delivery_time", property="deliveryTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="receive_time", property="receiveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="comment_time", property="commentTime", jdbcType=JdbcType.TIMESTAMP)
    })
    OmsOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @UpdateProvider(type=OmsOrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @UpdateProvider(type=OmsOrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @UpdateProvider(type=OmsOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Dec 10 17:29:53 CST 2019
     */
    @Update({
        "update oms_order",
        "set member_id = #{memberId,jdbcType=BIGINT},",
          "order_sn = #{orderSn,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "member_username = #{memberUsername,jdbcType=VARCHAR},",
          "pay_amount = #{payAmount,jdbcType=DECIMAL},",
          "integration_amount = #{integrationAmount,jdbcType=DECIMAL},",
          "coupon_amount = #{couponAmount,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=INTEGER},",
          "receiver_name = #{receiverName,jdbcType=VARCHAR},",
          "receiver_phone = #{receiverPhone,jdbcType=VARCHAR},",
          "receiver_adress = #{receiverAdress,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "confirm_status = #{confirmStatus,jdbcType=INTEGER},",
          "delete_status = #{deleteStatus,jdbcType=INTEGER},",
          "payment_time = #{paymentTime,jdbcType=TIMESTAMP},",
          "delivery_time = #{deliveryTime,jdbcType=TIMESTAMP},",
          "receive_time = #{receiveTime,jdbcType=TIMESTAMP},",
          "comment_time = #{commentTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OmsOrder record);
}