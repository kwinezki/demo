package de.infomotion.kw.demo.dto;


import de.infomotion.kw.demo.model.kwdb.Vendor;
import de.infomotion.kw.demo.model.summerwine.SummerwineVendor;

import java.util.ArrayList;
import java.util.List;

public class VendorDto {

    private List<SummerwineVendor> summerwineVendorList;
    private List<Vendor> vendorList = new ArrayList<>();

    public VendorDto(List<SummerwineVendor> summerwineVendorList) {
        this.summerwineVendorList = summerwineVendorList;
    }

    public void transferObject() {
        summerwineVendorList.forEach(summerwineVendor -> {
            Vendor vendor = new Vendor();
           vendor.setVendorNumber(summerwineVendor.getVendorNumber());
           vendor.setCommissionFactor(summerwineVendor.getCommissionFactor());
           vendor.setCountryShortCode(summerwineVendor.getCountryShortCode());
           vendor.setDepartmentNumber(summerwineVendor.getDepartmentNumber());
           vendor.setVendorFirstName(summerwineVendor.getVendorFirstName());
           vendor.setVendorLastName(summerwineVendor.getVendorLastName());

            vendorList.add(vendor);

        });
    }

    public List<Vendor> getVendorList() {
        return vendorList;
    }

}


