package dk.vv.common.data.transfer.objects.kitchen;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "TicketLine")
@RegisterForReflection
public class TicketLineDTO {

    private int id;
    private int productId;

    private int quantity;

    private String productName;

    @JsonBackReference
    private TicketDTO ticketDTO;

    public TicketLineDTO() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public TicketDTO getTicketDTO() {
        return ticketDTO;
    }

    public void setTicketDTO(TicketDTO ticketDTO) {
        this.ticketDTO = ticketDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
