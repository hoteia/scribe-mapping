package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
*
* <p>
* <a href="SizesPojo.java.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class SizesPojo extends AbstractJsonPojo {

	protected String thumb;
	
	protected String medium;
	
	protected String large;
	
	protected String small;
	
	public String getThumb() {
	    return thumb;
    }
	
	public void setThumb(String thumb) {
	    this.thumb = thumb;
    }
	
	public String getMedium() {
    	return medium;
    }

	public void setMedium(String medium) {
    	this.medium = medium;
    }

	public String getLarge() {
    	return large;
    }

	public void setLarge(String large) {
    	this.large = large;
    }

	public String getSmall() {
    	return small;
    }

	public void setSmall(String small) {
    	this.small = small;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}