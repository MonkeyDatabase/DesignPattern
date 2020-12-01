package io.github.monkeydatabase.flyweight.website;

import java.util.HashMap;

public class WebsiteFactory {
    HashMap<String,Website> pool=new HashMap<>();

    public WebsiteFactory() {
    }

    public Website getWebsite(String type){
        if (!pool.containsKey(type)){
            synchronized (WebsiteFactory.class){
                if (!pool.containsKey(type)){
                    pool.put(type,new ConcreteWebsite(type));
                }
            }
        }
        return pool.get(type);
    }

    public int getPoolSize(){
        return pool.size();
    }
}
