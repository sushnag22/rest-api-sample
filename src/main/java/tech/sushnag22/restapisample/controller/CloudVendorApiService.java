package tech.sushnag22.restapisample.controller;

import org.springframework.web.bind.annotation.*;
import tech.sushnag22.restapisample.model.CloudVendor;

@RestController
@RequestMapping("/cloud-vendors")
public class CloudVendorApiService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor readCloudVendorDetails(String vendorId) {
        return cloudVendor;
//                new CloudVendor("1", "Amazon",
//                "United States of America");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated successfully!";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud vendor deleted successfully!";
    }

}
