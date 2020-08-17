package com.awsproject.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("project-image-upload-aws");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
