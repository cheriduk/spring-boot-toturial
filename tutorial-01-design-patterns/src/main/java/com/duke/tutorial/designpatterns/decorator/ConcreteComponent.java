package com.duke.tutorial.designpatterns.decorator;

/**
 * @author Cheri_Du
 */
public class ConcreteComponent extends Component{
    @Override
    public void cost(){
        System.out.println("普通的功能");
    }
}
