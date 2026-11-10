import java.util.ArrayList;
import java.util.List;

public class ComputerRepositoryImple implements ComputerRepository {
    private List<Computer> computers;

    ComputerRepositoryImple(List<Computer> computers) {
        this.computers = computers;
    }

    public List<Computer> computers() {
        return computers;
    }

    //Метод который будет находить все компьютеры в которых есть четное количество букв а в первый и во второй половине его названия
    @Override
    public List<Computer> findFirstLastPart() {
        List<Computer> result = new ArrayList<>();
        for (int i = 0; i < computers.size(); i++) {
            String emptyF = "";
            String emptyL = "";
            if (computers.get(i).getName().length() % 2 == 0) {
                String firsPart = computers.get(i).getName().substring(0, computers.get(i).getName().length() / 2);
                String lastPart = computers.get(i).getName().substring(computers.get(i).getName().length() / 2);
                for (int j = 0; j < firsPart.length(); j++) {
                    if (firsPart.charAt(j) == 'a') {
                        emptyF = emptyF + firsPart.charAt(j);
                    }
                }
                for (int j = 0; j < lastPart.length(); j++) {
                    if (lastPart.charAt(j) == 'a') {
                        emptyL = emptyL + lastPart.charAt(j);
                    }
                }
                computers.get(i).setName(emptyF);
                computers.get(i).setName(emptyL);
                result.add(computers.get(i));
            }

        }
        return result;
    }

    //Метод который будет находить общую сумму всех компьютеров с чётной ценой который заканчивается на ноль
    @Override
    public int findTotolPriceLastZero() {
        int total = 0;
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getPrice() % 2 == 0) {
                String price = computers.get(i).getPrice() + "";
                String last = price.substring(price.length() - 1);
                if (last.equals("0")) {
                    total = total + last.length();
                }
            }
        }
        return total;
    }
//    Метод который будет находить все компьютеры БУ и делать их новыми если цена будет больше 1000

    @Override
    public List<Computer> findBuNewMore1000() {
        List<Computer> result = new ArrayList<>();
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getPrice() > 1000) {
                if (computers.get(i).getBu() == true) {
                    computers.get(i).setBu(false);
                    result.add(computers.get(i));
                }
            }
        }
        return result;
    }

}
