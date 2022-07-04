package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @BeforeMethod
    public void preConditions(){
        if(app.getUser().isLogged()){
            app.getUser().logOut();
        }
    }


    @Test
    public  void loginPositive() throws InterruptedException {
        app.getUser().initLogin();
        app.getUser().fillInLoginForm();
        app.getUser().submitLogin();


    }


}
