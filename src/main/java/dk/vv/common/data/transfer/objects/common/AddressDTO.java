package dk.vv.common.data.transfer.objects.common;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class AddressDTO {
    private Integer id;

    private int zipCode;

    private String city;

    private String address;

    public AddressDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
