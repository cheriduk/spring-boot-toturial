package com.duke.tutorial.designpatterns.decorator;

public abstract class Decorator extends Component{
    protected Component component ;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void cost(){
        this.component.cost();
    }
}
