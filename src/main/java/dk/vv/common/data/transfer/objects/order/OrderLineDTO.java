package dk.vv.common.data.transfer.objects.order;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.math.BigDecimal;

@Schema(name = "OrderLine")
@RegisterForReflection
public class OrderLineDTO {
    private int id;

    @JsonBackReference
    private OrderDTO order;

    private int productId;

    private BigDecimal unitNetPrice;

    private BigDecimal unitGrossPrice;

    private int quantity;

    private BigDecimal total;

    private BigDecimal subTotal;

    // values used for processing
    private String productName;

    public OrderLineDTO() {
    }

//    public OrderLineDTO(OrderLine orderLine) {
//        this.id = orderLine.getId();
//        this.productId = orderLine.getProductId();
//        this.unitNetPrice = orderLine.getUnitNetPrice();
//        this.unitGrossPrice = orderLine.getUnitGrossPrice();
//        this.quantity = orderLine.getQuantity();
//        this.total = orderLine.getTotal();
//        this.subTotal = orderLine.getSubTotal();
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderDTO getOrder() {
        return order;
    }

    public void setOrder(OrderDTO order) {
        this.order = order;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public BigDecimal getUnitNetPrice() {
        return unitNetPrice;
    }

    public void setUnitNetPrice(BigDecimal unitNetPrice) {
        this.unitNetPrice = unitNetPrice;
    }

    public BigDecimal getUnitGrossPrice() {
        return unitGrossPrice;
    }

    public void setUnitGrossPrice(BigDecimal unitGrossPrice) {
        this.unitGrossPrice = unitGrossPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "OrderLineDTO{" +
                "id=" + id +
                ", order=" + order +
                ", productId=" + productId +
                ", unitNetPrice=" + unitNetPrice +
                ", unitGrossPrice=" + unitGrossPrice +
                ", quantity=" + quantity +
                ", total=" + total +
                ", subTotal=" + subTotal +
                '}';
    }
}
