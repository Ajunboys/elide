/*
 * Copyright 2017, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package com.yahoo.elide.graphql;

import org.testng.annotations.Test;

/**
 * Test the Add operation.
 */
public class FetcherUpsertTest extends PersistentResourceFetcherTest {
    /* ==================== */
    /* CREATING NEW OBJECTS */
    /* ==================== */
    @Test
    public void testCreateRootSingle() throws Exception {
        runComparisonTest("createRootSingle");
    }

    @Test
    public void testCreateRootCollection() throws Exception {
        runComparisonTest("createRootCollection");
    }

    @Test
    public void testCreateNestedSingle() throws Exception {
        runComparisonTest("createNestedSingle");
    }

    @Test
    public void testCreateNestedCollection() throws Exception {
        runComparisonTest("createNestedCollection");
    }

    /* ========================= */
    /* UPDATING EXISTING OBJECTS */
    /* ========================= */
    @Test
    public void testRootSingleWithId() throws Exception {
        //author 1 already exist, should update
        runComparisonTest("rootSingleWithId");
    }

    @Test
    public void testRootSingleWithList() throws Exception {
        //book 1 and 2 already exist, should update
        runComparisonTest("rootSingleWithList");
    }

    @Test
    public void testRootCollectionMixedIds() throws Exception {
        // Update 1, create for id 42, create new book with title "abc"
        runComparisonTest("rootCollectionMixedIds");
    }

    @Test
    public void testNestedSingleUpdate() throws Exception {
        runComparisonTest("nestedSingleUpdate");
    }

    @Test
    public void testNestedCollection() throws Exception {
        runComparisonTest("nestedCollection");
    }

    @Test
    public void testUpsertOnCollection() throws Exception {
        runComparisonTest("uspertOnCollection");
    }

    @Test
    public void testNonCreatedIdReferenceCollection() throws Exception {
        runComparisonTest("nonCreatedIdReferenceCollection");
    }

    @Test
    public void testCrossCyclicRelationships() throws Exception {
        runComparisonTest("crossCyclicRelationships");
    }

    @Test
    public void testNestedUpserts() throws Exception {
        runComparisonTest("nestedUpserts");
    }

    @Test
    public void testNonCreatedIdOnlyRequest2Back() throws Exception {
        runComparisonTest("nonCreatedIdOnlyRequest2Back");
    }

    @Override
    public void runComparisonTest(String testName) throws Exception {
        super.runComparisonTest("upsert/" + testName);
    }
}
