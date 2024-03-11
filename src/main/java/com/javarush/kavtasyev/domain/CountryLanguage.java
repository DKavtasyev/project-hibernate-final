package com.javarush.kavtasyev.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "country_language", schema = "world")
@Getter
@Setter
public class CountryLanguage
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

	@Column(name = "language", length = 30)
	private String language;

	@Column(name = "is_official")
	@Basic
	private boolean isOfficial;

	@Column(name = "percentage")
	private BigDecimal percentage;
}
