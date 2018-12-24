package com.zhkui.ulex.core;


public class ApplicationConfig extends AbstractConfig{
    private static final long serialVersionUID = 2234979234734503453L;
    private String name;
    private String group;
    private String version;
    private String organization;
    private String env;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return String return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return String return the organization
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * @return String return the env
     */
    public String getEnv() {
        return env;
    }

    /**
     * @param env the env to set
     */
    public void setEnv(String env) {
        this.env = env;
    }

}