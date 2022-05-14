package day_57_exceptions.webelement;

public class Link implements WebElement {

    @Override
    public void click() {
        System.out.println("Clicking Link");
    }

    @Override
    public String getText() {return "Link Text";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Sending txt to link");
        System.out.println(txt);
    }
}
