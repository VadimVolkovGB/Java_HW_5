public class Java_5_HW {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("123", "Иван");
        phoneBook.add("567", "Вадим");
        phoneBook.add("145", "Дмитрий");
        phoneBook.add("345", "Виктория");
        phoneBook.add("678", "Алексадра");
        phoneBook.add("890", "Вадим");
        phoneBook.add("789", "Иван");
        phoneBook.add("871", "Пётр");
        phoneBook.add("743", "Александра");
        phoneBook.add("609", "Дмитрий");
        System.out.println(phoneBook.getPhoneNum("789"));
        System.out.println(phoneBook.getByName("Иван"));
        System.out.println(phoneBook.getAll());
    }
}