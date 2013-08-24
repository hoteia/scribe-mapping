package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

/**
*
* <p>
* <a href="StatusEntitiesPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class StatusEntitiesPojo extends AbstractJsonPojo {

	protected List<String> hashtags = new ArrayList<String>();
	
	protected List<String> symbols = new ArrayList<String>();
	
	protected List<String> urls = new ArrayList<String>();
	
	@JsonProperty("user_mentions")
	protected List<String> userMentions = new ArrayList<String>();
	
	protected List<MediaPojo> media = new ArrayList<MediaPojo>();
	
	public List<String> getHashtags() {
	    return hashtags;
    }
	
	public void setHashtags(List<String> hashtags) {
	    this.hashtags = hashtags;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}