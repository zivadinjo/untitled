package day_57_exceptions.webelement;

public class RunnerGoogle {

    public static void main(String[] args) {

        WebElement link = new Link(); //->created a Link object with WebElement reference

        WebElement input = new Input(); // -> created an Input object with WebElement reference

        WebDriverUtil.clickElement(link);

        WebDriverUtil.clickElement(input);

        WebDriverUtil.clickElement(new Link());

        /*
        String [] -> array stores String objects

        Link [] -> array that stores Link objects
         */

        WebElement[] allElements = new WebElement[4];//-> array that will store objects from classes that implement the WebElement interface [null,null,null,null]

        allElements[0] = link;//[link obj,null,null,null]
        allElements[1] = input;//[link obj,input obj,null,null]
        allElements[2] = new Input();//[link obj,input obj, input obj,null]
        allElements[3] = new Image();//[link obj,input obj,input obj,image obj]

    }

}
