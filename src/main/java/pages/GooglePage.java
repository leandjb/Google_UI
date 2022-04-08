package pages;

public class GooglePage extends BasePage{

    private String searchButton = "(//input[@name='btnK'])[2]";
    private String searchTextField = "";

//todo resolver conexion con webdriver

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com/");
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);

    }
}
