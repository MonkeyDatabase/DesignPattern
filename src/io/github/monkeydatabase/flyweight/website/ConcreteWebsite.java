package io.github.monkeydatabase.flyweight.website;

public class ConcreteWebsite extends Website{
    public ConcreteWebsite(String websitetype) {
        super(websitetype);
    }

    @Override
    public void use(User user) {
        System.out.println("当前网站类型为"+websitetype+" 当前登录用于id为"+user.userId);
    }
}
