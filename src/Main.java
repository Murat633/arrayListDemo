import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println(sayilar.size());
        sayilar.set(0,"Ahmet");

        sayilar.remove(sayilar.indexOf("Ahmet"));
        // sayilar.clear();
        for(Object i:sayilar){
            System.out.println(i);
        }

    }
}