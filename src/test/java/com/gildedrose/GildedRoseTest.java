package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GildedRoseTest {
    @Test
    public void foo() {
        assertThat("foo", equalTo("foo"));
    }
}
