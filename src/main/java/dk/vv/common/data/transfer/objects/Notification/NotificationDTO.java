package dk.vv.common.data.transfer.objects.Notification;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class NotificationDTO {
    private int customerId;

    private int orderId;

    private String message;

    public NotificationDTO() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
