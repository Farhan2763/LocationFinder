package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Coordinate {
    double minLat;
    double maxLat;
    double minLong;
    double maxLong;

    Coordinate(double minLat, double maxLat, double minLong, double maxLong) {
        this.minLat = minLat;
        this.maxLat = maxLat;
        this.minLong = minLong;
        this.maxLong = maxLong;
    }
}
public class CountryLocator {

    CountryLocator() {}

    static Map<String, Coordinate> data = new HashMap<>();
    static {
        data.put("AF", new Coordinate(29.377713, 38.483418, 60.872972, 74.8795)); // Afghanistan
        data.put("AL", new Coordinate(39.644862, 42.661053, 19.263341, 21.057457)); // Albania
        data.put("DZ", new Coordinate(18.976149, 37.089839, -8.667674, 11.999506)); // Algeria
        data.put("AD", new Coordinate(42.428219, 42.65672, 1.413734, 1.786686)); // Andorra
        data.put("AO", new Coordinate(-18.042752, -4.388812, 11.679631, 24.083416)); // Angola
        data.put("AG", new Coordinate(16.989217, 17.729425, -62.672048, -61.672921)); // Antigua and Barbuda
        data.put("AR", new Coordinate(-55.051367, -21.781225, -73.560361, -53.591147)); // Argentina
        data.put("AM", new Coordinate(38.841681, 41.30133, 43.449928, 46.637908)); // Armenia
        data.put("AU", new Coordinate(-43.634597, -9.217981, 113.338953, 153.569469)); // Australia
        data.put("AT", new Coordinate(46.372652, 49.020789, 9.530839, 17.160644)); // Austria
        data.put("AZ", new Coordinate(38.389202, 41.905318, 44.771128, 50.370301)); // Azerbaijan
        data.put("BA", new Coordinate(42.546245, 45.239128, 15.750026, 19.623528)); // Bosnia and Herzegovina
        data.put("BB", new Coordinate(13.043422, 13.335107, -59.649803, -59.425533)); // Barbados
        data.put("BD", new Coordinate(20.738049, 26.631943, 88.084421, 92.673294)); // Bangladesh
        data.put("BE", new Coordinate(49.496982, 51.505144, 2.541437, 6.408517)); // Belgium
        data.put("BF", new Coordinate(9.401865, 15.082643, -5.521838, 2.409598)); // Burkina Faso
        data.put("BG", new Coordinate(41.235392, 44.215507, 22.357143, 28.614854)); // Bulgaria
        data.put("BH", new Coordinate(25.793201, 26.282195, 50.457947, 50.720769)); // Bahrain
        data.put("BI", new Coordinate(-4.469817, -2.310668, 28.994542, 30.847582)); // Burundi
        data.put("BJ", new Coordinate(6.041641, 12.408389, 0.77539, 3.851325)); // Benin
        data.put("BN", new Coordinate(4.005213, 5.101683, 114.075172, 115.361506)); // Brunei Darussalam
        data.put("BO", new Coordinate(-22.897899, -9.679324, -69.673476, -57.458661)); // Bolivia
        data.put("BR", new Coordinate(-33.751869, 5.264877, -73.985535, -34.729997)); // Brazil
        data.put("BS", new Coordinate(20.918259, 27.120579, -79.073566, -72.579675)); // Bahamas
        data.put("BT", new Coordinate(26.702033, 28.324553, 88.751903, 92.125352)); // Bhutan
        data.put("BW", new Coordinate(-26.907121, -17.778696, 19.978806, 29.360271)); // Botswana
        data.put("BY", new Coordinate(51.2504, 56.16913, 23.176868, 32.770119)); // Belarus
        data.put("BZ", new Coordinate(15.889, 18.496, -89.231, -87.785)); // Belize
        data.put("CA", new Coordinate(41.675105, 83.110626, -141.0, -52.619449)); // Canada
        data.put("CD", new Coordinate(-13.459335, 5.382655, 12.204736, 31.305888)); // Congo, Democratic Republic of the
        data.put("CF", new Coordinate(2.22098, 11.01556, 14.41538, 27.457989)); // Central African Republic
        data.put("CG", new Coordinate(-5.041303, 3.703444, 11.093786, 18.63744)); // Congo
        data.put("CH", new Coordinate(45.818, 47.808, 5.955, 10.492)); // Switzerland
        data.put("CI", new Coordinate(4.344624, 10.736642, -8.59981, -2.49489)); // Côte d'Ivoire
        data.put("CL", new Coordinate(-56.852947, -17.503869, -75.72503, -66.417675)); // Chile
        data.put("CM", new Coordinate(1.652, 13.083, 8.488, 16.196)); // Cameroon
        data.put("CN", new Coordinate(17.999332, 53.560974, 73.499734, 134.773911)); // China
        data.put("CO", new Coordinate(-4.231687, 13.39133, -79.023921, -66.876183)); // Colombia
        data.put("CR", new Coordinate(8.039836, 11.216833, -85.95084, -82.510857)); // Costa Rica
        data.put("CU", new Coordinate(19.828055, 23.226389, -84.951035, -74.131139)); // Cuba
        data.put("CV", new Coordinate(14.808436, 17.205849, -25.357641, -22.666042)); // Cabo Verde
        data.put("CY", new Coordinate(34.563883, 35.700112, 32.273945, 34.597187)); // Cyprus
        data.put("CZ", new Coordinate(48.551201, 51.117249, 12.090781, 18.860791)); // Czech Republic
        data.put("DE", new Coordinate(47.270111, 55.05814, 5.866315, 15.041896)); // Germany
        data.put("DJ", new Coordinate(10.926899, 12.712343, 41.773472, 43.416637)); // Djibouti
        data.put("DK", new Coordinate(54.559258, 57.748474, 8.087063, 15.158514)); // Denmark
        data.put("DM", new Coordinate(15.201066, 15.631756, -61.480362, -61.259758)); // Dominica
        data.put("DO", new Coordinate(17.507511, 19.93107, -72.003514, -68.32267)); // Dominican Republic
        data.put("DZ", new Coordinate(18.976149, 37.089839, -8.667674, 11.999506)); // Algeria
        data.put("EC", new Coordinate(-5.016934, 1.439386, -91.663087, -75.184601)); // Ecuador
        data.put("EE", new Coordinate(57.524011, 59.676923, 21.71198, 28.209178)); // Estonia
        data.put("EG", new Coordinate(21.994263, 31.646218, 24.696969, 36.86623)); // Egypt
        data.put("EH", new Coordinate(20.768699, 27.666626, -17.103889, -8.670883)); // Western Sahara
        data.put("ER", new Coordinate(12.359944, 18.004167, 36.438, 43.122662)); // Eritrea
        data.put("ES", new Coordinate(27.640638, 43.791645, -18.161091, 4.327786)); // Spain
        data.put("ET", new Coordinate(3.402597, 14.893651, 32.997389, 47.986238)); // Ethiopia
        data.put("FI", new Coordinate(59.80825, 70.092681, 20.556093, 31.58031)); // Finland
        data.put("FJ", new Coordinate(-20.67558, -12.479123, 177.12915, -179.9999)); // Fiji
        data.put("FM", new Coordinate(5.280096, 10.109349, 137.336594, 163.037567)); // Micronesia, Federated States of
        data.put("FR", new Coordinate(41.335402, 51.124199, -5.140277, 9.562666)); // France
        data.put("GA", new Coordinate(-3.978826, 2.322599, 8.69643, 14.502206)); // Gabon
        data.put("GB", new Coordinate(50.013602, 58.784866, -8.6219, 1.768914)); // United Kingdom
        data.put("GD", new Coordinate(11.986812, 12.531028, -61.808082, -61.555972)); // Grenada
        data.put("GE", new Coordinate(41.064071, 43.58711, 40.010635, 46.736118)); // Georgia
        data.put("GH", new Coordinate(4.736762, 11.173301, -3.261259, 1.199882)); // Ghana
        data.put("GM", new Coordinate(13.060264, 13.826681, -16.82919, -13.797273)); // Gambia
        data.put("GN", new Coordinate(7.191661, 12.67619, -15.130311, -7.641451)); // Guinea
        data.put("GQ", new Coordinate(-1.485695, 3.772102, 5.61675, 11.358476)); // Equatorial Guinea
        data.put("GR", new Coordinate(34.802067, 41.748306, 19.369134, 29.664899)); // Greece
        data.put("GT", new Coordinate(13.740205, 17.821722, -92.246569, -88.22323)); // Guatemala
        data.put("GW", new Coordinate(10.920214, 12.681467, -16.717533, -13.64626)); // Guinea-Bissau
        data.put("GY", new Coordinate(1.175, 8.547, -61.386, -56.481)); // Guyana
        data.put("HN", new Coordinate(12.979603, 17.421051, -89.359949, -83.130118)); // Honduras
        data.put("HR", new Coordinate(42.435253, 46.554653, 13.493873, 19.426934)); // Croatia
        data.put("HT", new Coordinate(18.021065, 20.218528, -74.478455, -71.62184)); // Haiti
        data.put("HU", new Coordinate(45.743318, 48.585308, 16.111035, 22.894548)); // Hungary
        data.put("ID", new Coordinate(-10.941168, 5.908593, 95.004303, 141.028946)); // Indonesia
        data.put("IE", new Coordinate(51.427085, 55.384366, -10.478647, -6.002297)); // Ireland
        data.put("IL", new Coordinate(29.490376, 33.293255, 34.267127, 35.898399)); // Israel
        data.put("IN", new Coordinate(6.755591, 35.504475, 68.111378, 97.395358)); // India
        data.put("IQ", new Coordinate(29.061075, 37.384006, 38.795635, 48.578334)); // Iraq
        data.put("IR", new Coordinate(24.496623, 39.778889, 44.044832, 63.333359)); // Iran, Islamic Republic of
        data.put("IS", new Coordinate(63.283003, 66.591911, -24.546317, -13.495709)); // Iceland
        data.put("IT", new Coordinate(35.492036, 47.092146, 6.626719, 18.520227)); // Italy
        data.put("JM", new Coordinate(17.707466, 18.526383, -78.381352, -76.187227)); // Jamaica
        data.put("JO", new Coordinate(29.185034, 33.37778, 34.884437, 39.301442)); // Jordan
        data.put("JP", new Coordinate(24.396308, 45.551483, 122.93457, 153.984634)); // Japan
        data.put("KE", new Coordinate(-4.677113, 5.019329, 33.909298, 41.899617)); // Kenya
        data.put("KG", new Coordinate(39.172843, 43.238976, 69.276581, 80.256147)); // Kyrgyzstan
        data.put("KH", new Coordinate(10.409219, 14.686491, 102.339184, 107.627463)); // Cambodia
        data.put("KI", new Coordinate(-11.462636, 4.725111, 169.556137, -150.24231)); // Kiribati
        data.put("KM", new Coordinate(-12.387917, -11.365977, 43.213165, 44.538299)); // Comoros
        data.put("KN", new Coordinate(17.078919, 17.418631, -62.86413, -62.533284)); // Saint Kitts and Nevis
        data.put("KP", new Coordinate(37.67256, 43.008417, 124.315236, 130.674973)); // Korea, Democratic People's Republic of
        data.put("KR", new Coordinate(33.19095, 38.612419, 124.613665, 130.924576)); // Korea, Republic of
        data.put("KW", new Coordinate(28.524156, 30.095028, 46.555613, 48.416094)); // Kuwait
        data.put("KZ", new Coordinate(40.936261, 55.448322, 46.491074, 87.342882)); // Kazakhstan
        data.put("LA", new Coordinate(13.925171, 22.499408, 100.11431, 107.635081)); // Lao People's Democratic Republic
        data.put("LB", new Coordinate(33.053431, 34.644914, 35.118286, 36.623258)); // Lebanon
        data.put("LC", new Coordinate(13.707535, 14.111992, -61.079307, -60.874989)); // Saint Lucia
        data.put("LI", new Coordinate(47.057972, 47.273222, 9.4768, 9.635219)); // Liechtenstein
        data.put("LK", new Coordinate(5.917612, 9.835626, 79.650575, 81.890632)); // Sri Lanka
        data.put("LR", new Coordinate(4.353077, 8.551982, -11.492739, -7.365296)); // Liberia
        data.put("LS", new Coordinate(-30.668194, -28.572812, 27.011156, 29.455512)); // Lesotho
        data.put("LT", new Coordinate(53.897018, 56.450597, 20.926304, 26.835935)); // Lithuania
        data.put("LU", new Coordinate(49.446141, 50.182944, 5.731467, 6.524371)); // Luxembourg
        data.put("LV", new Coordinate(55.671137, 58.085545, 20.967509, 28.241245)); // Latvia
        data.put("LY", new Coordinate(19.496978, 33.168832, 9.319464, 25.368167)); // Libya
        data.put("MA", new Coordinate(21.420734, 35.922484, -13.172065, -1.010955)); // Morocco
        data.put("MC", new Coordinate(43.727432, 43.75193, 7.408183, 7.439125)); // Monaco
        data.put("MD", new Coordinate(45.448208, 48.493328, 26.616438, 30.13574)); // Moldova, Republic of
        data.put("ME", new Coordinate(41.851955, 43.570137, 18.433555, 20.352319)); // Montenegro
        data.put("MG", new Coordinate(-25.588613, -11.934455, 43.22454, 50.501047)); // Madagascar
        data.put("MH", new Coordinate(5.587482, 14.180717, 163.037674, 172.001343)); // Marshall Islands
        data.put("MK", new Coordinate(40.85554, 42.376812, 20.463625, 23.0347)); // North Macedonia
        data.put("ML", new Coordinate(10.147233, 25.000717, -12.242629, 4.244625)); // Mali
        data.put("MM", new Coordinate(9.784906, 28.547347, 92.189743, 101.170251)); // Myanmar
        data.put("MN", new Coordinate(41.581811, 52.148354, 87.743805, 119.921667)); // Mongolia
        data.put("MR", new Coordinate(14.715057, 27.285879, -17.063386, -4.827674)); // Mauritania
        data.put("MT", new Coordinate(35.794544, 36.082639, 14.183639, 14.575639)); // Malta
        data.put("MU", new Coordinate(-20.524189, -10.323786, 56.512311, 63.507085)); // Mauritius
        data.put("MV", new Coordinate(-0.653087, 7.125066, 72.684029, 73.774971)); // Maldives
        data.put("MW", new Coordinate(-17.129759, -9.367646, 32.672165, 35.91631)); // Malawi
        data.put("MX", new Coordinate(14.5459, 32.7187, -118.409, -86.7)); // Mexico
        data.put("MY", new Coordinate(0.855737, 7.520703, 99.640099, 119.434)); // Malaysia
        data.put("MZ", new Coordinate(-26.849223, -10.470588, 30.213135, 40.847983)); // Mozambique
        data.put("NA", new Coordinate(-28.959926, -16.963485, 11.73349, 25.261617)); // Namibia
        data.put("NE", new Coordinate(11.693659, 23.51463, 0.167489, 15.996929)); // Niger
        data.put("NG", new Coordinate(4.240594, 13.885645, 2.676932, 14.680247)); // Nigeria
        data.put("NI", new Coordinate(10.70738, 15.036298, -87.690282, -83.147219)); // Nicaragua
        data.put("NL", new Coordinate(50.753707, 53.509833, 3.314971, 7.227498)); // Netherlands
        data.put("NO", new Coordinate(57.766533, 71.189797, 4.768323, 31.058399)); // Norway
        data.put("NP", new Coordinate(26.347466, 30.446945, 80.058861, 88.201528)); // Nepal
        data.put("NR", new Coordinate(-0.55453, -0.49902, 166.906204, 167.04567)); // Nauru
        data.put("NZ", new Coordinate(-47.293138, -33.891769, 165.66858, 179.9999)); // New Zealand
        data.put("OM", new Coordinate(16.651633, 26.38764, 52.000735, 59.837841)); // Oman
        data.put("PA", new Coordinate(7.203766, 9.645833, -83.051392, -77.15078)); // Panama
        data.put("PE", new Coordinate(-18.347975, -0.012327, -81.410943, -68.677013)); // Peru
        data.put("PG", new Coordinate(-11.64228, -1.081682, 140.842483, 159.967719)); // Papua New Guinea
        data.put("PH", new Coordinate(4.643158, 21.11979, 116.931813, 126.599195)); // Philippines
        data.put("PK", new Coordinate(23.634499, 37.084107, 60.872972, 77.837451)); // Pakistan
        data.put("PL", new Coordinate(49.002102, 54.823322, 14.123424, 24.1465)); // Poland
        data.put("PS", new Coordinate(31.216267, 32.552147, 34.216393, 35.573909)); // Palestine, State of
        data.put("PT", new Coordinate(36.961264, 42.154309, -31.265356, -6.189159)); // Portugal
        data.put("PW", new Coordinate(2.803446, 8.584757, 131.647568, 134.730155)); // Palau
        data.put("PY", new Coordinate(-27.599404, -19.287331, -62.64752, -54.259595)); // Paraguay
        data.put("QA", new Coordinate(24.556563, 26.23247, 50.745209, 51.625024)); // Qatar
        data.put("RO", new Coordinate(43.618681, 48.265396, 20.261617, 29.690861)); // Romania
        data.put("RS", new Coordinate(42.232811, 46.181782, 18.818056, 23.006309)); // Serbia
        data.put("RU", new Coordinate(41.192686, 81.857587, 19.644411, 169.052588)); // Russia
        data.put("RW", new Coordinate(-2.917857, -1.047189, 28.857691, 30.895506)); // Rwanda
        data.put("SA", new Coordinate(16.347893, 32.154578, 34.496124, 55.666903)); // Saudi Arabia
        data.put("SB", new Coordinate(-12.308436, -6.599191, 155.396498, 162.005398)); // Solomon Islands
        data.put("SC", new Coordinate(-10.464109, -3.703423, 46.204552, 56.297693)); // Seychelles
        data.put("SD", new Coordinate(8.681787, 22.234853, 21.814684, 38.582203)); // Sudan
        data.put("SE", new Coordinate(55.102581, 69.059991, 11.118731, 24.155251)); // Sweden
        data.put("SG", new Coordinate(1.233267, 1.464111, 103.605492, 104.094214)); // Singapore
        data.put("SI", new Coordinate(45.421814, 46.876677, 13.375345, 16.610194)); // Slovenia
        data.put("SK", new Coordinate(47.75713, 49.571665, 16.847135, 22.565353)); // Slovakia
        data.put("SL", new Coordinate(6.920298, 10.084918, -13.295447, -10.271511)); // Sierra Leone
        data.put("SM", new Coordinate(43.893211, 43.992678, 12.403111, 12.514741)); // San Marino
        data.put("SN", new Coordinate(12.307081, 16.691632, -17.537276, -11.365209)); // Senegal
        data.put("SO", new Coordinate(-1.677223, 11.495088, 40.986816, 51.412132)); // Somalia
        data.put("SR", new Coordinate(1.8351, 6.0751, -58.0786, -53.9771)); // Suriname
        data.put("SS", new Coordinate(3.487107, 12.236385, 24.140524, 35.968914)); // South Sudan
        data.put("ST", new Coordinate(0.018515, 1.701323, 6.46968, 7.667245)); // Sao Tome and Principe
        data.put("SV", new Coordinate(13.087942, 14.451025, -90.105514, -87.692268)); // El Salvador
        data.put("SY", new Coordinate(32.311187, 37.320302, 35.599923, 42.386589)); // Syrian Arab Republic
        data.put("SZ", new Coordinate(-27.316879, -25.718119, 30.793684, 32.13369)); // Eswatini
        data.put("TD", new Coordinate(7.441068, 23.449063, 13.473856, 24.00246)); // Chad
        data.put("TG", new Coordinate(6.104207, 11.14408, -0.147325, 1.806197)); // Togo
        data.put("TH", new Coordinate(5.612851, 20.463379, 97.345647, 105.634754)); // Thailand
        data.put("TJ", new Coordinate(36.678841, 41.041461, 67.336823, 75.187567)); // Tajikistan
        data.put("TL", new Coordinate(-9.504041, -8.12917, 124.046327, 127.533328)); // Timor-Leste
        data.put("TM", new Coordinate(35.141778, 42.792065, 52.441521, 66.684593)); // Turkmenistan
        data.put("TN", new Coordinate(30.230387, 37.543093, 7.479924, 11.600124)); // Tunisia
        data.put("TO", new Coordinate(-21.455212, -15.562614, -175.677736, -173.907808)); // Tonga
        data.put("TR", new Coordinate(35.817304, 42.107667, 25.974646, 44.817915)); // Turkey
        data.put("TT", new Coordinate(10.036671, 11.336103, -61.908893, -60.485693)); // Trinidad and Tobago
        data.put("TV", new Coordinate(-10.785207, -5.697111, 176.11995, 179.887726)); // Tuvalu
        data.put("TW", new Coordinate(21.896701, 25.301612, 120.106188, 122.003687)); // Taiwan, Province of China
        data.put("TZ", new Coordinate(-11.745816, -0.9925, 29.33, 40.449611)); // Tanzania, United Republic of
        data.put("UA", new Coordinate(44.379714, 52.379147, 22.138646, 40.228676)); // Ukraine
        data.put("UG", new Coordinate(-1.477869, 4.229418, 29.573469, 35.008225)); // Uganda
        data.put("US", new Coordinate(24.396308, 49.384358, -125.0, -66.93457)); // United States of America
        data.put("UY", new Coordinate(-34.996496, -30.096169, -58.438225, -53.08752)); // Uruguay
        data.put("UZ", new Coordinate(37.184781, 45.58655, 55.973443, 73.148947)); // Uzbekistan
        data.put("VA", new Coordinate(41.903698, 41.907386, 12.454149, 12.458509)); // Holy See (Vatican City State)
        data.put("VC", new Coordinate(12.583437, 13.592892, -61.460986, -61.114423)); // Saint Vincent and the Grenadines
        data.put("VE", new Coordinate(0.645977, 12.201902, -73.378912, -59.803218)); // Venezuela, Bolivarian Republic of
        data.put("VN", new Coordinate(8.175076, 23.392671, 102.144294, 109.466248)); // Viet Nam
        data.put("VU", new Coordinate(-20.248909, -13.070034, 166.524623, 170.547089)); // Vanuatu
        data.put("WS", new Coordinate(-14.043927, -13.462315, -172.807949, -171.41512)); // Samoa
        data.put("XK", new Coordinate(41.845137, 43.262494, 20.032056, 21.775633)); // Kosovo
        data.put("YE", new Coordinate(12.111091, 18.999229, 42.565008, 54.476775)); // Yemen
        data.put("ZA", new Coordinate(-47.076308, -22.125076, 16.344976, 32.891636)); // South Africa
        data.put("ZM", new Coordinate(-17.961232, -8.200416, 21.999092, 33.708828)); // Zambia
        data.put("ZW", new Coordinate(-22.414247, -15.616327, 25.23608, 33.065632)); // Zimbabwe
            // Add more countries as needed
        }



    public List<String> getCountryCode(double latitude, double longitude) throws Exception {
        List<String> countries = new ArrayList<>();
        for (Map.Entry<String, Coordinate> entry : data.entrySet()) {
            Coordinate coordinate = entry.getValue();
            if (latitude >= coordinate.minLat && latitude <= coordinate.maxLat &&
                    longitude >= coordinate.minLong && longitude <= coordinate.maxLong) {
                countries.add(entry.getKey());
            }
        }
        return countries;
    }
}
