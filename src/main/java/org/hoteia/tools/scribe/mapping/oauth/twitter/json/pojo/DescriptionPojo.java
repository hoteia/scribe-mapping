package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;


/**
*
* <p>
* <a href="DescriptionPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescriptionPojo extends AbstractJsonPojo {

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