package ru.itsjava.proxy1;

public class ProxyStudent extends Student{

    public ProxyStudent(String fio) {
        super(fio);
    }

    @Override
    public String getFio()  {
        try {
            return super.getFio();
        } catch (NoSuchFieldException e) {
            System.out.println("Нет ФИО");
            return "";
        }

    }
}
