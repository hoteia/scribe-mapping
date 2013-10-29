package org.hoteia.tools.scribe.mapping.oauth.facebook.json.pojo;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
*
* <p>
* <a href="HometownPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class HometownPojo extends AbstractJsonPojo {

	protected String id;
	
	protected String name;
	
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

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}