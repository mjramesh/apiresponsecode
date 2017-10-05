package io.apiresponsecode;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class responsecodeApplication extends Application<responsecodeConfiguration> {

    public static void main(final String[] args) throws Exception {
        new responsecodeApplication().run(args);
    }

    @Override
    public String getName() {
        return "responsecode";
    }

    @Override
    public void initialize(final Bootstrap<responsecodeConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final responsecodeConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
