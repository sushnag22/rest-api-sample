package tech.sushnag22.restapisample.model;

public class CloudVendor {

    private String vendorId;
    private String vendorName;
    private String vendorAddress;

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
    }

}
