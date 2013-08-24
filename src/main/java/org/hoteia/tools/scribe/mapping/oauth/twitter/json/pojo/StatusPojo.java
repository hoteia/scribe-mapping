package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

/**
*
* <p>
* <a href="StatusPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class StatusPojo extends AbstractJsonPojo {

	@JsonProperty("created_at")
	protected String createdAt;
	
	protected Long id;
	
	@JsonProperty("id_str")
	protected String idStr;
	
	@JsonProperty("text")
	protected String text;
	
	@JsonProperty("source")
	protected String source;
	
	@JsonProperty("truncated")
	protected boolean truncated;
	
	@JsonProperty("in_reply_to_status_id")
	protected String inReplyToStatusId;
	
	@JsonProperty("in_reply_to_status_id_str")
	protected String inReplyToStatusIdStr;
	
	@JsonProperty("in_reply_to_user_id")
	protected Long inReplyToUserId;
	
	@JsonProperty("in_reply_to_user_id_str")
	protected String inReplyToUserIdStr;
	
	@JsonProperty("in_reply_to_screen_name")
	protected String inReplyToScreenName;
	
	protected String geo;
	
	protected String coordinates;
	
	protected String place;
	
	protected String contributors;
	
	@JsonProperty("retweet_count")
	protected int retweetCount;
	
	@JsonProperty("favorite_count")
	protected int favoriteCount;
	
	protected boolean favorited;
	
	protected boolean retweeted;
	
	@JsonProperty("possibly_sensitive")
	protected int possiblySensitive;
	
	protected String lang;
	
	@JsonProperty("retweeted_status")
	protected StatusPojo retweetedStatus = new StatusPojo();
	
	protected StatusEntitiesPojo entities = new StatusEntitiesPojo();
	
	public String getCreatedAt() {
	    return createdAt;
    }
	
	public void setCreatedAt(String createdAt) {
	    this.createdAt = createdAt;
    }
	
	public Long getId() {
    	return id;
    }

	public void setId(Long id) {
    	this.id = id;
    }

	public String getIdStr() {
    	return idStr;
    }

	public void setIdStr(String idStr) {
    	this.idStr = idStr;
    }

	public String getText() {
    	return text;
    }

	public void setText(String text) {
    	this.text = text;
    }

	public String getSource() {
    	return source;
    }

	public void setSource(String source) {
    	this.source = source;
    }

	public boolean isTruncated() {
    	return truncated;
    }

	public void setTruncated(boolean truncated) {
    	this.truncated = truncated;
    }

	public String getInReplyToStatusId() {
    	return inReplyToStatusId;
    }

	public void setInReplyToStatusId(String inReplyToStatusId) {
    	this.inReplyToStatusId = inReplyToStatusId;
    }

	public String getInReplyToStatusIdStr() {
    	return inReplyToStatusIdStr;
    }

	public void setInReplyToStatusIdStr(String inReplyToStatusIdStr) {
    	this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

	public Long getInReplyToUserId() {
    	return inReplyToUserId;
    }

	public void setInReplyToUserId(Long inReplyToUserId) {
    	this.inReplyToUserId = inReplyToUserId;
    }

	public String getInReplyToUserIdStr() {
    	return inReplyToUserIdStr;
    }

	public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
    	this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

	public String getInReplyToScreenName() {
    	return inReplyToScreenName;
    }

	public void setInReplyToScreenName(String inReplyToScreenName) {
    	this.inReplyToScreenName = inReplyToScreenName;
    }

	public String getGeo() {
    	return geo;
    }

	public void setGeo(String geo) {
    	this.geo = geo;
    }

	public String getCoordinates() {
    	return coordinates;
    }

	public void setCoordinates(String coordinates) {
    	this.coordinates = coordinates;
    }

	public String getPlace() {
    	return place;
    }

	public void setPlace(String place) {
    	this.place = place;
    }

	public String getContributors() {
    	return contributors;
    }

	public void setContributors(String contributors) {
    	this.contributors = contributors;
    }

	public int getRetweetCount() {
    	return retweetCount;
    }

	public void setRetweetCount(int retweetCount) {
    	this.retweetCount = retweetCount;
    }

	public int getFavoriteCount() {
    	return favoriteCount;
    }

	public void setFavoriteCount(int favoriteCount) {
    	this.favoriteCount = favoriteCount;
    }

	public boolean isFavorited() {
    	return favorited;
    }

	public void setFavorited(boolean favorited) {
    	this.favorited = favorited;
    }

	public boolean isRetweeted() {
    	return retweeted;
    }

	public void setRetweeted(boolean retweeted) {
    	this.retweeted = retweeted;
    }

	public int getPossiblySensitive() {
    	return possiblySensitive;
    }

	public void setPossiblySensitive(int possiblySensitive) {
    	this.possiblySensitive = possiblySensitive;
    }

	public String getLang() {
    	return lang;
    }

	public void setLang(String lang) {
    	this.lang = lang;
    }

	public StatusPojo getRetweetedStatus() {
	    return retweetedStatus;
    }
	
	public void setRetweetedStatus(StatusPojo retweetedStatus) {
	    this.retweetedStatus = retweetedStatus;
    }
	
	public StatusEntitiesPojo getEntities() {
	    return entities;
    }
	
	public void setEntities(StatusEntitiesPojo entities) {
	    this.entities = entities;
    }
	
	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}