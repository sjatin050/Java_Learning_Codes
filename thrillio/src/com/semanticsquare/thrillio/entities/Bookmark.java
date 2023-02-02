package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.KidFriendlyStatus;

// made the class abstract to implement Kid friendly eligibility video 184
public abstract class Bookmark {

    private long id;
    private String title;
    private  String profileUrl;
    private String kidFriendlyStatus = KidFriendlyStatus.UNKNOWN; //included when the editor or chief editor will validate the request
    private User kidFriendlyMarkedBy;
    private User sharedBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getKidFriendlyStatus() {
        return kidFriendlyStatus;
    }

    public void setKidFriendlyStatus(String kidFriendlyStatus) {
        this.kidFriendlyStatus = kidFriendlyStatus;
    }

    public User getKidFriendlyMarkedBy() {
        return kidFriendlyMarkedBy;
    }

    public void setKidFriendlyMarkedBy(User kidFriendlyMarkedBy) {
        this.kidFriendlyMarkedBy = kidFriendlyMarkedBy;
    }

    public User getSharedBy() {
        return sharedBy;
    }

    public void setSharedBy(User sharedBy) {
        this.sharedBy = sharedBy;
    }
    public abstract boolean isKidFriendlyEligible();
}
