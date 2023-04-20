package creational_design_patterns.factory_method_developer;

public abstract class DevelopProject {

    public abstract Develop hireDeveloper();

    public void startWork() {

        Develop developer = hireDeveloper();

        developer.analiseTask();

        developer.codeTask();

        developer.refactorTask();

        developer.testTask();
    }
}
