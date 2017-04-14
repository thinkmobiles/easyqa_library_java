package Organizations;

import API.GetResponse;
import API.Initialization;
import com.google.gson.JsonObject;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Map;

/**
 * Created by yanagusti on 3/31/17.
 */
public class UpdateOrganization extends Initialization{


    public UpdateOrganization(String url) {
        super(url);
    }

    /**
     * Method for getting the list of the organizations in EasyQA
     * @param auth_token your authorization token in EasyQA
     * @throws IOException for incorrect parsing of the server response
     * @throws JSONException if the server returns not Json object
     * @return map of Integer ids and String titles of the organizations
     */

    public Map<String, String> getOrganizationsList(String auth_token) throws IOException, JSONException {


        Call<ResponseBody> call= easyqaUserAPI.getOrganizationsList(auth_token);

        Response<ResponseBody> bodyResponse = call.execute();
        String result = bodyResponse.body().string();
        Map <String, String> organizations = new GetResponse().getMapString(result, "id", "title");
        return organizations;
    }

    /**
     * Method for getting the organization in EasyQA
     * @param auth_token your authorization token in EasyQA
     * @param id the id of your organization
     * @throws IOException for incorrect parsing of the server response
     * @throws JSONException if the server returns not Json object
     * @return JsonObject with info about your organization
     */

    public JSONObject getOrganization(String auth_token, String id) throws IOException, JSONException {


        String name;
        Call<ResponseBody> call= easyqaUserAPI.getOrganization(id, auth_token);

        Response<ResponseBody> bodyResponse = call.execute();
        String result = bodyResponse.body().string();
        System.out.println(result);
        if (result.startsWith("{")) {

                JSONObject obj1 = new JSONObject(result);
                name = obj1.getString("title");
                System.out.println("Organization title= "+name);
            return obj1;

        }else {
            System.out.println("Something went wrong");
            return null;
        }

    }

    /**
     * Method for updating the organization in EasyQA
     * @param auth_token your authorization token in EasyQA
     * @param title the name of your organization
     * @param id the id of your organization
     * @param data additional parameters for an organization
     * @throws IOException for incorrect parsing of the server response
     * @throws JSONException if the server returns not Json object
     * @return map with id and title of the organization
     */

    public Map<String, String> update(String auth_token, String title, String id, String... data) throws IOException, JSONException {

        JsonObject cred = new JsonObject();
        cred.addProperty("title", title);
        if(data.length!=0) {
            cred.addProperty(data[0], data[1]);
        }
        JsonObject parent=new JsonObject();
        parent.addProperty("auth_token", auth_token);
        parent.add("organization", cred);

        Call<ResponseBody> call= easyqaUserAPI.updateOrganization(id, parent);

        Response<ResponseBody> bodyResponse = call.execute();
        String result = bodyResponse.body().string();


        if (result!=null){
            Map<String, String> org= new GetResponse().getMapStringFromJSON(result, "id", "title");
            return org;
        }else {
            System.out.println("Such company already exists");
            return null;
        }

    }
}
