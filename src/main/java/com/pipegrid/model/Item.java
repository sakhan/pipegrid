package com.pipegrid.model;

// Generated Aug 24, 2012 4:44:03 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Item generated by hbm2java
 */
public class Item extends Persist 
{
	private StateLkup stateLkup;
	private User userByUpdateUserId;
	private Company company;
	private User userByCreateUserId;
	private Lot lot;
	private CountryLkup countryLkup;
	private String conditionCode;
	private String city;
	private BigDecimal priceDollars;
	private boolean isPublic;
	private String description;
	private Date createDate;
	private Date updateDate;
	private Set<ItemImages> itemImages = new HashSet<ItemImages>(0);
	private Set<ItemFiles> itemFiles = new HashSet<ItemFiles>(0);

	public Item() {
	}

	public Item(Company company, User userByCreateUserId,
			String conditionCode, boolean isPublic) {
		this.company = company;
		this.userByCreateUserId = userByCreateUserId;
		this.conditionCode = conditionCode;
		this.isPublic = isPublic;
	}

	public Item(StateLkup stateLkup, User userByUpdateUserId,
			Company company, User userByCreateUserId, Lot lot,
			CountryLkup countryLkup, String conditionCode, String city,
			BigDecimal priceDollars, boolean isPublic, String description,
			Set<ItemImages> itemImageses, Set<ItemFiles> itemFileses) {
		this.stateLkup = stateLkup;
		this.userByUpdateUserId = userByUpdateUserId;
		this.company = company;
		this.userByCreateUserId = userByCreateUserId;
		this.lot = lot;
		this.countryLkup = countryLkup;
		this.conditionCode = conditionCode;
		this.city = city;
		this.priceDollars = priceDollars;
		this.isPublic = isPublic;
		this.description = description;
		this.itemImages = itemImageses;
		this.itemFiles = itemFileses;
	}

	public StateLkup getStateLkup() {
		return this.stateLkup;
	}

	public void setStateLkup(StateLkup stateLkup) {
		this.stateLkup = stateLkup;
	}

	public User getUserByUpdateUserId() {
		return this.userByUpdateUserId;
	}

	public void setUserByUpdateUserId(User userByUpdateUserId) {
		this.userByUpdateUserId = userByUpdateUserId;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public User getUserByCreateUserId() {
		return this.userByCreateUserId;
	}

	public void setUserByCreateUserId(User userByCreateUserId) {
		this.userByCreateUserId = userByCreateUserId;
	}

	public Lot getLot() {
		return this.lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

	public CountryLkup getCountryLkup() {
		return this.countryLkup;
	}

	public void setCountryLkup(CountryLkup countryLkup) {
		this.countryLkup = countryLkup;
	}

	public String getConditionCode() {
		return this.conditionCode;
	}

	public void setConditionCode(String conditionCode) {
		this.conditionCode = conditionCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public BigDecimal getPriceDollars() {
		return this.priceDollars;
	}

	public void setPriceDollars(BigDecimal priceDollars) {
		this.priceDollars = priceDollars;
	}

	public boolean isIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set<ItemImages> getItemImages() {
		return this.itemImages;
	}

	public void setItemImages(Set<ItemImages> itemImages) {
		this.itemImages = itemImages;
	}

	public Set<ItemFiles> getItemFiles() {
		return this.itemFiles;
	}

	public void setItemFiles(Set<ItemFiles> itemFiles) {
		this.itemFiles = itemFiles;
	}

}
