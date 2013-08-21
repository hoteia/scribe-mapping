package fr.hoteia.tools.scribe.mapping.oauth.json.bean.windowslive;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import fr.hoteia.tools.scribe.mapping.oauth.json.bean.AbstractJsonPojo;

/**
*
* <p>
* <a href="WorkPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class WorkPojo extends AbstractJsonPojo {

	protected EmployerPojo employer;
	
	protected PositionPojo position;
	
	public EmployerPojo getEmployer() {
	    return employer;
    }
	
	public void setEmployer(EmployerPojo employer) {
	    this.employer = employer;
    }
	
	public PositionPojo getPosition() {
	    return position;
    }
	
	public void setPosition(PositionPojo position) {
	    this.position = position;
    }
	
	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}