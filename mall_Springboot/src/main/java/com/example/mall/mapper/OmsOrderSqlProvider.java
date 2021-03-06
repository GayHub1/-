package com.example.mall.mapper;

import com.example.mall.entity.OmsOrder;
import com.example.mall.entity.OmsOrderExample.Criteria;
import com.example.mall.entity.OmsOrderExample.Criterion;
import com.example.mall.entity.OmsOrderExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OmsOrderSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String countByExample(OmsOrderExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("oms_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String deleteByExample(OmsOrderExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("oms_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String insertSelective(OmsOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("oms_order");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getMemberId() != null) {
            sql.VALUES("member_id", "#{memberId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderSn() != null) {
            sql.VALUES("order_sn", "#{orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMemberUsername() != null) {
            sql.VALUES("member_username", "#{memberUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getPayAmount() != null) {
            sql.VALUES("pay_amount", "#{payAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegrationAmount() != null) {
            sql.VALUES("integration_amount", "#{integrationAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponAmount() != null) {
            sql.VALUES("coupon_amount", "#{couponAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getReceiverName() != null) {
            sql.VALUES("receiver_name", "#{receiverName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverPhone() != null) {
            sql.VALUES("receiver_phone", "#{receiverPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverAdress() != null) {
            sql.VALUES("receiver_adress", "#{receiverAdress,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getConfirmStatus() != null) {
            sql.VALUES("confirm_status", "#{confirmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getDeleteStatus() != null) {
            sql.VALUES("delete_status", "#{deleteStatus,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentTime() != null) {
            sql.VALUES("payment_time", "#{paymentTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliveryTime() != null) {
            sql.VALUES("delivery_time", "#{deliveryTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReceiveTime() != null) {
            sql.VALUES("receive_time", "#{receiveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCommentTime() != null) {
            sql.VALUES("comment_time", "#{commentTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStoreId() != null) {
            sql.VALUES("store_id", "#{storeId,jdbcType=INTEGER}");
        }
        
        if (record.getStoreName() != null) {
            sql.VALUES("store_name", "#{storeName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String selectByExample(OmsOrderExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("member_id");
        sql.SELECT("order_sn");
        sql.SELECT("create_time");
        sql.SELECT("member_username");
        sql.SELECT("pay_amount");
        sql.SELECT("integration_amount");
        sql.SELECT("coupon_amount");
        sql.SELECT("status");
        sql.SELECT("receiver_name");
        sql.SELECT("receiver_phone");
        sql.SELECT("receiver_adress");
        sql.SELECT("note");
        sql.SELECT("confirm_status");
        sql.SELECT("delete_status");
        sql.SELECT("payment_time");
        sql.SELECT("delivery_time");
        sql.SELECT("receive_time");
        sql.SELECT("comment_time");
        sql.SELECT("store_id");
        sql.SELECT("store_name");
        sql.FROM("oms_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        OmsOrder record = (OmsOrder) parameter.get("record");
        OmsOrderExample example = (OmsOrderExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("oms_order");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getMemberId() != null) {
            sql.SET("member_id = #{record.memberId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderSn() != null) {
            sql.SET("order_sn = #{record.orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMemberUsername() != null) {
            sql.SET("member_username = #{record.memberUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getPayAmount() != null) {
            sql.SET("pay_amount = #{record.payAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegrationAmount() != null) {
            sql.SET("integration_amount = #{record.integrationAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponAmount() != null) {
            sql.SET("coupon_amount = #{record.couponAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getReceiverName() != null) {
            sql.SET("receiver_name = #{record.receiverName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverPhone() != null) {
            sql.SET("receiver_phone = #{record.receiverPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverAdress() != null) {
            sql.SET("receiver_adress = #{record.receiverAdress,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{record.note,jdbcType=VARCHAR}");
        }
        
        if (record.getConfirmStatus() != null) {
            sql.SET("confirm_status = #{record.confirmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getDeleteStatus() != null) {
            sql.SET("delete_status = #{record.deleteStatus,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentTime() != null) {
            sql.SET("payment_time = #{record.paymentTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliveryTime() != null) {
            sql.SET("delivery_time = #{record.deliveryTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReceiveTime() != null) {
            sql.SET("receive_time = #{record.receiveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCommentTime() != null) {
            sql.SET("comment_time = #{record.commentTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStoreId() != null) {
            sql.SET("store_id = #{record.storeId,jdbcType=INTEGER}");
        }
        
        if (record.getStoreName() != null) {
            sql.SET("store_name = #{record.storeName,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("oms_order");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("member_id = #{record.memberId,jdbcType=BIGINT}");
        sql.SET("order_sn = #{record.orderSn,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("member_username = #{record.memberUsername,jdbcType=VARCHAR}");
        sql.SET("pay_amount = #{record.payAmount,jdbcType=DECIMAL}");
        sql.SET("integration_amount = #{record.integrationAmount,jdbcType=DECIMAL}");
        sql.SET("coupon_amount = #{record.couponAmount,jdbcType=DECIMAL}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("receiver_name = #{record.receiverName,jdbcType=VARCHAR}");
        sql.SET("receiver_phone = #{record.receiverPhone,jdbcType=VARCHAR}");
        sql.SET("receiver_adress = #{record.receiverAdress,jdbcType=VARCHAR}");
        sql.SET("note = #{record.note,jdbcType=VARCHAR}");
        sql.SET("confirm_status = #{record.confirmStatus,jdbcType=INTEGER}");
        sql.SET("delete_status = #{record.deleteStatus,jdbcType=INTEGER}");
        sql.SET("payment_time = #{record.paymentTime,jdbcType=TIMESTAMP}");
        sql.SET("delivery_time = #{record.deliveryTime,jdbcType=TIMESTAMP}");
        sql.SET("receive_time = #{record.receiveTime,jdbcType=TIMESTAMP}");
        sql.SET("comment_time = #{record.commentTime,jdbcType=TIMESTAMP}");
        sql.SET("store_id = #{record.storeId,jdbcType=INTEGER}");
        sql.SET("store_name = #{record.storeName,jdbcType=VARCHAR}");
        
        OmsOrderExample example = (OmsOrderExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    public String updateByPrimaryKeySelective(OmsOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("oms_order");
        
        if (record.getMemberId() != null) {
            sql.SET("member_id = #{memberId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderSn() != null) {
            sql.SET("order_sn = #{orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMemberUsername() != null) {
            sql.SET("member_username = #{memberUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getPayAmount() != null) {
            sql.SET("pay_amount = #{payAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegrationAmount() != null) {
            sql.SET("integration_amount = #{integrationAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCouponAmount() != null) {
            sql.SET("coupon_amount = #{couponAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getReceiverName() != null) {
            sql.SET("receiver_name = #{receiverName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverPhone() != null) {
            sql.SET("receiver_phone = #{receiverPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverAdress() != null) {
            sql.SET("receiver_adress = #{receiverAdress,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getConfirmStatus() != null) {
            sql.SET("confirm_status = #{confirmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getDeleteStatus() != null) {
            sql.SET("delete_status = #{deleteStatus,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentTime() != null) {
            sql.SET("payment_time = #{paymentTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliveryTime() != null) {
            sql.SET("delivery_time = #{deliveryTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReceiveTime() != null) {
            sql.SET("receive_time = #{receiveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCommentTime() != null) {
            sql.SET("comment_time = #{commentTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStoreId() != null) {
            sql.SET("store_id = #{storeId,jdbcType=INTEGER}");
        }
        
        if (record.getStoreName() != null) {
            sql.SET("store_name = #{storeName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Jan 21 15:21:21 CST 2020
     */
    protected void applyWhere(SQL sql, OmsOrderExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}