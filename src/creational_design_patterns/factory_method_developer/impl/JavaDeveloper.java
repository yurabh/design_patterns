package creational_design_patterns.factory_method_developer.impl;

import creational_design_patterns.factory_method_developer.Develop;

public class JavaDeveloper implements Develop {

    @Override
    public void analiseTask() {
        System.out.println("Java Developer analise task");
    }

    @Override
    public void codeTask() {
        System.out.println("Java Developer coding task");
    }

    @Override
    public void testTask() {
        System.out.println("Java Developer testing task");
    }

    @Override
    public void refactorTask() {
        System.out.println("Java Developer refactoring task");
    }
}
