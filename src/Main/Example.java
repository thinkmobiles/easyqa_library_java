package Main;

import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by yanagusti on 4/13/17.
 */
public class Example {

//    public static String url = "https://app.geteasyqa.com";
    public static String url = "http://qa_dashboard.test.thinkmobiles.com:8085/";
//    public static String token = "PHbjPki+2P7Pn/6fNgNLiN3CpIu2c7bt";
    public static String token = "NcS6OjfvocJwEJmYnjcCnhpIadKyx9tv";
//    public static String email = "test@gmail.com";
    public static String email = "yana.gusti@thinkmobiles.com";
    public static String password = "111111";

    public static void main (String args []) throws IOException, JSONException {
        ArrayList<File> files = new ArrayList<>();
        files.add(0, new File("./lib/jpeg.png"));
        files.add(1, new File("./lib/test.jpg"));

        EasyQA easyQA = new EasyQA(url);


        //login into EasyQA and generate auth_token
        Map<String, String> user = easyQA.signIn(token, email, password);
        String name = user.get("name");
        String auth_token = user.get("auth_token");
        System.out.println("name="+name+" auth_token="+auth_token);

//       //get the list of your project members
//        Map<String, String> members= easyQA.membersList(token);
//        String user_id = user.get("id0");
//        System.out.println("list of members:\n"+members);


//        //create Organization with unique title
//        Integer id = easyQA.createOrganization("FROMIDEA123123121122");
//        System.out.println("Organization is created! id="+id);

//        //get the list of organizations
//        Map<String, String> organizations = easyQA.getOrganizationsList();
//        System.out.println("list of organizations:\n"+organizations);

//        //get full info about the organization by its ID
//        JSONObject organization = easyQA.getOrganization(id);
//        Integer org_id = organization.getInt("id");
//        System.out.println(organization);
//        System.out.println(org_id);

//        //update organization with unique title or description
//        Map<String, String> org = easyQA.updateOrganization("FROMIDEA111111111", id, "description", "test for library");
//        String org_id1 = org.get("id");
//        String org_title = org.get("title");
//        System.out.println("Organization was updated! organization_id="+org_id1+" organization_title="+org_title);


////        get the list of organization roles
//        Map<String, String> roles = easyQA.getOrganizationRolesList(String.valueOf(49));
//        System.out.println("list of organization roles:\n"+roles);

//        //add a new user to your organization assign him with role Admin
//        easyQA.assigneAdmin(user_id, String.valueOf(organization_id));

//        //add a new user to your organization assign him with role User
//        easyQA.assigneUser(user_id, String.valueOf(organization_id));

//        //update the role of the user to Admin in the organization in EasyQA
//        easyQA.updateOrganizationRoleToAdmin(String.valueOf(organization_role_id));

//        //update the role of the user to User in the organization in EasyQA
//          easyQA.updateOrganizationRoleToUser(String.valueOf(organization_role_id));

//        //delete role by id
//        easyQA.deleteRole(role_id);
//        System.out.println("Delete Role with id="+ id);

//        //delete organization by id
//        easyQA.deleteOrganization(String.valueOf(id));
//        System.out.println("Delete Organization with id="+ id);

        //create project in specified by id organization
//        Integer project_id = easyQA.createProject(organization_id, "FROM IDEA11");
//        System.out.println("Project is created! id="+project_id);


//        //get the list of projects
//        Map<String, String> projects = easyQA.getProjectsList();
//        System.out.println("list of projects:\n"+projects);

//        //get full info about the project by its ID
//        JSONObject project = easyQA.getProject(project_id);
//        Integer pr_id = project.getInt("id");
//        System.out.println(project);
//        System.out.println(pr_id);

//        //update project with title
//        Map<String, String> pr = easyQA.updateProject("testtestetest", String.valueOf(project_id));
//        String pr_id1 = pr.get("id");
//        String pr_title = pr.get("title");
//        System.out.println("Project was updated! project_id="+pr_id1+" project_title="+pr_title);

//        get the list of project roles
//        Map<String, String> roles1 = easyQA.getProjectRolesList(String.valueOf(49), token);
//        System.out.println("list of project roles:\n"+roles1);

//        //get full info about the role by its ID
//        JSONObject role = easyQA.getRole(String.valueOf(role_id));
//        Integer pr_id = role.getInt("id");
//        System.out.println(role);
//        System.out.println(pr_id);


        //add new user to your project and assign him with role Tester
//        easyQA.assigneTester(user_id, String.valueOf(organization_id), token);
//
//        //add new user to your project and assign him with role Developer
//        easyQA.assigneDeveloper(user_id, String.valueOf(organization_id), token);
//
//        //add new user to your project and assign him with role Viewer
//        easyQA.assigneViewer(user_id, String.valueOf(organization_id), token);
//
//        //add new user to your project and assign him with role Project Manager
//        easyQA.assigneProjectManager(user_id, String.valueOf(organization_id), token);

         //update the role of the user to Tester in your project
//        easyQA.updateProjectRoleToTester(String.valueOf(project_role_id), token);

        //update the role of the user to Developer in your project
//        easyQA.updateProjectRoleToDeveloper(String.valueOf(project_role_id), token);

        //update the role of the user to Viewer in your project
//        easyQA.updateProjectRoleToViewer(String.valueOf(project_role_id), token);

        //update the role of the user to Project Manager in your project
//        easyQA.updateProjectRoleToProject_Manager(String.valueOf(project_role_id), token);

//        //delete oproject by id
//        easyQA.deleteProject(String.valueOf(project_id));
//        System.out.println("Delete project with id="+ project_id);

//        //create new test plan for your Project
//        Integer test_plan_id = easyQA.createTestPlan(token, "test plan 1", "description", "test plan for library");
//        System.out.println("Test Plan is created! id="+test_plan_id);

//        //get the list of test plans
//        Map<String, String> test_plans = easyQA.getTestPlansList(token);
//        System.out.println("list of test plans:\n"+test_plans);

////        get full info about the test plan by its ID
//        JSONObject test_plan = easyQA.getTestPlan(token, String.valueOf(test_plan_id));
//        Integer tp_id = test_plan.getInt("id");
//        System.out.println(tp_id);
//        System.out.println(test_plan);

//        //update test plan with name
//        Map<String, String> plan = easyQA.updateTestPlan(token, String.valueOf(test_plan_id), "test plan 2");
//        String pl_id1 = plan.get("id");
//        String pl_title = plan.get("title");
//        System.out.println("Test Plan was updated! plan_id="+pl_id1+" plan_title="+pl_title);

//        //delete test plan by id
//        easyQA.deleteTestPlan(token, String.valueOf(test_plan_id));
//        System.out.println("Delete Test Plan with id="+ test_plan_id);


//        //create new module for selected test plan
//        Integer module_id = easyQA.createModule(token, String.valueOf(test_plan_id), "first");
//        System.out.println("Module is created! id="+module_id);

//        //get the list of modules
//        Map<String, String> modules = easyQA.getModulesList(token, String.valueOf(test_plan_id));
//        System.out.println("list of modules:\n"+modules);

//        //get full info about the module by its ID
//        JSONObject module = easyQA.getModule(token, String.valueOf(module_id));
//        Integer md_id = module.getInt("id");
//        System.out.println(md_id);
//        System.out.println(module);

//        //update module with name
//        Map<String, String> md = easyQA.updateModule(token, String.valueOf(module_id), "firsttest");
//        String md_id1 = md.get("id");
//        String md_name = md.get("title");
//        System.out.println("Module was updated! module_id="+md_id1+" module_title="+md_name);

//        //delete module by id
//        easyQA.deleteModule(token, String.valueOf(module_id));
//        System.out.println("Delete Module with id="+ module_id);


////        create new test case for selected module
//        Integer test_case_id = easyQA.createTestCase(token, String.valueOf(module_id), "test case 1");
//        System.out.println("Test Case is created! id="+test_case_id);

//        //get the list of test cases of the selected module on Test Activities page within your project in EasyQA
//        Map<String, String> test_cases_in_module = easyQA.getTestCasesListOfModule(token, String.valueOf(module_id));
//        System.out.println("list of test cases in module:\n"+test_cases_in_module);

//        //get the list of test cases of the selected test plan on Test Activities page within your project in EasyQA
//        Map<String, String> test_cases_in_plan = easyQA.getTestCasesListOfTestPlan(token, String.valueOf(214));
//        System.out.println("list of test cases in test plan:\n"+test_cases_in_plan);

////        get full info about the test case by its ID
//        JSONObject test_case = easyQA.getTestCase(token, String.valueOf(test_case_id));
//        Integer tc_id = test_case.getInt("id_in_project");
//        System.out.println(tc_id);
//        System.out.println(test_case);

//        //update status with name
//        Map<String, String> tc = easyQA.updateTestCase(token, String.valueOf(test_case_id), "title", "tets case 3");
//        String tc_id1 = tc.get("id");
//        String tc_name = tc.get("title");
//        System.out.println("Test Case was updated! test_case_id="+tc_id1+" test_case_name="+tc_name);

//        //delete test case by id
//        easyQA.deleteTestCase(token, String.valueOf(test_case_id));
//        System.out.println("Delete Test Case with id="+test_case_id);



//        //create a test run with all test cases of the selected test plan on Test Activities page within your project in EasyQA
//        Integer test_run_id = easyQA.createTestRunIncludeAllTestCases(token, "test runq", test_plan_id, user_id);
//        System.out.println("Test Run is created! id="+test_run_id );

//        //create a test run with selected test cases on Test Activities page within your project in EasyQA
//        Integer testcases[]={1600};
//        Integer test_run_id = easyQA.createTestRunISelectTestCases(token, "test run select", user_id, testcases);
//        System.out.println("Test Run is created! id="+test_run_id );

        //get the list of test runs
//        Map<String, String> test_runs = easyQA.getTestRunsList(token);
//        System.out.println("list of test runs:\n"+test_runs);

//        //get full info about the test run by its ID
//        JSONObject test_run = easyQA.getTestRun(token, String.valueOf(132));
//        Integer md_id = test_run.getInt("id");
//        System.out.println(md_id);
//        System.out.println(test_run);

////        //update a test run with all test cases of the selected test plan on Test Activities page within your project in EasyQA
//        Map<String, String> tr = easyQA.updateTestRunIncludeAllTestCases(token, String.valueOf(test_run_id), test_plan_id);
//        String tr_id1 = tr.get("id");
//        String tr_name = tr.get("title");
//        System.out.println("Test Run was updated! test_run_id="+tr_id1+" test_run_title="+tr_name);

//        //update a test run with selected test cases on Test Activities page within your project in EasyQA
//        Map<String, String> tr1 = easyQA.updateTestRunSelectTestCases(token, String.valueOf(test_run_id), testcases);
//        String tr1_id1 = tr1.get("id");
//        String tr1_name = tr1.get("title");
//        System.out.println("Test Run was updated! test_run_id="+tr1_id1+" test_run_title="+tr1_name);


//        //get the list of test run results (test cases in test run)
//        Map<String, String> test_runs_results = easyQA.getTestRunResultsList(token, String.valueOf(132));
//        Integer trr_id = Integer.valueOf(test_runs_results.get("id0"));
//        System.out.println("list of test run results:\n"+test_runs_results);

//        //get the test run result (test case in test run) by id
//        JSONObject test_run_result = easyQA.getTestRunResult(token, String.valueOf(trr_id));
//        String trr_status = test_run_result.getString("status");
//        System.out.println(trr_status);
//        System.out.println(test_run_result);

//        //update a test run result to Pass status on Test Activities page within your project in EasyQA
//        Map<String, String> trr1 = easyQA.updatePassStatusForTestCase(token, String.valueOf(trr_id));
//        String trr1_id1 = trr1.get("id");
//        String trr1_name = trr1.get("status");
//        System.out.println("Test Run result was updated to Pass! test_run_result_id="+trr1_id1+" test_run_status="+trr1_name);

//        //update a test run result to Failed status on Test Activities page within your project in EasyQA
//        Map<String, String> trr1 = easyQA.updateFailStatusForTestCase(token, String.valueOf(trr_id));
//        String trr1_id1 = trr1.get("id");
//        String trr1_name = trr1.get("status");
//        System.out.println("Test Run result was updated to Pass! test_run_result_id="+trr1_id1+" test_run_status="+trr1_name);

//        //update a test run result to Blocked status on Test Activities page within your project in EasyQA
//        Map<String, String> trr1 = easyQA.updateBlockStatusForTestCase(token, String.valueOf(trr_id));
//        String trr1_id1 = trr1.get("id");
//        String trr1_name = trr1.get("status");
//        System.out.println("Test Run result was updated to Pass! test_run_result_id="+trr1_id1+" test_run_status="+trr1_name);

//        //update a test run result to Untested status on Test Activities page within your project in EasyQA
//        Map<String, String> trr1 = easyQA.updateUntestStatusForTestCase(token, String.valueOf(trr_id));
//        String trr1_id1 = trr1.get("id");
//        String trr1_name = trr1.get("status");
//        System.out.println("Test Run result was updated to Pass! test_run_result_id="+trr1_id1+" test_run_status="+trr1_name);

//        //delete a test run result on Test Activities page within your project in EasyQA
//        easyQA.deleteTestRunResult(token, String.valueOf(trr_id));
//        System.out.println("Delete Test run result with id="+ trr_id);

//
//        //delete test run result (test case) from selected test run on Test Activities page within your project in EasyQA
//        Integer testresults[]={trr_id};
//        easyQA.deleteTestCasesFromTestRun(token, String.valueOf(test_tun_id), testresults);
//        System.out.println("Delete test run result from test run with id="+ trr_id);

//        //delete test run by id
//        easyQA.deleteTestRun(token, String.valueOf(132));
//        System.out.println("Delete Test Run with id="+ 132);





        //create new status (column) for Agile board on Issues page within your Project
//        Integer status_id = easyQA.createStatus(token, "test");
//        System.out.println("Status is created! id="+status_id);

//        //get the list of statuses
//        Map<String, String> statuses = easyQA.getStatusesList(token);
//        System.out.println("list of statuses:\n"+statuses);
//
////        get full info about the status by its ID
//        JSONObject status = easyQA.getStatus(token, String.valueOf(status_id));
//        Integer st_id = status.getInt("id");
//        System.out.println(st_id);
//        System.out.println(status);

//        //update status with name
//        Map<String, String> st = easyQA.updateStatus(token, String.valueOf(status_id), "testets");
//        String st_id1 = st.get("id");
//        String st_name = st.get("name");
//        System.out.println("Status was updated! status_id="+st_id1+" status_name="+st_name);

//        //delete status by id
//        easyQA.deleteStatus(token, String.valueOf(status_id));
//        System.out.println("Delete Status with id="+ status_id);


        //create new issue on Agile board on Issues page within your Project
//        Integer issue_id = easyQA.createIssue(token, "test11111", , "description", "testtesttest", "issue_type", "task", "priority", "low");
//        System.out.println("Issue is created! id="+issue_id);

        //create new issue with Attachments on Agile board on Issues page within your Project
//        Integer issue_id = easyQA.createIssueWithAttachment(token, "test121212", files);
//        System.out.println("Issue is created! id="+issue_id);

        //create an issue without attachments anonymously for some Test Object on Issues page within your project in EasyQA
//       Integer issue_id = easyQA.createIssueAnonymously(token, "testFromDevice343241", "test", "test", "8.0", test_object_id);
//       System.out.println("Issue is created! id="+issue_id);

        //create an issue with attachments anonymously for some Test Object on Issues page within your project in EasyQA
//       Integer issue_id = easyQA.createIssueAnonymouslyWithAttachments(token, "test2222", "test", "test", "8.0", test_object_id, files);
//       System.out.println("Issue is created! id="+issue_id);

//        //get the list of issues
//        Map<String, String> issues = easyQA.getIssuesList(token);
//        System.out.println("list of issues:\n"+issues);

        //add attachment to the issue by the unique issue ID in EasyQA
//        Integer attachment_id = easyQA.addAttachmentToIssueByUniqueID(token, String.valueOf(issue_id), files);

        //add attachment to the issue by the issue ID in the project in EasyQA
//        attachment_id = easyQA.addAttachmentToIssueByProjectID(token, String.valueOf(1), files);

        //delete the attachment from the issue by the unique attachment ID in EasyQA
//        easyQA.deleteAttachmentByID(token, String.valueOf(attachment_id));

        //get issue info with mobile build as a test object in EasyQA
//        JSONObject result = easyQA.getIssueWithMobileBuild(token, "com.thinkmobiles.android.easyqa", "10", "1.0.1_debug");
//        System.out.println(result);

        //get issue info with site as a test object in EasyQA
//        result = easyQA.getIssueWithSite(token, url);
//        System.out.println(result);

////       get full info about the issue by its unique ID
//        JSONObject issue = easyQA.getIssueByUniqueID(token, String.valueOf(issue_id));
//        Integer st_id = issue.getInt("id");
//        System.out.println(st_id);
//        System.out.println(issue);

//        get full info about the issue by its project ID
//        JSONObject issue1 = easyQA.getIssueByProjectID(token, "1");
//        Integer st_id = issue1.getInt("id");
//        System.out.println(st_id);
//        System.out.println(issue1);

       // update the issue by the unique ID in EasyQA
        Map<String, String> st = easyQA.updateIssueByUniqueID(token, String.valueOf(6259), "summary", "testtesttest");
        String st_id1 = st.get("id");
        String st_name = st.get("summary");
        System.out.println("Issue was updated! issue_id="+st_id1+" Issue summary="+st_name);

        //logout, finish user session, destroy auth_token
//        String message = easyQA.signOut(token);
//        System.out.println("Sign out=" + message);

    }
}
