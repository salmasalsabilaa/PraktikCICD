package stepsdefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Steps.Dashboard;
import net.thucydides.core.annotations.Steps;

public class stepsdefinition {
    @Steps
    Dashboard steps;
    @Given("I am on the login page")
    public void OnTheLoginPage() { steps.onTheLoginPage();
    }

    @When("I enter my username and password correctly")
    public void enterMyUsernameAndPasswordCorrectly() { steps.enterUserAndPassword();
    }

    @And("I click login button")
    public void ClickLoginButton() { steps.clickLoginButton();
    }

    @Then("I am on the home page")
    public void onTheHomePage() { steps.onTheHomePage();
    }

    @When("I click to my profile icon")
    public void clickToMyProfileIcon() { steps.clickProfileIcon();
    }

    @And("I click view profile button")
    public void clickViewProfileButton() { steps.clickProfileIcon();
    }

    @Then("I am on the profile page")
    public void OnTheProfilePage() { steps.OnTheProfilePage();
    }

    @When("I click to notification icon")
    public void ClickToNotificationIcon() { steps.ClickToNotificationIcon();
    }

    @Then("I am on the notification page")
    public void OnTheNotificationPage() { steps.OnTheNotificationPage();
    }

    @When("I click to messaging icon")
    public void ClickToMessagingIcon() {steps.ClickToMessagingIcon();
    }

    @Then("I am on the messaging page")
    public void OnTheMessagingPage() {steps.OnTheMessagingPage();
    }

    @When("I click to jobs icon")
    public void ClickToJobsIcon() {steps.ClickToJobsIcon();
    }

    @Then("I am on the jobs page")
    public void OnTheJobspage() { steps.OnTheJobsPage();
    }

    @When("I click to my network icon")
    public void ClickToMyNetworkIcon() { steps.ClickToMyNetworkIcon();
    }

    @Then("I am on the my network page")
    public void OnTheMyNetworkPage() { steps.OnTheMyNetworkPage();
    }

    @When("I click to start a post field")
    public void ClickToStartAPostField() { steps.ClickToStartAPostField();
    }

    @And("I write text on post field")
    public void WriteTextOnPostField() { steps.WriteTextOnPostField();
    }

    @And("I click post button")
    public void ClickPostButton() { steps.ClickPostButton();
    }

    @Then("I have start posting")
    public void HaveStartPosting() { steps.HaveStartPosting();
    }

    @When("I click to connection menu")
    public void ClickToConnectionMenu() { steps.ClickToConnectionMenu();
    }

    @Then("I am on the connection page")
    public void OnTheConnectionPage() { steps.OnTheConnectionPage();
    }

    @When("I click to my item menu")
    public void ClickToMyItemMenu() { steps.ClickToMyItemMenu();
    }

    @Then("I am on the my item page")
    public void OnTheMyItemPage() { steps.OnTheMyItemPage();
    }

    @When("I click to group menu")
    public void ClickToGroupMenu() { steps.ClickToGroupMenu();
    }

    @Then("I am on the group page")
    public void OnTheGroupPage() { steps.OnTheGroupPage();
    }

    @When("I click to event menu")
    public void ClickToEventMenu() { steps.ClickToEventMenu();
    }

    @And("I click on plus icon")
    public void ClickOnPlusIcon() { steps.ClickOnPlusIcon();
    }

    @And("I fill form on add event form")
    public void FillFormOnAddEventForm() { steps.FillFormOnAddEventForm();
    }

    @And("I click Next")
    public void ClickNext() { steps.ClickNext();
    }

    @And("I click done")
    public void ClickDone() { steps.ClickDone();
    }

    @Then("I am success to add new event")
    public void SuccessToAddNewEvent() { steps.SuccessToAddNewEvent();
    }

    @When("I click to short by dropdown")
    public void ClickToShortByDropdown() { steps.ClickToShortByDropdown();
    }

    @And("I choose recent")
    public void ChooseRecent() { steps.ChooseRecent();
    }

    @Then("I am success short feeds by recent")
    public void SuccessShortFeedsByRecent() { steps.SuccessShortFeedsByRecent();
    }

    @And("I choose top")
    public void ChooseTop() { steps.ChooseTop();
    }

    @Then("I am success short feeds by top")
    public void SuccessShortFeedsByTop() { steps.SuccessShortFeedsByTop();
    }

    @When("I choose a post")
    public void ChooseAPost() { steps.ChooseAPost();
    }

    @And("I click like icon")
    public void ClickLikeIcon() { steps.ClickLikeIcon();
    }

    @Then("I am success to like a post")
    public void SuccessToLikeAPost() { steps.SuccessToLikeAPost();
    }

    @And("I click comment icon")
    public void ClickCommentIcon() { steps.ClickCommentIcon();
    }

    @And("I write a comment")
    public void WriteAComment() { steps.WriteAComment();
    }

    @And("I press enter")
    public void PressEnter() { steps.PressEnter();
    }

    @Then("I am success to comment on a post")
    public void SuccessToCommentOnAPost() { steps.SuccessToCommentOnAPost();
    }

    @And("I click repost icon")
    public void ClickRepostIcon() { steps.ClickRepostIcon();
    }

    @Then("I am success to repost a post")
    public void SuccessToRepostAPost() { steps.SuccessToRepostAPost();
    }

    @When("I click to profile icon")
    public void ClickToProfileIcon() { steps.ClickProfileIcon();
    }

    @And("I click settings & privacy menu")
    public void ClickSettingsPrivacyMenu() { steps.ClickSettingsPrivacyMenu();
    }

    @Then("I am on the settings & privacy page")
    public void OnTheSettingsPrivacyPage() { steps.OnTheSettingsPrivacyPage();
    }

    @And("I click help menu")
    public void ClickHelpMenu() { steps.ClickHelpMenu();
    }

    @Then("Help box opened")
    public void helpBoxOpened() { steps.helpBoxOpened();
    }

    @And("I click language menu")
    public void ClickLanguageMenu() { steps.ClickLanguageMenu();
    }

    @Then("I am on the language page")
    public void OnTheLanguagePage() { steps.OnTheLanguagePage();
    }
}
