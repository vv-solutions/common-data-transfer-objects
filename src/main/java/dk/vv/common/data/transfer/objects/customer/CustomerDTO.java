package dk.vv.common.data.transfer.objects.customer;

import dk.vv.common.data.transfer.objects.common.AddressDTO;

import java.util.HashSet;
import java.util.Set;

public class CustomerDTO {


    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Set<AddressDTO> addresses = new HashSet<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressDTO> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(AddressDTO addressDTO){
        this.addresses.add(addressDTO);
    }
}

