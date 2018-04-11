/*
 *  Map-1 --> topping3
 *
 *    Given a map of food keys and topping values, modify and return the map as follows: if the key
 *    "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set
 *    that as the value for the key "spinach".
 *
 *  Tests:
 *    topping3({"potato": "ketchup"}) ? {"potato": "ketchup", "fries": "ketchup"}
 *    topping3({"potato": "butter"}) ? {"potato": "butter", "fries": "butter"}
 *    topping3({"salad": "oil", "potato": "ketchup"}) ? {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 *    topping3({"toast": "butter", "salad": "oil", "potato": "ketchup"}) ? {"toast": "butter", "spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 *    topping3({}) ? {}
 *    topping3({"salad": "pepper", "fries": "salt"}) ? {"spinach": "pepper", "salad": "pepper", "fries": "salt"}
 *    other tests
 */
public class Topping3 {
  public Map<String, String> topping3(Map<String, String> map) {
    if (map.containsKey("potato")) map.put("fries", map.get("potato"));
    if (map.containsKey("salad")) map.put("spinach", map.get("salad"));
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
