package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import java.util.ArrayList;
import java.util.List;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
*
* <p>
* <a href="UrlPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class UrlPojo extends AbstractJsonPojo {

	protected List<UrlsPojo> urls = new ArrayList<UrlsPojo>();
	
	public List<UrlsPojo> getUrls() {
	    return urls;
    }
	
	public void setUrls(List<UrlsPojo> urls) {
	    this.urls = urls;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}