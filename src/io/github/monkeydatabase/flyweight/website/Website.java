package io.github.monkeydatabase.flyweight.website;

public abstract class Website {
    public String websitetype;

    public Website(String websitetype) {
        this.websitetype = websitetype;
    }

    public String getWebsitetype() {
        return websitetype;
    }

    public void setWebsitetype(String websitetype) {
        this.websitetype = websitetype;
    }

    public abstract void use(User user);
}
