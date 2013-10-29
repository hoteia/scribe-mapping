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
* <a href="MediaPojo.java.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class MediaPojo extends AbstractJsonPojo {

	protected Long id;
	
	@JsonProperty("id_str")
	protected String idStr;
	
	protected List<Integer> indices = new ArrayList<Integer>();
	
	@JsonProperty("media_url")
	protected String mediaUrl;
	
	@JsonProperty("media_url_https")
	protected String mediaUrlHttps;
	
	protected String url;
	
	@JsonProperty("display_url")
	protected String displayUrl;
	
	@JsonProperty("expanded_url")
	protected String expandedUrl;
	
	protected String type;
	
	protected SizesPojo sizes = new SizesPojo();
	
	public Long getId() {
	    return id;
    }
	
	public void setId(Long id) {
	    this.id = id;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}