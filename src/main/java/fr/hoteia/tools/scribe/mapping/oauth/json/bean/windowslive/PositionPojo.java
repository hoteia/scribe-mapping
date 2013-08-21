package fr.hoteia.tools.scribe.mapping.oauth.json.bean.windowslive;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import fr.hoteia.tools.scribe.mapping.oauth.json.bean.AbstractJsonPojo;

/**
*
* <p>
* <a href="PositionPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class PositionPojo extends AbstractJsonPojo {

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