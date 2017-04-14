package Roles;

import API.Initialization;
import com.google.gson.JsonObject;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by yanagusti on 3/31/17.
 */
public class OrganizationRole extends Initialization {
    public OrganizationRole(String url) {
        super(url);
    }

    /**
     * Method for adding user to your organization (assign him role) by user id
     * @param auth_token your authorization token in EasyQA
     * @param user_id an id of the user to which you want to assign the role (add to organization)
     * @param organization_id the id of your organization
     * @param role can be "user" or "admin"
     * @throws IOException for incorrect parsing of the server response
     * @throws JSONException if the server returns not Json object
     * @return JSONObject result of the server response
     */

    public JSONObject assignByUserID(String auth_token, Integer user_id, String organization_id, String role) throws IOException, JSONException {


        JsonObject parent=new JsonObject();
        parent.addProperty("auth_token", auth_token);
        parent.addProperty("user_id", user_id);
        parent.addProperty("role", role);


        Call<ResponseBody> call= easyqaUserAPI.assigneOrganizationRole(organization_id, parent);

        Response<ResponseBody> bodyResponse = call.execute();
        String result = bodyResponse.body().string();
        if (result!=null){


            if (result.startsWith("{")) {
                JSONObject jsonObj = new JSONObject(result);
                return jsonObj;

            }else {
                System.out.println(result);
                return null;
            }
        }else {
            System.out.println("Something went wrong!");
            return null;
        }

    }

    /**
     * Method for adding user to your organization (assign him role) by user email
     * @param auth_token your authorization token in EasyQA
     * @param email an email of the user to which you want to assign the role (add to organization)
     * @param organization_id the id of your organization
     * @param role can be "user" or "admin"
     * @throws IOException for incorrect parsing of the server response
     * @throws JSONException if the server returns not Json object
     * @return JSONObject result of the server response
     */

    public JSONObject assignByUserEmail(String auth_token, String email, String organization_id, String role) throws IOException, JSONException {


        JsonObject parent=new JsonObject();
        parent.addProperty("auth_token", auth_token);
        parent.addProperty("email", email);
        parent.addProperty("role", role);


        Call<ResponseBody> call= easyqaUserAPI.assigneOrganizationRole(organization_id, parent);

        Response<ResponseBody> bodyResponse = call.execute();
        String result = bodyResponse.body().string();
        if (result!=null){


            if (result.startsWith("{")) {
                JSONObject jsonObj = new JSONObject(result);
                return jsonObj;

            }else {
                System.out.println(result);
                return null;
            }
        }else {
            System.out.println("Something went wrong!");
            return null;
        }

    }
}
