package org.hoteia.tools.scribe.mapping.oauth.facebook.json.pojo;

import java.util.ArrayList;
import java.util.List;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
*
* <p>
* <a href="UserPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserPojo extends AbstractJsonPojo {

	protected String id;
	
	protected String name;
	
	@JsonProperty("first_name")
	protected String firstName;
	
	@JsonProperty("last_name")
	protected String lastName;

	@JsonProperty("username")
	protected String username;
	
	protected String gender;
	
	@JsonProperty("birth_day")
	protected String birthDay;

	@JsonProperty("birth_month")
	protected String birthMonth;

	@JsonProperty("birth_year")
	protected String birthYear;

	protected HometownPojo hometown;
	
	protected LocationPojo location;
	
	protected String email;

	@JsonProperty("education")
	protected List<EducationPojo> educations = new ArrayList<EducationPojo>();
	
	protected String link;
	
	protected String locale;

	protected String timezone;

	protected boolean verified;

	@JsonProperty("updated_time")
	protected String updatedTime;
	
	public String getId() {
    	return id;
    }

	public void setId(String id) {
    	this.id = id;
    }

	public String getName() {
    	return name;
    }

	public void setName(String name) {
    	this.name = name;
    }

	public String getFirstName() {
    	return firstName;
    }

	public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

	public String getLastName() {
    	return lastName;
    }

	public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
	
	public String getUsername() {
	    return username;
    }
	
	public void setUsername(String username) {
	    this.username = username;
    }
	
	public String getGender() {
    	return gender;
    }

	public void setGender(String gender) {
    	this.gender = gender;
    }
	
	public String getBirthDay() {
    	return birthDay;
    }

	public void setBirthDay(String birthDay) {
    	this.birthDay = birthDay;
    }

	public String getBirthMonth() {
    	return birthMonth;
    }

	public void setBirthMonth(String birthMonth) {
    	this.birthMonth = birthMonth;
    }

	public String getBirthYear() {
    	return birthYear;
    }

	public void setBirthYear(String birthYear) {
    	this.birthYear = birthYear;
    }
	
	public String getEmail() {
	    return email;
    }
	
	public void setEmail(String email) {
	    this.email = email;
    }
	
	public List<EducationPojo> getEducations() {
	    return educations;
    }
	
	public void setEducations(List<EducationPojo> educations) {
	    this.educations = educations;
    }

	public String getLink() {
    	return link;
    }

	public void setLink(String link) {
    	this.link = link;
    }

	public String getLocale() {
    	return locale;
    }

	public void setLocale(String locale) {
    	this.locale = locale;
    }

	public String getTimezone() {
	    return timezone;
    }
	
	public void setTimezone(String timezone) {
	    this.timezone = timezone;
    }
	
	public boolean isVerified() {
    	return verified;
    }

	public void setVerified(boolean verified) {
    	this.verified = verified;
    }

	public String getUpdatedTime() {
    	return updatedTime;
    }

	public void setUpdatedTime(String updatedTime) {
    	this.updatedTime = updatedTime;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}