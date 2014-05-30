package org.hoteia.tools.scribe.mapping.oauth.googleplus.json.pojo;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
*
* <p>
* <a href="OrganizationPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class OrganizationPojo extends AbstractJsonPojo {

	protected String name;
    protected String type;
    protected String primary;
	
	public String getName() {
        return name;
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
	public String getType() {
        return type;
    }
	
	public void setType(String type) {
        this.type = type;
    }
	
	public String getPrimary() {
        return primary;
    }
	
	public void setPrimary(String primary) {
        this.primary = primary;
    }
	
	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}