package com.thegutuproject.pizzashop.db.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class OrderEntryDb implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_entry.ORDER_ENTRY_ID
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    private Integer orderEntryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_entry.FOOD_ITEM
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    private String foodItem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_entry.ORDER_TIME
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    private Timestamp orderTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_entry.ORDER_LOG_ID
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    private Integer orderLogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_entry
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_entry.ORDER_ENTRY_ID
     *
     * @return the value of order_entry.ORDER_ENTRY_ID
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    public Integer getOrderEntryId() {
        return orderEntryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_entry.ORDER_ENTRY_ID
     *
     * @param orderEntryId the value for order_entry.ORDER_ENTRY_ID
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    public void setOrderEntryId(Integer orderEntryId) {
        this.orderEntryId = orderEntryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_entry.FOOD_ITEM
     *
     * @return the value of order_entry.FOOD_ITEM
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    public String getFoodItem() {
        return foodItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_entry.FOOD_ITEM
     *
     * @param foodItem the value for order_entry.FOOD_ITEM
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_entry.ORDER_TIME
     *
     * @return the value of order_entry.ORDER_TIME
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    public Timestamp getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_entry.ORDER_TIME
     *
     * @param orderTime the value for order_entry.ORDER_TIME
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_entry.ORDER_LOG_ID
     *
     * @return the value of order_entry.ORDER_LOG_ID
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    public Integer getOrderLogId() {
        return orderLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_entry.ORDER_LOG_ID
     *
     * @param orderLogId the value for order_entry.ORDER_LOG_ID
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    public void setOrderLogId(Integer orderLogId) {
        this.orderLogId = orderLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_entry
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderEntryDb other = (OrderEntryDb) that;
        return (this.getOrderEntryId() == null ? other.getOrderEntryId() == null : this.getOrderEntryId().equals(other.getOrderEntryId()))
            && (this.getFoodItem() == null ? other.getFoodItem() == null : this.getFoodItem().equals(other.getFoodItem()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getOrderLogId() == null ? other.getOrderLogId() == null : this.getOrderLogId().equals(other.getOrderLogId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_entry
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderEntryId() == null) ? 0 : getOrderEntryId().hashCode());
        result = prime * result + ((getFoodItem() == null) ? 0 : getFoodItem().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getOrderLogId() == null) ? 0 : getOrderLogId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_entry
     *
     * @mbg.generated Tue Mar 13 14:55:23 EDT 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderEntryId=").append(orderEntryId);
        sb.append(", foodItem=").append(foodItem);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderLogId=").append(orderLogId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}