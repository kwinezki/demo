package de.infomotion.kw.demo.model.kwdb;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "Verkaeufer")
public class Vendor {

	@Id
	@Column(name = "verkaeufernummer", precision = 38, updatable = false, insertable = true, nullable = true)
	private BigInteger vendorNumber;

	@Column(name = "name", length = 20, nullable = true)
	private String vendorLastName;

	@Column(name = "vorname", length = 20, nullable = true)
	private String vendorFirstName;

	@Column(name = "provisionsfaktor", precision = 15, scale = 3, nullable = true)
	private BigDecimal commissionFactor;

	@Column(name = "bereich", precision = 38, nullable = true)
	private BigInteger departmentNumber;

	@Column(name = "staat_kurz", length = 2, nullable = true)
	private String countryShortCode;
}
