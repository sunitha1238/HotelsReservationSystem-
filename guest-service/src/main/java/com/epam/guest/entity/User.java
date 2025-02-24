package com.epam.guest.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.googlecode.jmapper.annotations.JMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Column(name = "STATUS")
	@JMap
	private Boolean status;
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PROFILE_ID")
	@JMap
	private Profile profile;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	@JMap
	private List<CreditCard> creditCards = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<StayHistory> stayHistory = new ArrayList<>();
}
