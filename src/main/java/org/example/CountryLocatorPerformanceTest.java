package org.example;

import java.util.List;

public class CountryLocatorPerformanceTest {

    public static void main(String[] args) throws Exception {
        CountryLocator countryLocator = new CountryLocator();
        int requestsPerSecond = 100;
        int totalRequests = 1000; // Number of total requests to simulate
        long totalTime = 0;

        for (int i = 0; i < totalRequests; i++) {
            long startTime = System.currentTimeMillis();

            // Simulate request with random coordinates
            double latitude = Math.random() * 180 - 90; // Random latitude between -90 and 90
            double longitude = Math.random() * 360 - 180; // Random longitude between -180 and 180
            List<String> result = countryLocator.getCountryCode(latitude, longitude);

            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            totalTime += executionTime;

            // Delay to achieve 100 requests per second
            try {
                Thread.sleep(1000 / requestsPerSecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Calculate and print average execution time
        double averageExecutionTime = (double) totalTime / totalRequests;
        System.out.println("Average execution time: " + averageExecutionTime + " ns");
    }
}
