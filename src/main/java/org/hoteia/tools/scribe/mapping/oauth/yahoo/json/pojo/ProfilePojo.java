package org.hoteia.tools.scribe.mapping.oauth.yahoo.json.pojo;

import java.util.ArrayList;
import java.util.List;

import org.hoteia.tools.scribe.mapping.oauth.common.json.pojo.AbstractJsonPojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * <p>
 * <a href="ProfilePojo.java.html"><i>View Source</i></a>
 * </p>
 * 
 * @author Denis Gosset <a href="http://www.hoteia.com"><i>Hoteia.com</i></a>
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfilePojo extends AbstractJsonPojo {

    protected String guid;

    protected List<AddressPojo> addresses = new ArrayList<AddressPojo>();

    protected String ageCategory;

    protected String created;

    protected List<EmailPojo> emails = new ArrayList<EmailPojo>();

    protected String familyName;

    protected String gender;

    protected String givenName;

    protected ImagePojo image;

    protected String intl;

    protected String jurisdiction;

    protected String lang;

    protected String memberSince;

    protected int migrationSource;

    protected String nickname;

    protected boolean notStored;

    protected String nux;

    protected List<PhonePojo> phones = new ArrayList<PhonePojo>();

    protected String profileMode;

    protected String profileStatus;

    protected String profileUrl;

    protected boolean isConnected;

    protected boolean profileHidden;

    protected boolean bdRestricted;

    protected String profilePermission;

    protected String uri;

    protected boolean cache;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public List<AddressPojo> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressPojo> addresses) {
        this.addresses = addresses;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<EmailPojo> getEmails() {
        return emails;
    }

    public void setEmails(List<EmailPojo> emails) {
        this.emails = emails;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public ImagePojo getImage() {
        return image;
    }

    public void setImage(ImagePojo image) {
        this.image = image;
    }

    public String getIntl() {
        return intl;
    }

    public void setIntl(String intl) {
        this.intl = intl;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

    public int getMigrationSource() {
        return migrationSource;
    }

    public void setMigrationSource(int migrationSource) {
        this.migrationSource = migrationSource;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isNotStored() {
        return notStored;
    }

    public void setNotStored(boolean notStored) {
        this.notStored = notStored;
    }

    public String getNux() {
        return nux;
    }

    public void setNux(String nux) {
        this.nux = nux;
    }

    public List<PhonePojo> getPhones() {
        return phones;
    }

    public void setPhones(List<PhonePojo> phones) {
        this.phones = phones;
    }

    public String getProfileMode() {
        return profileMode;
    }

    public void setProfileMode(String profileMode) {
        this.profileMode = profileMode;
    }

    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }

    public boolean isProfileHidden() {
        return profileHidden;
    }

    public void setProfileHidden(boolean profileHidden) {
        this.profileHidden = profileHidden;
    }

    public boolean isBdRestricted() {
        return bdRestricted;
    }

    public void setBdRestricted(boolean bdRestricted) {
        this.bdRestricted = bdRestricted;
    }

    public String getProfilePermission() {
        return profilePermission;
    }

    public void setProfilePermission(String profilePermission) {
        this.profilePermission = profilePermission;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public boolean isCache() {
        return cache;
    }

    public void setCache(boolean cache) {
        this.cache = cache;
    }

    @JsonAnySetter
    @Override
    public void handleUnknown(String key, Object value) {
        super.handleUnknown(key, value);
    }

}