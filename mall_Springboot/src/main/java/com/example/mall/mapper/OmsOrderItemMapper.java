package com.example.mall.mapper;

import com.example.mall.entity.OmsOrderItem;
import com.example.mall.entity.OmsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface OmsOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @SelectProvider(type=OmsOrderItemSqlProvider.class, method="countByExample")
    long countByExample(OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @DeleteProvider(type=OmsOrderItemSqlProvider.class, method="deleteByExample")
    int deleteByExample(OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @Delete({
        "delete from oms_order_item",
        "where item_id = #{itemId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @Insert({
        "insert into oms_order_item (item_id, order_id, ",
        "order_sn, product_id, ",
        "product_pic, product_name, ",
        "product_brand, product_price, ",
        "product_quantity, product_sku_id, ",
        "product_attr)",
        "values (#{itemId,jdbcType=BIGINT}, #{orderId,jdbcType=BIGINT}, ",
        "#{orderSn,jdbcType=VARCHAR}, #{productId,jdbcType=BIGINT}, ",
        "#{productPic,jdbcType=VARCHAR}, #{productName,jdbcType=VARCHAR}, ",
        "#{productBrand,jdbcType=VARCHAR}, #{productPrice,jdbcType=DECIMAL}, ",
        "#{productQuantity,jdbcType=INTEGER}, #{productSkuId,jdbcType=BIGINT}, ",
        "#{productAttr,jdbcType=VARCHAR})"
    })
    int insert(OmsOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @InsertProvider(type=OmsOrderItemSqlProvider.class, method="insertSelective")
    int insertSelective(OmsOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @SelectProvider(type=OmsOrderItemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_pic", property="productPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_brand", property="productBrand", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_price", property="productPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="product_quantity", property="productQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="product_sku_id", property="productSkuId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_attr", property="productAttr", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsOrderItem> selectByExample(OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @Select({
        "select",
        "item_id, order_id, order_sn, product_id, product_pic, product_name, product_brand, ",
        "product_price, product_quantity, product_sku_id, product_attr",
        "from oms_order_item",
        "where item_id = #{itemId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_pic", property="productPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_brand", property="productBrand", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_price", property="productPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="product_quantity", property="productQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="product_sku_id", property="productSkuId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_attr", property="productAttr", jdbcType=JdbcType.VARCHAR)
    })
    OmsOrderItem selectByPrimaryKey(Long itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @UpdateProvider(type=OmsOrderItemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @UpdateProvider(type=OmsOrderItemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @UpdateProvider(type=OmsOrderItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OmsOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    @Update({
        "update oms_order_item",
        "set order_id = #{orderId,jdbcType=BIGINT},",
          "order_sn = #{orderSn,jdbcType=VARCHAR},",
          "product_id = #{productId,jdbcType=BIGINT},",
          "product_pic = #{productPic,jdbcType=VARCHAR},",
          "product_name = #{productName,jdbcType=VARCHAR},",
          "product_brand = #{productBrand,jdbcType=VARCHAR},",
          "product_price = #{productPrice,jdbcType=DECIMAL},",
          "product_quantity = #{productQuantity,jdbcType=INTEGER},",
          "product_sku_id = #{productSkuId,jdbcType=BIGINT},",
          "product_attr = #{productAttr,jdbcType=VARCHAR}",
        "where item_id = #{itemId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OmsOrderItem record);
}