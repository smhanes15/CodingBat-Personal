/*
 *  Map-1 --> topping1
 *
 *    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice
 *    cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value
 *    "butter".
 *
 *  Tests:
 *    topping1({"ice cream": "peanuts"}) ? {"bread": "butter", "ice cream": "cherry"}
 *    topping1({}) ? {"bread": "butter"}
 *    topping1({"pancake": "syrup"}) ? {"bread": "butter", "pancake": "syrup"}
 *    topping1({"bread": "dirt", "ice cream": "strawberries"}) ? {"bread": "butter", "ice cream": "cherry"}
 *    topping1({"bread": "jam", "ice cream": "strawberries", "salad": "oil"}) ? {"bread": "butter", "ice cream": "cherry", "salad": "oil"}
 *    other tests
 */
public class Topping1 {
  public Map<String, String> topping1(Map<String, String> map) {
    if (map.containsKey("ice cream")) map.put("ice cream", "cherry");
    map.put("bread", "butter");
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
