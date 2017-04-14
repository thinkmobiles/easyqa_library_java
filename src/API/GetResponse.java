package API;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanagusti on 4/6/17.
 */
public class GetResponse {

    /**
     * Parse the server response and get specified Integer and String values from it
     * @param result String value of the server response
     * @param key1 for parsing Integer value from the server response
     * @param key2 for parsing String value from the server response
     * @throws IOException for incorrect parsing of the server response
     * @throws JSONException if the server returns not Json object
     * @return Map
     */

//    public Map <Integer, String> getMapInteger(String result, String key1, String key2) throws IOException, JSONException {
//        Map<Integer, String> names = new HashMap<>();
//
//        if (result.startsWith("[")) {
//            JSONArray jsonArray = new JSONArray(result);
//
//
//            for (int j = 0; j < jsonArray.length(); j++) {
//                JSONObject obj1 = jsonArray.getJSONObject(j);
//                Integer id = obj1.getInt(key1);
//                String status = obj1.getString(key2);
//                names.put(key1, id);
//                names.put(key2, status);
//
//            }
//            System.out.println(names);
//
//        }else {
//            System.out.println(result);
//        }
//        return names;
//    }

    /**
     * Parse the server response and get specified String values from it
     * @param result String value of the server response
     * @param key1 for parsing String value from the server response
     * @param key2 for parsing String value from the server response
     * @throws IOException for incorrect parsing of the server response
     * @throws JSONException if the server returns not Json object
     * @return Map
     */

    public Map <String, String> getMapString(String result, String key1, String key2) throws IOException, JSONException {
        Map<String, String> names = new HashMap<>();

        if (result.startsWith("[")) {
            JSONArray jsonArray = new JSONArray(result);


            for (int j = 0; j < jsonArray.length(); j++) {
                JSONObject obj1 = jsonArray.getJSONObject(j);
                String id;
                if (key1=="id") {
                    id = String.valueOf(obj1.getInt(key1));
                }else {
                    id = obj1.getString(key1);
                }
                String status = obj1.getString(key2);
                names.put(key1+j, id);
                names.put(key2+j, status);

            }
            System.out.println(names);

        }else {
            System.out.println(result);
        }
        return names;
    }

    public Map <String, String> getMapStringFromJSON(String result, String key1, String key2) throws IOException, JSONException {
        Map<String, String> names = new HashMap<>();

        if (result.startsWith("{")) {
            JSONObject jsonObject = new JSONObject(result);

            String id;
            if (key1=="id") {
                id = String.valueOf(jsonObject.getInt(key1));
            }else {
                id = jsonObject.getString(key1);
            }
                String status = jsonObject.getString(key2);
                names.put(key1, id);
                names.put(key2, status);


            System.out.println(names);

        }else {
            System.out.println(result);
        }
        return names;
    }
}
