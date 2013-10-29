package org.hoteia.tools.scribe.mapping.oauth.twitter.json.pojo;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
*
* <p>
* <a href="UserPojo.java.html"><i>View Source</i></a>
* </p>
*
* @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
* 
*/
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserPojo extends AbstractJsonPojo {

	protected long id;
	
	@JsonProperty("id_str")
	protected String idStr;
	
	protected String name;

	@JsonProperty("screen_name")
	protected String screen_name;

	protected String location;

	protected String description;

	protected String url;
	
	@JsonProperty("contributors_enabled")
	protected boolean contributorsEnabled;
	
	@JsonProperty("is_translator")
	protected boolean isTranslator;
	
	@JsonProperty("protected")
	protected boolean protectedUser;
	
	@JsonProperty("followers_count")
	protected int followersCount;
	
	@JsonProperty("friends_count")
	protected int friendsCount;
	
	@JsonProperty("listed_count")
	protected int listedCount;
	
	@JsonProperty("created_at")
	protected boolean createdAt;
	
	@JsonProperty("favourites_count")
	protected int favouritesCount;
	
	@JsonProperty("utc_offset")
	protected int utcOffset;
	
	@JsonProperty("time_zone")
	protected String timeZone;
	
	@JsonProperty("geo_enabled")
	protected boolean geoEnabled;
	
	@JsonProperty("verified")
	protected boolean verified;
	
	@JsonProperty("statuses_count")
	protected int statusesCount;
	
	@JsonProperty("lang")
	protected String lang;
	
	@JsonProperty("profile_background_color")
	protected String profileBackgroundColor;
	
	@JsonProperty("profile_background_image_url")
	protected String profileBackgroundImageUrl;
	
	@JsonProperty("profile_background_image_url_https")
	protected String profileBackgroundImageUrlHttps;
	
	@JsonProperty("profile_background_tile")
	protected boolean profileBackgroundTile;
	
	@JsonProperty("profile_image_url")
	protected String profileImageUrl;
	
	@JsonProperty("profile_image_url_https")
	protected String profileImageUrlHttps;
	
	@JsonProperty("profile_link_color")
	protected String profileLinkColor;
	
	@JsonProperty("profile_sidebar_border_color")
	protected String profileSidebarBorderColor;
	
	@JsonProperty("profile_sidebar_fill_color")
	protected String profileSidebarFillColor;
	
	@JsonProperty("profile_text_color")
	protected String profileTextColor;
	
	@JsonProperty("profile_use_background_image")
	protected boolean profileUseBackgroundImage;
	
	@JsonProperty("default_profile")
	protected boolean defaultProfile;
	
	@JsonProperty("default_profile_image")
	protected boolean defaultProfileImage;
	
	@JsonProperty("following")
	protected boolean following;
	
	@JsonProperty("follow_request_sent")
	protected boolean followRequestSent;
	
	@JsonProperty("notifications")
	protected boolean notifications;
	
	protected UserEntitiesPojo entities = new UserEntitiesPojo();

	protected StatusPojo status = new StatusPojo();

	public long getId() {
    	return id;
    }

	public void setId(long id) {
    	this.id = id;
    }

	public String getIdStr() {
    	return idStr;
    }

	public void setIdStr(String idStr) {
    	this.idStr = idStr;
    }

	public String getName() {
    	return name;
    }

	public void setName(String name) {
    	this.name = name;
    }

	public String getScreen_name() {
    	return screen_name;
    }

	public void setScreen_name(String screen_name) {
    	this.screen_name = screen_name;
    }

	public String getLocation() {
    	return location;
    }

	public void setLocation(String location) {
    	this.location = location;
    }

	public String getDescription() {
    	return description;
    }

	public void setDescription(String description) {
    	this.description = description;
    }

	public String getUrl() {
    	return url;
    }

	public void setUrl(String url) {
    	this.url = url;
    }

	public boolean isContributorsEnabled() {
    	return contributorsEnabled;
    }

	public void setContributorsEnabled(boolean contributorsEnabled) {
    	this.contributorsEnabled = contributorsEnabled;
    }

	public boolean isTranslator() {
    	return isTranslator;
    }

	public void setTranslator(boolean isTranslator) {
    	this.isTranslator = isTranslator;
    }

	public boolean isProtectedUser() {
    	return protectedUser;
    }

	public void setProtectedUser(boolean protectedUser) {
    	this.protectedUser = protectedUser;
    }

	public int getFollowersCount() {
    	return followersCount;
    }

	public void setFollowersCount(int followersCount) {
    	this.followersCount = followersCount;
    }

	public int getFriendsCount() {
    	return friendsCount;
    }

	public void setFriendsCount(int friendsCount) {
    	this.friendsCount = friendsCount;
    }

	public int getListedCount() {
    	return listedCount;
    }

	public void setListedCount(int listedCount) {
    	this.listedCount = listedCount;
    }

	public boolean isCreatedAt() {
    	return createdAt;
    }

	public void setCreatedAt(boolean createdAt) {
    	this.createdAt = createdAt;
    }

	public int getFavouritesCount() {
    	return favouritesCount;
    }

	public void setFavouritesCount(int favouritesCount) {
    	this.favouritesCount = favouritesCount;
    }

	public int getUtcOffset() {
    	return utcOffset;
    }

	public void setUtcOffset(int utcOffset) {
    	this.utcOffset = utcOffset;
    }

	public String getTimeZone() {
    	return timeZone;
    }

	public void setTimeZone(String timeZone) {
    	this.timeZone = timeZone;
    }

	public boolean isGeoEnabled() {
    	return geoEnabled;
    }

	public void setGeoEnabled(boolean geoEnabled) {
    	this.geoEnabled = geoEnabled;
    }

	public boolean isVerified() {
    	return verified;
    }

	public void setVerified(boolean verified) {
    	this.verified = verified;
    }

	public int getStatusesCount() {
    	return statusesCount;
    }

	public void setStatusesCount(int statusesCount) {
    	this.statusesCount = statusesCount;
    }

	public String getLang() {
    	return lang;
    }

	public void setLang(String lang) {
    	this.lang = lang;
    }

	public String getProfileBackgroundColor() {
    	return profileBackgroundColor;
    }

	public void setProfileBackgroundColor(String profileBackgroundColor) {
    	this.profileBackgroundColor = profileBackgroundColor;
    }

	public String getProfileBackgroundImageUrl() {
    	return profileBackgroundImageUrl;
    }

	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
    	this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

	public String getProfileBackgroundImageUrlHttps() {
    	return profileBackgroundImageUrlHttps;
    }

	public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
    	this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

	public boolean isProfileBackgroundTile() {
    	return profileBackgroundTile;
    }

	public void setProfileBackgroundTile(boolean profileBackgroundTile) {
    	this.profileBackgroundTile = profileBackgroundTile;
    }

	public String getProfileImageUrl() {
    	return profileImageUrl;
    }

	public void setProfileImageUrl(String profileImageUrl) {
    	this.profileImageUrl = profileImageUrl;
    }

	public String getProfileImageUrlHttps() {
    	return profileImageUrlHttps;
    }

	public void setProfileImageUrlHttps(String profileImageUrlHttps) {
    	this.profileImageUrlHttps = profileImageUrlHttps;
    }

	public String getProfileLinkColor() {
    	return profileLinkColor;
    }

	public void setProfileLinkColor(String profileLinkColor) {
    	this.profileLinkColor = profileLinkColor;
    }

	public String getProfileSidebarBorderColor() {
    	return profileSidebarBorderColor;
    }

	public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
    	this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

	public String getProfileSidebarFillColor() {
    	return profileSidebarFillColor;
    }

	public void setProfileSidebarFillColor(String profileSidebarFillColor) {
    	this.profileSidebarFillColor = profileSidebarFillColor;
    }

	public String getProfileTextColor() {
    	return profileTextColor;
    }

	public void setProfileTextColor(String profileTextColor) {
    	this.profileTextColor = profileTextColor;
    }

	public boolean isProfileUseBackgroundImage() {
    	return profileUseBackgroundImage;
    }

	public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
    	this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

	public boolean isDefaultProfile() {
    	return defaultProfile;
    }

	public void setDefaultProfile(boolean defaultProfile) {
    	this.defaultProfile = defaultProfile;
    }

	public boolean isDefaultProfileImage() {
    	return defaultProfileImage;
    }

	public void setDefaultProfileImage(boolean defaultProfileImage) {
    	this.defaultProfileImage = defaultProfileImage;
    }

	public boolean isFollowing() {
    	return following;
    }

	public void setFollowing(boolean following) {
    	this.following = following;
    }

	public boolean isFollowRequestSent() {
    	return followRequestSent;
    }

	public void setFollowRequestSent(boolean followRequestSent) {
    	this.followRequestSent = followRequestSent;
    }

	public boolean isNotifications() {
    	return notifications;
    }

	public void setNotifications(boolean notifications) {
    	this.notifications = notifications;
    }

	public UserEntitiesPojo getEntities() {
    	return entities;
    }

	public void setEntities(UserEntitiesPojo entities) {
    	this.entities = entities;
    }

	public StatusPojo getStatus() {
    	return status;
    }

	public void setStatus(StatusPojo status) {
    	this.status = status;
    }

	@JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}