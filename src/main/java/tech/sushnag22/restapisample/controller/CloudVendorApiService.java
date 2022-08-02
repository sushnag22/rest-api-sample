package tech.sushnag22.restapisample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.sushnag22.restapisample.model.CloudVendor;

@RestController
@RequestMapping("/cloud-vendors")
public class CloudVendorApiService {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return new CloudVendor("1", "Amazon",
                "United States of America");
    }

}
