package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import java.util.ArrayList;
import java.util.List;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
*
* <p>
* <a href="UrlsPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class UrlsPojo extends AbstractJsonPojo {

	protected String url;
	
	@JsonProperty("expanded_url")
	protected String expandedUrl;
	
	@JsonProperty("display_url")
	protected String displayUrl;
	
	protected List<Integer> indices = new ArrayList<Integer>();
	
	public String getUrl() {
	    return url;
    }
	
	public void setUrl(String url) {
	    this.url = url;
    }
	
	public String getExpandedUrl() {
    	return expandedUrl;
    }

	public void setExpandedUrl(String expandedUrl) {
    	this.expandedUrl = expandedUrl;
    }

	public String getDisplayUrl() {
    	return displayUrl;
    }

	public void setDisplayUrl(String displayUrl) {
    	this.displayUrl = displayUrl;
    }

	public List<Integer> getIndices() {
    	return indices;
    }

	public void setIndices(List<Integer> indices) {
    	this.indices = indices;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}