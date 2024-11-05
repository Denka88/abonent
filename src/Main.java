public class Main {
    public static void main(String[] args) {

        Abonent[] abonents = new Abonent[4];

        abonents[0] = new Abonent( "1", "Иванов", "Владимир", "Дмитриевич", "Москва", 120, "8388 3123 4434 5254", 150);
        abonents[1] = new Abonent( "2", "Деревянко", "Петр", "Степанович", "Кемерово", 60, "5155 1234 5341 7867", 0);
        abonents[2] = new Abonent( "3", "Сосисонов", "Олег", "Пуджаевич", "Саратов", 150, "3834 1556 6543 1467", 250);
        abonents[3] = new Abonent( "4", "Апельсинов", "Семен", "Вячеславович", "Краснодар", 100, "7377 9877 4324 8988", 57);

        int maxCallTime = 100;

        for (int i = 0; i < abonents.length; i++) {
            if(abonents[i].getCallTime() > maxCallTime) {
                System.out.println(abonents[i].toString() + " Абонент превышает максимальное время разговора");
            }
        }
    }
}