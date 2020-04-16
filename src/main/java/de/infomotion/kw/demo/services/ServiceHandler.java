package de.infomotion.kw.demo.services;

import de.infomotion.kw.demo.dto.*;
import de.infomotion.kw.demo.model.summerwine.*;
import de.infomotion.kw.demo.services.kwdb.*;
import de.infomotion.kw.demo.services.summerwine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceHandler {

	//Country
	@Autowired SummerWineCountryService summerWineCountryService;
	@Autowired CountryService countryService;

	//Customer
	@Autowired CustomerService customerService;

	//Department
	@Autowired SummerWineDepartmentService summerWineDepartmentService;
	@Autowired DepartmentService departmentService;

	//Order
	@Autowired SummerWineOrderService summerWineOrderService;
	@Autowired OrderService orderService;

	//Product
	@Autowired SummerWineProductService summerWineProductService;
	@Autowired ProductService productService;

	//State
	@Autowired SummerWineStateService summerWineStateService;
	@Autowired StateService stateService;

	//Variety
	@Autowired SummerWineVarietyService summerWineVarietyService;
	@Autowired VarietyService varietyService;

	//Vendor
	@Autowired SummerWineVendorService summerWineVendorService;
	@Autowired VendorService vendorService;

	//Eventlistener
	@Transactional
	@EventListener(value = ApplicationReadyEvent.class)
	public void onStartup() {

		copyCountries();
		copyCustomer();
		copyDepartments();
		copyOrders();
		copyProducts();
		copyStates();
		copyVarieties();
		copyVendors();
	}

	private void copyVendors() {
		List<SummerwineVendor> summerwineVendorList = summerWineVendorService.getSummerWineVendorList();

		VendorDto vendorDto = new VendorDto(summerwineVendorList);
		vendorDto.transferObject();

		vendorService.setVendorList(vendorDto.getVendorList());
		vendorService.saveVendor();
	}

	private void copyVarieties() {
		List<SummerwineVariety> summerwineVarietyList = summerWineVarietyService.getSummerWineVarietList();

		VarietyDto varietyDto = new VarietyDto(summerwineVarietyList);
		varietyDto.transferObject();

		varietyService.setVarietyList(varietyDto.getVarietyList());
		varietyService.saveVarieties();
	}

	private void copyStates() {
		List<SummerwineState> summerwineStateList = summerWineStateService.getSummerWineStateList();

		StateDto stateDto = new StateDto(summerwineStateList);
		stateDto.transferObject();

		stateService.setStateList(stateDto.getStateList());
		stateService.saveStates();
	}

	//Methoden


	private void copyProducts() {
		List<SummerwineProduct> summerwineProductList = summerWineProductService.getSummerWineProductList();

		ProductDto productDto = new ProductDto(summerwineProductList);
		productDto.transferObject();

		productService.setProductList(productDto.getProductList());
		productService.saveProducts();
	}

	private void copyOrders() {
		List<SummerwineOrder> summerwineOrderList = summerWineOrderService.getSummerwineOrderList();

		OrderDto orderDto = new OrderDto(summerwineOrderList);
		orderDto.transferObject();

		orderService.setOrderList(orderDto.getOrderList());
		orderService.saveOrders();
	}


	public void copyDepartments() {
		List<SummerwineDepartment> summerwineDepartmentList = summerWineDepartmentService.getSummerwineDepartmentList();

		DepartmentDto departmentDto = new DepartmentDto(summerwineDepartmentList);
		departmentDto.transferObject();

		departmentService.setDepartmentList(departmentDto.getDepartmentList());
		departmentService.saveDepartments();
	}

	private void copyCustomer() {
		customerService.copyCustomers();
	}

	private void copyCountries() {

		List<SummerwineCountry> summerwineCountryList = summerWineCountryService.getSummerwineCountryList();

		CountryDto summerwineCountryDto = new CountryDto(summerwineCountryList);
		summerwineCountryDto.transferObject();
		countryService.setCountryList(summerwineCountryDto.getCountryList());
		countryService.saveCountries();

		//@ToDo: Debuggen
	}


}
