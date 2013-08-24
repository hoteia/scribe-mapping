package org.hoteia.tools.scribe.mapping.oauth.facebook.json.pojo;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;


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
public class EducationPojo extends AbstractJsonPojo {

	protected SchoolPojo school;
	
	protected String type;
	
	public SchoolPojo getSchool() {
	    return school;
    }
	
	public void setSchool(SchoolPojo school) {
	    this.school = school;
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