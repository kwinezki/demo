package de.infomotion.kw.demo.model.summerwine;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "Auftrag")
public class SummerwineOrder {

	@Id
	@Column(name = "auftragsnummer", precision = 38, scale = 0, insertable = true, updatable = false, nullable = true)
	private BigInteger orderNumber;

	@Temporal(TemporalType.DATE)
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

	@Column(name = "gesamtverkaufspreis", precision = 15, scale = 2, nullable = true)
	private BigDecimal wholeSalePrice;

	@Column(name = "gesamteinkaufspreis", precision = 15, scale = 2, nullable = true)
	private BigDecimal wholeBuyPrice;


}
