package com.javarush.kavtasyev.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "city", schema = "world")
@Getter
@Setter
public class City
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name", length = 35)
	private String name;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

	@Column(name = "district", length = 25)
	private String district;

	@Column(name = "population")
	private Integer population = 0;
}
