package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;


/**
*
* <p>
* <a href="EmployerPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class EmployerPojo extends AbstractJsonPojo {

	protected String name;
	
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