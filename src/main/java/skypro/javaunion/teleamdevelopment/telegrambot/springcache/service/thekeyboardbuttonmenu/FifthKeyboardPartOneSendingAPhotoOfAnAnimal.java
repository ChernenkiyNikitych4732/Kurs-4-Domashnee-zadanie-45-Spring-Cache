package skypro.javaunion.teleamdevelopment.telegrambot.springcache.service.thekeyboardbuttonmenu;

import skypro.javaunion.teleamdevelopment.telegrambot.springcache.theenumconstants.Animals;

import java.util.ArrayList;
import java.util.List;

public class FifthKeyboardPartOneSendingAPhotoOfAnAnimal {
    public static List<String> getList(Animals enumAnimals) {
        List<String> list = new ArrayList<>();
        list.add("Нажмите кнопку, подтверждения загрузки фото !");
        list.add("/upload photo" + enumAnimals.getTitle());
        return list;
    }
}