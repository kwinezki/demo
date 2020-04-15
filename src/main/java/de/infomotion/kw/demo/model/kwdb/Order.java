package de.infomotion.kw.demo.model.kwdb;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "Auftrag")
public class Order {

	@Id
	@Column(name = "auftragsnummer", precision = 38, scale = 0, insertable = true, updatable = false, nullable = true)
	private BigInteger orderNumber;

	@Column(name = "datum", precision = 38, scale = 0, nullable = true)
	private Date date;

	@Column(name = "kundennummer", precision = 38, scale = 0, nullable = true)
	private BigInteger customerNumber;

	@Column(name = "produktnummer", precision = 38, scale = 0, nullable = true)
	private BigInteger productNumber;

	@Column(name = "verkaeufernummer", precision = 38, scale = 0, nullable = true)
	private BigInteger vendorNumber;

	@Column(name = "stueckzahl", precision = 38, scale = 0, nullable = true)
	private BigInteger quantity;

	@Column(name = "gesamtverkaufspreis", precision = 15, scale = 0, nullable = true)
	private Long wholeSalePrice;

	@Column(name = "gesamteinkaufspreis", precision = 15, scale = 0, nullable = true)
	private Long wholeBuyPrice;


}
