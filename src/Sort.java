import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;

public class Sort implements IDateSorter {

    private List<LocalDate> listWithR = new ArrayList<>();

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        //перебор всех элементов несортированного списка
        for(int i = 0; i< unsortedDates.size(); i++){
            //получаем месяц в виде строки
            String month = unsortedDates.get(i).getMonth().toString();
            //если месяц содержит char "r" то записываем эту дату в listWithR
            //и удаляем его из list unsortedDates(там остаються только даты без "r" )
            if(month.contains("R")){
                listWithR.add(unsortedDates.get(i));
                unsortedDates.remove(i);
                //при удалении элемента уменьшаеться размер list(i перескакивает через элемент)
                i--;
            }
        }

        //сортируем list listWithR по возростанию
        sort(listWithR);

        //сортируем list unsortedDates по убыванию
        sort(unsortedDates);
        reverse(unsortedDates);

        //дописываем в listWithR отсортированый unsortedDates
        listWithR.addAll(unsortedDates);
        return listWithR;
    }
}
