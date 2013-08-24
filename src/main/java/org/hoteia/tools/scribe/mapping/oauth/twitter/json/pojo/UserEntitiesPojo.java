package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

/**
*
* <p>
* <a href="UserEntitiesPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserEntitiesPojo extends AbstractJsonPojo {

	protected UrlPojo url;
	protected DescriptionPojo description;
	
	public UrlPojo getUrl() {
	    return url;
    }
	
	public void setUrl(UrlPojo url) {
	    this.url = url;
    }
	
	public DescriptionPojo getDescription() {
	    return description;
    }
	
	public void setDescription(DescriptionPojo description) {
	    this.description = description;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}