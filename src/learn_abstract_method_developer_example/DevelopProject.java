package learn_abstract_method_developer_example;

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
