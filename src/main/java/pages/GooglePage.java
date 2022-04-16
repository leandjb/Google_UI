package pages;

public class GooglePage extends BasePage{

    private String searchButton = "(//input[@class='RNmpXc'])[2]";
    private String searchTextField = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com/");
    }

    public void clickGoogleSearch(){

        enterElement(searchTextField);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);

    }
}
