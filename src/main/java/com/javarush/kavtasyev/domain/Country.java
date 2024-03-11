package com.javarush.kavtasyev.domain;

import com.javarush.kavtasyev.constants.Continent;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "country", schema = "world")
@Getter
@Setter
public class Country
{
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "code", length = 3)
	private String code;

	@Column(name = "code_2", length = 2)
	private String alternativeCode;

	@Column(name = "name", length = 52)
	private String name;

	@Column(name = "continent")
	@Enumerated(EnumType.ORDINAL)
	private Continent continent;

	@Column(name = "region", length = 26)
	private String region;

	@Column(name = "surface_area")
	private BigDecimal surfaceArea;

	@Column(name = "indep_year")
	private Short independenceYear;

	@Column(name = "population")
	private Integer population;

	@Column(name = "life_expectancy")
	private BigDecimal lifeExpectancy;

	@Column(name = "gnp")
	private BigDecimal gnp;

	@Column(name = "gnpo_id")
	private BigDecimal gnpoId;

	@Column(name = "local_name", length = 45)
	private String localName;

	@Column(name = "government_form", length = 45)
	private String governmentForm;

	@Column(name = "head_of_state", length = 60)
	private String headOfState;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "capital")
	private City capital;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "country_id")
	private Set<CountryLanguage> languages;
}
