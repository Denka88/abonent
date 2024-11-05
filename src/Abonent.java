public class Abonent {

    private String id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int callTime;
    private String creditCard;
    private int debt;

    public Abonent(String surname, String name, String patronymic, String address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    public Abonent(String id, String surname, String name, String patronymic, String address, int callTime, String creditCard, int debt) {
        this(surname, name, patronymic, address);
        this.id = id;
        this.callTime = callTime;
        this.creditCard = creditCard;
        this.debt = debt;
    }

    public Abonent() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCallTime() {
        return callTime;
    }

    public void setCallTime(int callTime) {
        this.callTime = callTime;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Абонент{" +
                "id = '" + id + '\'' +
                ", Фамилия = '" + surname + '\'' +
                ", Имя = '" + name + '\'' +
                ", Отчество = '" + patronymic + '\'' +
                ", Адресс = '" + address + '\'' +
                ", Время разговора = '" + callTime + '\'' +
                ", Номер кредитки = '" + creditCard + '\'' +
                ", Задолженность = '" + debt + '\'' +
                '}';
    }
}