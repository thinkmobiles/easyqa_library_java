package TestRuns.TestRunResults;

import API.Initialization;
import com.google.gson.JsonObject;
import okhttp3.ResponseBody;
import org.json.JSONException;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by yanagusti on 4/5/17.
 */
public class DeleteTestRunResults extends Initialization {

    public DeleteTestRunResults(String url) {
        super(url);
    }

    /**
     * Method for deleting a test run result (return untested status) on Test Activities page within your project in EasyQA
     * @param token of your project in EasyQA. You can generate it on Integrations page
     * @param auth_token your authorization token in EasyQA
     * @param test_run_result_id an id of your test run result (test case which is added to the test run and has some status)
     * @throws IOException for incorrect parsing of the server response
     * @throws JSONException if the server returns not Json object
     */


    public void delete(String auth_token, String token, String test_run_result_id) throws IOException, JSONException {

        JsonObject parent=new JsonObject();
        parent.addProperty("auth_token", auth_token);
        parent.addProperty("token", token);

        Call<ResponseBody> call= easyqaUserAPI.deleteTestRunResult(test_run_result_id, parent);

        Response<ResponseBody> bodyResponse = call.execute();
        String result = bodyResponse.body().string();
        if (result!=null) {
        }else {
            System.out.println("error");
        }

    }
}
