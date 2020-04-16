package de.infomotion.kw.demo.services.kwdb;

import de.infomotion.kw.demo.model.kwdb.Vendor;
import de.infomotion.kw.demo.repository.kwdb.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

	private List<Vendor> vendorList;

	@Autowired
	VendorRepository vendorRepository;

	public void saveVendor() {
		vendorRepository.saveAll(vendorList);
	}

	public void setVendorList(List<Vendor> vendorList) {
		this.vendorList = vendorList;
	}
}
