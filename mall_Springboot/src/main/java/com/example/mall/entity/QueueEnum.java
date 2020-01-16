package com.example.mall.entity;


import org.springframework.stereotype.Component;

/**
 * 消息队列枚举配置
 * Created by macro on 2018/9/14.
 */

public enum QueueEnum {
    /**
     * 消息通知队列
     */
    QUEUE_ORDER_CANCEL("mall.order.direct", "mall.order.cancel", "mall.order.cancel"),
    /**
     * 消息通知ttl队列
     */
    QUEUE_TTL_ORDER_CANCEL("mall.order.direct.ttl", "mall.order.cancel.ttl", "mall.order.cancel.ttl");

    /**
     * 交换名称
     */
    private String exchange;
    public String getExchange() {
        return exchange;
    }
    public void setExchange(String  exchange) {
        this.exchange=exchange;
    }
    /**
     * 队列名称
     */
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String  name) {
        this.name=name;
    }
    /**
     * 路由键
     */
    private String routeKey;
    public String getRouteKey() {
        return routeKey;
    }
    public void setRouteKey(String  routeKey) {
        this.routeKey=routeKey;
    }

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
