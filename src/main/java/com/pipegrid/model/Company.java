package com.pipegrid.model;

// Generated Aug 24, 2012 4:44:03 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Company generated by hbm2java
 */
public class Company extends Persist
{

	private StateLkup stateLkup;
	private CompanyTypeLkup companyTypeLkup;
	private CountryLkup countryLkup;
	private String name;
	private String description;
	private String address;
	private String address2;
	private String city;
	private String zipcode;
	private String phone;
	private String fax;
	private String website;
	private String contactEmail;
	private String services;
	private String sizeRange;
	private Date createDate;
	private long createUserId;
	private Date updateDate;
	private Long updateUserId;
	private Set<CompanyClassifications> companyClassificationses = new HashSet<CompanyClassifications>(0);
	private Set<User> users = new HashSet<User>(0);

	public Company() {
	}

	public Company(CompanyTypeLkup companyTypeLkup,
			CountryLkup countryLkup, String name) {
		this.companyTypeLkup = companyTypeLkup;
		this.countryLkup = countryLkup;
		this.name = name;
		//this.createUserId = createUserId;
	}

	public Company(StateLkup stateLkup,
			CompanyTypeLkup companyTypeLkup, CountryLkup countryLkup,
			String name, String description, String address, String address2,
			String city, String zipcode, String phone, String fax,
			String website, String contactEmail, String services,
			String sizeRange, Date createDate, long createUserId,
			Date updateDate, Long updateUserId,
			Set<CompanyClassifications> companyClassificationses) {
		this.stateLkup = stateLkup;
		this.companyTypeLkup = companyTypeLkup;
		this.countryLkup = countryLkup;
		this.name = name;
		this.description = description;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.zipcode = zipcode;
		this.phone = phone;
		this.fax = fax;
		this.website = website;
		this.contactEmail = contactEmail;
		this.services = services;
		this.sizeRange = sizeRange;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.updateDate = updateDate;
		this.updateUserId = updateUserId;
		this.companyClassificationses = companyClassificationses;
	}

	public StateLkup getStateLkup() {
		return this.stateLkup;
	}

	public void setStateLkup(StateLkup stateLkup) {
		this.stateLkup = stateLkup;
	}

	public CompanyTypeLkup getCompanyTypeLkup() {
		return this.companyTypeLkup;
	}

	public void setCompanyTypeLkup(CompanyTypeLkup companyTypeLkup) {
		this.companyTypeLkup = companyTypeLkup;
	}

	public CountryLkup getCountryLkup() {
		return this.countryLkup;
	}

	public void setCountryLkup(CountryLkup countryLkup) {
		this.countryLkup = countryLkup;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getServices() {
		return this.services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getSizeRange() {
		return this.sizeRange;
	}

	public void setSizeRange(String sizeRange) {
		this.sizeRange = sizeRange;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public long getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Long getUpdateUserId() {
		return this.updateUserId;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Set<CompanyClassifications> getCompanyClassificationses() {
		return this.companyClassificationses;
	}

	public void setCompanyClassificationses(
			Set<CompanyClassifications> companyClassificationses) {
		this.companyClassificationses = companyClassificationses;
	}

    public Set<User> getUsers()
    {
        return users;
    }
    public void setUsers(Set<User> users)
    {
        this.users = users;
    }
    
    public void addUser(User user)
    {
        user.setCompany(this);
        this.users.add(user);
    }

}
