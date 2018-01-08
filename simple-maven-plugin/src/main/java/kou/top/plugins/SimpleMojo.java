package kou.top.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "simple-mojo")
public class SimpleMojo extends AbstractMojo {

    @Parameter(property = "greeting.message", defaultValue = "null")
    private String message;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(String.format("-- Plugin From @kou.top.simple-maven-plugin @simple-mojo [%s]", message));
    }
}
