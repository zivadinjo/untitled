package day_57_exceptions.webelement;

import java.util.ArrayList;

public class RunnerApple {
    public static void main(String[] args) {

        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement> elements = new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());

        for (WebElement each : elements) {
            System.out.println(each.getText());

            if (each instanceof Form) {
                ((Form) each).submit();
            }
        }

        System.out.println();

        WebElement logo = new Image();
        logo.click(); // -> click method is accessible by the WebElement interface reference then execution happens on object side

//        logo.extension = ".ping"; WebElement interface does not have accessibility to this String variable

        ((Image)logo).extension = ".ping";
//        ((Image)logo).extension = ".ping"; --> casts the logo (WebElement reference) to a Image reference,than the Image reference has access to the extension variable

        // option 2:

        Image logoAsImage = ((Image)logo);
        logoAsImage.extension = ".png";

    }
}
