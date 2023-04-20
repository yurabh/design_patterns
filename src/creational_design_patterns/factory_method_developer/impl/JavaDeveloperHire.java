package creational_design_patterns.factory_method_developer.impl;

import creational_design_patterns.factory_method_developer.Develop;
import creational_design_patterns.factory_method_developer.DevelopProject;

public class JavaDeveloperHire extends DevelopProject {

    @Override
    public Develop hireDeveloper() {
        return new JavaDeveloper();
    }
}
