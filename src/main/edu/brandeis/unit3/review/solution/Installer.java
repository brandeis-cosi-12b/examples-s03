package edu.brandeis.unit3.review.solution;

public class Installer {
    public static void main(String[] args) {
        App gmail = new App("gmail", 10);
        App minecraft = new App("minecraft", 90);
        App maps = new App("maps", 20);

        SmartPhone phone1 = new SmartPhone("Zelda");
        SmartPhone phone2 = new SmartPhone("Link");

        // install here should be static - it is not related to a specific
        // instance of Installer
        install(gmail, phone1);
        install(maps, phone1);
        install(minecraft, phone2);
        install(maps, phone2);
        install(minecraft, phone1);
    }

    public static void install(App app, SmartPhone phone) {
        if(phone.install(app)) {
            System.out.println("Successfully installed " + app + " on " + phone);
        } else {
            System.out.println("Installation of " + app + " on " + phone + " failed.");
        }
    }
}
