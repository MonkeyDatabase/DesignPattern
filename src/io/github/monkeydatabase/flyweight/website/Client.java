package io.github.monkeydatabase.flyweight.website;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        String[] types=new String[3];
        Random random=new Random();
        types[0]="Blog";
        types[1]="CustomPlatform";
        types[2]="News";

//        for (int i=0;i<10;i++){
//            websiteFactory.getWebsite(types[random.nextInt(3)]).use(new User(i));
//            System.out.println("当前Website池大小为"+websiteFactory.getPoolSize());
//        }

        for (int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    User user=new User(random.nextInt(10));
                    websiteFactory.getWebsite(types[random.nextInt(3)]).use(user);
                    System.out.println("当前用户id为"+user.getUserId()+" 当前Website池大小为"+websiteFactory.getPoolSize());
                }
            }).start();
        }
    }
}
