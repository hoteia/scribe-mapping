package org.hoteia.tools.scribe.mapping.oauth.googleplus.json.pojo;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


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

	protected String value;
    protected String type;
	
	public String getValue() {
        return value;
    }
	
	public void setValue(String value) {
        this.value = value;
    }
	
	public String getType() {
        return type;
    }
	
	public void setType(String type) {
        this.type = type;
    }
	
	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}