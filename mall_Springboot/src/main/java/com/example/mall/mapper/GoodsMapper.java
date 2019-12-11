package com.example.mall.mapper;

import com.example.mall.entity.Goods;
import com.example.mall.entity.GoodsExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @SelectProvider(type=GoodsSqlProvider.class, method="countByExample")
    long countByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @DeleteProvider(type=GoodsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @Delete({
        "delete from goods",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @Insert({
        "insert into goods (id, name, ",
        "attribute, price, ",
        "details, Imageid, ",
        "salesvolume, store, ",
        "storeid, date)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{attribute,jdbcType=VARCHAR}, #{price,jdbcType=INTEGER}, ",
        "#{details,jdbcType=VARCHAR}, #{imageid,jdbcType=INTEGER}, ",
        "#{salesvolume,jdbcType=INTEGER}, #{store,jdbcType=VARCHAR}, ",
        "#{storeid,jdbcType=INTEGER}, #{date,jdbcType=TIMESTAMP})"
    })
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @InsertProvider(type=GoodsSqlProvider.class, method="insertSelective")
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @SelectProvider(type=GoodsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="details", property="details", jdbcType=JdbcType.VARCHAR),
        @Result(column="Imageid", property="imageid", jdbcType=JdbcType.INTEGER),
        @Result(column="salesvolume", property="salesvolume", jdbcType=JdbcType.INTEGER),
        @Result(column="store", property="store", jdbcType=JdbcType.VARCHAR),
        @Result(column="storeid", property="storeid", jdbcType=JdbcType.INTEGER),
        @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Goods> selectByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @Select({
        "select",
        "id, name, attribute, price, details, Imageid, salesvolume, store, storeid, date",
        "from goods",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="details", property="details", jdbcType=JdbcType.VARCHAR),
        @Result(column="Imageid", property="imageid", jdbcType=JdbcType.INTEGER),
        @Result(column="salesvolume", property="salesvolume", jdbcType=JdbcType.INTEGER),
        @Result(column="store", property="store", jdbcType=JdbcType.VARCHAR),
        @Result(column="storeid", property="storeid", jdbcType=JdbcType.INTEGER),
        @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP)
    })
    Goods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 10 10:29:22 CST 2019
     */
    @Update({
        "update goods",
        "set name = #{name,jdbcType=VARCHAR},",
          "attribute = #{attribute,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=INTEGER},",
          "details = #{details,jdbcType=VARCHAR},",
          "Imageid = #{imageid,jdbcType=INTEGER},",
          "salesvolume = #{salesvolume,jdbcType=INTEGER},",
          "store = #{store,jdbcType=VARCHAR},",
          "storeid = #{storeid,jdbcType=INTEGER},",
          "date = #{date,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Goods record);
    @Update({
            "update goods",
            "set score=score+#{num,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int addsalesvolume(Long id, Integer num);

}