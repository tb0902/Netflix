package com.bodleian.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class VideoMetaDataAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoMetaDataAllPropertiesEquals(VideoMetaData expected, VideoMetaData actual) {
        assertVideoMetaDataAutoGeneratedPropertiesEquals(expected, actual);
        assertVideoMetaDataAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoMetaDataAllUpdatablePropertiesEquals(VideoMetaData expected, VideoMetaData actual) {
        assertVideoMetaDataUpdatableFieldsEquals(expected, actual);
        assertVideoMetaDataUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoMetaDataAutoGeneratedPropertiesEquals(VideoMetaData expected, VideoMetaData actual) {
        assertThat(expected)
            .as("Verify VideoMetaData auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoMetaDataUpdatableFieldsEquals(VideoMetaData expected, VideoMetaData actual) {
        assertThat(expected)
            .as("Verify VideoMetaData relevant properties")
            .satisfies(e -> assertThat(e.getType()).as("check type").isEqualTo(actual.getType()))
            .satisfies(e -> assertThat(e.getDescription()).as("check description").isEqualTo(actual.getDescription()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertVideoMetaDataUpdatableRelationshipsEquals(VideoMetaData expected, VideoMetaData actual) {}
}
