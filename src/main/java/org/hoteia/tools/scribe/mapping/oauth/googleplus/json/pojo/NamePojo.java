package org.hoteia.tools.scribe.mapping.oauth.googleplus.json.pojo;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
*
* <p>
* <a href="NamePojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class NamePojo extends AbstractJsonPojo {

	protected String familyName;
	protected String givenName;
	
	public String getFamilyName() {
        return familyName;
    }
	
	public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
	
	public String getGivenName() {
        return givenName;
    }
	
	public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	
	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}