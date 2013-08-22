package org.hoteia.tools.scribe.mapping.oauth.windowslive.json.pojo;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;


/**
*
* <p>
* <a href="EmailPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class EmailPojo extends AbstractJsonPojo {

	protected String preferred;
	
	protected String account;
	
	protected String personal;
	
	protected String business;

	public String getPreferred() {
		return preferred;
	}
	
	public void setPreferred(String preferred) {
		this.preferred = preferred;
	}

	public String getAccount() {
    	return account;
    }

	public void setAccount(String account) {
    	this.account = account;
    }

	public String getPersonal() {
    	return personal;
    }

	public void setPersonal(String personal) {
    	this.personal = personal;
    }

	public String getBusiness() {
	    return business;
    }
	
	public void setBusiness(String business) {
	    this.business = business;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}