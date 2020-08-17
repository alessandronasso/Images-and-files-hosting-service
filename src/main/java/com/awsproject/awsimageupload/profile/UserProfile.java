package com.awsproject.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {

    private UUID userProfileId;
    private String username;
    private String UserProfileImageLink; //S3 Key

    public UserProfile(UUID userProfileId, String username, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        UserProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, that.userProfileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(UserProfileImageLink, that.UserProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, UserProfileImageLink);
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        UserProfileImageLink = userProfileImageLink;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(UserProfileImageLink);
    }
}
