package day_57_exceptions.webelement;

import java.util.ArrayList;

public class RunnerApple {
    public static void main(String[] args) {

        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement>elements = new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());

        for (WebElement each : elements){
            System.out.println(each.getText());

            if (each instanceof Form){
                ((Form)each).submit();
            }
        }
/*

without instanceof part you would be trying to cast all the obje to Form, but does object dont have is a relation to Form

        (Form) link object
        (Form) image object
        (Form) input object
 */


    }
}
