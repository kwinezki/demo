package de.infomotion.kw.demo.model.kwdb;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Staat")
public class Country {

	@Id
	@Column(name = "staat_kurz", length = 2, insertable = true, updatable = false, nullable = true)
	private String countryShortCode;

	@Column(name = "staat", length = 50, nullable = true)
	private String country;


}
