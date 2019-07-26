package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;


public class Scenario1_Steps extends BaseClass {

AndroidDriver driver;

        //driver.findElementById("org.openintents.shopping:id/layout_choice_bottom").click();



    @Given("^User launched the OI Shopping List app and tapped on Hamburger menu icon on left hand side screen$")
    public void user_launched_the_OI_Shopping_List_app_and_tapped_on_Hamburger_menu_icon_on_left_hand_side_screen() {
        driver.findElementByAccessibilityId("Open navigation drawer").click();
    }

    @When("^Tap on the \"([^\"]*)\" option under the List header$")
    public void tap_on_the_option_under_the_List_header(String arg1) {
        driver.findElementByXPath("/hierarchy/android.widget.Framayout/android.widget.LinearLayout/android.widget.Framayout/android.view.ViewGroup/android.widget.Framayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ListView/android.widget.Rativayout[3]/android.widget.TextView").click();

    }

    @And("^Enter name of new shopping list  name as \"([^\"]*)\"$")
    public void enter_name_of_new_shopping_list_name_as(String arg1) {
        driver.findElementById("org.openintents.shopping:id/edittext").sendKeys("String arg1");
        driver.findElementById("android:id/button1").click();

    }

    @Then("^Add the items to list \"([^\"]*)\" should be added to list and saved$")
    public void add_the_items_to_list_should_be_added_to_list_and_saved(String arg1) {
        driver.findElementById("org.openintents.shopping:id/autocomplete_add_item").sendKeys("String arg1");
        driver.findElementById("org.openintents.shopping:id/button_add_item").click();
        // driver.findElementById("org.openintents.shopping:id/autocomplete_add_item").sendKeys("Fruit");
        // driver.findElementById("org.openintents.shopping:id/button_add_item").click();
        // driver.findElementById("org.openintents.shopping:id/autocomplete_add_item").sendKeys("Dairy");
        // driver.findElementById("org.openintents.shopping:id/button_add_item").click();}
    }

    @Given("^User tapped on taped on Hamburger menu button$")
    public void user_tapped_on_taped_on_Hamburger_menu_button() throws Throwable {

    }

    @And("^Select the \"([^\"]*)\" list under the List header$")
    public void sect_the_list_under_the_List_header(String arg1) throws Throwable {

    }

    @When("^Checked the \"([^\"]*)\" item to delete an item$")
    public void checked_the_item_to_dete_an_item(String arg1) throws Throwable {

    }

    @And("^User tapped on the Clean up list icon on the top menu bar$")
    public void user_tapped_on_the_Clean_up_list_icon_on_the_top_menu_bar() throws Throwable {

    }

    @And ("^Tap on the \"([^\"]*)\" option to delete the first one item$")
    public void tap_on_the_option_to_dete_the_first_one_item(String arg1) throws Throwable {

    }

    @Then("^The item should be deleted from the list$")
    public void the_item_should_be_dted_from_the_list() throws Throwable {


}
}



