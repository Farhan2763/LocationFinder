package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountryLocatorTest {

    @Test
    void testGetCountryCode() throws Exception {
        CountryLocator countryLocator = new CountryLocator();

        // Test for a known coordinate (San Francisco, USA)
        double latitude = 37.7749;
        double longitude = -122.4194;
        List<String> result = countryLocator.getCountryCode(latitude, longitude);
        assertEquals(1, result.size());
        assertEquals("US", result.get(0));

        // Test for a coordinate in the ocean
        latitude = 0.0;
        longitude = 0.0;
        result = countryLocator.getCountryCode(latitude, longitude);
        assertEquals(0, result.size());

        // Test for a coordinate near multiple countries
        latitude = 5; // London, UK
        longitude = 20;
        result = countryLocator.getCountryCode(latitude, longitude);
        assertEquals(2, result.size());
        assertEquals("CD", result.get(0));
        assertEquals("CF", result.get(1));
    }
}