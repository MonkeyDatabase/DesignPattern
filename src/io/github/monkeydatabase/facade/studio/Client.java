package io.github.monkeydatabase.facade.studio;

public class Client {
    public static void main(String[] args) {
        StudioFacade studioFacade=new StudioFacade();
        studioFacade.ready();
        studioFacade.play();
        System.out.println("---------------------------------");
        for (int i=0;i<10;i++){
            System.out.println("playing");
            if (i==5){
                System.out.println("There is a call, i have to answer");
                studioFacade.pause();
                System.out.println("ok, i am coming");
                studioFacade.play();
            }
        }
        System.out.println("---------------------------------");
        studioFacade.end();
    }
}
