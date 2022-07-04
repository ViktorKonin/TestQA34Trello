package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BordCreation extends TestBase {


    @Test
    public void boardCreation1(){

        int boardCountBeforeCreation = app.getBoard().getBoardCount();

        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().fillboardCreationForm("testQa34");
        app.getBoard().scrollDownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        app.getBoard().returnToHomePage();

        int boardCountAfterCration = app.getBoard().getBoardCount();
        Assert.assertEquals(boardCountBeforeCreation,boardCountAfterCration+1);

    }
}
