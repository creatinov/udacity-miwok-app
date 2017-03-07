package com.example.android.miwok;


/**
 * Created by moseskim on 2017. 3. 5..
 */

public class Word {
    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create the Word object.
     *
     *  @param defaultTranslation is the word in a language that user is already familiar with
     *  @param miwokTranslation is the word in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create the Word object.
     *
     *  @param defaultTranslation is the word in a language that user is already familiar with
     *  @param miwokTranslation is the word in Miwok language
     *  @param imageReourceId is the drawable image resource ID for the image associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageReourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageReourceId;
    }

    /* Get the default translation word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /* Get the miwok translation word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the image resource ID is set or not.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
