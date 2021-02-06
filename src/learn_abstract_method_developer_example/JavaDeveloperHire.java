package learn_abstract_method_developer_example;

public class JavaDeveloperHire extends DevelopProject {

    @Override
    public Develop hireDeveloper() {
        return new JavaDeveloper();
    }
}
