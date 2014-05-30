package org.hoteia.tools.scribe.mapping.oauth.googleplus.json.pojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    protected String id;
	protected String kind;
	protected String etag;
	
    protected String gender;
	protected String nickname;
	
    protected String objectType;
    protected String displayName;
    protected String tagline;
    protected String url;

    @JsonProperty("name")
    protected NamePojo name;

    @JsonProperty("image")
    protected ImagePojo image;

    @JsonProperty("emails")
    protected List<EmailPojo> emails = new ArrayList<EmailPojo>();

    @JsonProperty("urls")
    protected List<UrlPojo> urls = new ArrayList<UrlPojo>();

    @JsonProperty("organizations")
    protected List<OrganizationPojo> organizations = new ArrayList<OrganizationPojo>();

	protected boolean isPlusUser;
    protected boolean verified;

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
	public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public NamePojo getName() {
        return name;
    }

    public String getLastName(){
        if(name != null){
            return name.getFamilyName();
        }
        return null;
    }
    
    public String getFirstName(){
        if(name != null){
            return name.getGivenName();
        }
        return null;
    }
    
    public void setName(NamePojo name) {
        this.name = name;
    }

    public ImagePojo getImage() {
        return image;
    }

    public void setImage(ImagePojo image) {
        this.image = image;
    }

    public List<EmailPojo> getEmails() {
        return emails;
    }

    public String getEmailAccount(){
        if(emails != null
                && !emails.isEmpty()){
            for (Iterator<EmailPojo> iterator = emails.iterator(); iterator.hasNext();) {
                EmailPojo emailPojo = (EmailPojo) iterator.next();
                if(emailPojo.getType().equals("account")){
                    return emailPojo.getValue();
                }
            }
        }
        return null;
    }
    
    public void setEmails(List<EmailPojo> emails) {
        this.emails = emails;
    }

    public List<UrlPojo> getUrls() {
        return urls;
    }

    public void setUrls(List<UrlPojo> urls) {
        this.urls = urls;
    }

    public List<OrganizationPojo> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<OrganizationPojo> organizations) {
        this.organizations = organizations;
    }

    public boolean isPlusUser() {
        return isPlusUser;
    }

    public void setPlusUser(boolean isPlusUser) {
        this.isPlusUser = isPlusUser;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @JsonAnySetter
	@Override
	public void handleUnknown(String key, Object value) {
		super.handleUnknown(key, value);
	}
	
}