package StepsDef;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
//import net.serenitybdd.annotations.Steps;
import Steps.LoginMethod;


public class Login {

    LoginMethod endUser;

    @Given("User logs in to facebook with the username {}")
    public void User_logs_in_to_facebook_with_the_username() throws Exception {

        endUser.User_logs_in_to_facebook_with_the_username();
    }

}