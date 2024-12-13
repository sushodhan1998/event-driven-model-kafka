package com.sush.base_domain.dto;

public class OrderEvent {
    private String message;
    private String status;
    private Order order;

    public OrderEvent(String message, String status, Order order) {
        this.message = message;
        this.status = status;
        this.order = order;
    }

    public OrderEvent() {
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderEvent)) return false;
        final OrderEvent other = (OrderEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$order = this.getOrder();
        final Object other$order = other.getOrder();
        if (this$order == null ? other$order != null : !this$order.equals(other$order)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $order = this.getOrder();
        result = result * PRIME + ($order == null ? 43 : $order.hashCode());
        return result;
    }

    public String toString() {
        return "OrderEvent(message=" + this.getMessage() + ", status=" + this.getStatus() + ", order=" + this.getOrder() + ")";
    }
}
