package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter latitude: ");
        double latitude = sc.nextDouble();

        System.out.println("Please enter longitude: ");
        double longitude = sc.nextDouble();

        CountryLocator locator = new CountryLocator();

        List<String> res = locator.getCountryCode(latitude, longitude);
        if(res.isEmpty()) {
            System.out.println("No country found.");
        } else {
            System.out.println("All countries matching with given coordinate:");
            for(String code: res) {
                System.out.println(code);
            }
        }
    }
}