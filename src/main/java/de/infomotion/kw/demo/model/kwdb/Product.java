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
@Table(name = "Produkt")
public class Product {

	@Id
	@Column(name = "produktnummer", precision = 38, scale = 0, updatable = false, insertable = true, nullable = true)
	private BigInteger productNumber;

	@Column(name = "produktbezeichnung", length = 50, nullable = true)
	private String productName;

	@Column(name = "verkaufspreis", precision = 15, scale = 2, nullable = true)
	private BigDecimal sellingPrice;

	@Column(name = "einkaufspreis", precision = 15, scale = 2, nullable = true)
	private BigDecimal purchasePrice;

	@Column(name = "sortenkennzeichen", length = 3, nullable = true)
	private String varietyMark;

	@Column(name = "jahrgang", length = 25, nullable = true)
	private String vintage;

	@Column(name = "herkunft", length = 15, nullable = true)
	private String origin;
}
