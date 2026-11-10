import java.util.ArrayList;
import java.util.List;

public class PhoneRepositoryImple implements PhoneRepository {
    private List<Phone> phones;

    PhoneRepositoryImple(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Phone> phones() {
        return phones;
    }
//    Щас метод который будет находить среднее значение всех цен телефонов и возвращайтесь из него

    @Override
    public int avg() {
        int total=0;
        for (int i = 0; i <phones.size() ; i++) {
            total = total + phones.get(i).getPrice();
        }

        return total / phones.size();
    }
//    Создать метод который будет удалять из второй половины моделей телефона букву а и б если цена телефона будет больше 100

    @Override
    public List<Phone> DeleteLastPartModel() {
        List<Phone> result = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            String empty = "";
            if (phones.get(i).getPrice() > 100) {
                String LastPart = phones.get(i).getModel().substring(phones.get(i).getModel().length() / 2);
                for (int j = 0; j < LastPart.length(); j++) {
                    if (LastPart.charAt(j) != 'a' && LastPart.charAt(j) != 'b') {
                        empty = empty + LastPart.charAt(j);
                    }
                }
                phones.get(i).setModel(empty);
                result.add(phones.get(i));
            }
        }
        return result;
    }

    //    Создать метод который будет находить самый дорогой телефон переворачивать
    //    цену задом наперёд при условии что в цене из два нуля
    @Override
    public Phone FindMaxPhoneReverse() {

        Phone maxPrice = null;
        int max = 0;
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() > max) {
                max = phones.get(i).getPrice();
                maxPrice = phones.get(i);
            }
        }
        String empty = "";
        String price = maxPrice.getPrice() + "";
        for (int j = price.length() - 1; j >= 0; j--) {
            if (price.endsWith("00")) {
                empty = empty + price.charAt(j);
            }
        }
        maxPrice.setPrice(Integer.parseInt(empty));
        return maxPrice;
    }
//    Создать метод который будет находить все телефоны БУ и делать их новыми и возвращать из метода

    @Override
    public List<Phone> findPhonesBu() {
        List<Phone> result = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getBu() == true) {
                phones.get(i).setBu(false);
                result.add(phones.get(i));
            }
        }
        return result;
    }

    //    Создать метод который будет находить все БУ телефона находить их общую
//    сумму и присвоить эту общую сумму самым дорогому телефону и вернуть этот самый дорогой телефон из метода
    @Override
    public Phone findBUPhoneTotalMax() {
        Phone maxPhone = null;
        int total = 0;
        int max = 0;
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() > max) {
                max = phones.get(i).getPrice();
                maxPhone = phones.get(i);
            }
        }

        for (int i = 0; i <phones.size() ; i++) {
            if (phones.get(i).getBu() == true){
                total = total + phones.get(i).getPrice();
            }
        }
        maxPhone.setPrice(total);
        return maxPhone;
    }
}