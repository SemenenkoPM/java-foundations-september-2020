package ru.itsjava.proxy;


import lombok.AllArgsConstructor;
import ru.itsjava.exceptions.IncorrectUserNameException;
@AllArgsConstructor
public class User {

    private String name;


    public void setName(String name) throws IncorrectUserNameException
    {
        if (name.trim().equals("")) {
            throw new IncorrectUserNameException();
        }
        this.name = name;
    }
}
