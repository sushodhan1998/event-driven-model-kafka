package com.sush.base_domain.dto;


public class Order {
    private String orderId;
    private String name;
    private int qyt;
    private double price;

    public Order(String orderId, String name, int qyt, double price) {
        this.orderId = orderId;
        this.name = name;
        this.qyt = qyt;
        this.price = price;
    }

    public Order() {
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getName() {
        return this.name;
    }

    public int getQyt() {
        return this.qyt;
    }

    public double getPrice() {
        return this.price;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQyt(int qyt) {
        this.qyt = qyt;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Order)) return false;
        final Order other = (Order) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getQyt() != other.getQyt()) return false;
        if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Order;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getQyt();
        final long $price = Double.doubleToLongBits(this.getPrice());
        result = result * PRIME + (int) ($price >>> 32 ^ $price);
        return result;
    }

    public String toString() {
        return "Order(orderId=" + this.getOrderId() + ", name=" + this.getName() + ", qyt=" + this.getQyt() + ", price=" + this.getPrice() + ")";
    }
}
