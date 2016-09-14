package com.finall;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable
public class RegistrationClass {

@PrimaryKey
@Persistent
private String Name;


public String getName() {
return Name;
}
public void setName(String Name) {
this.Name = Name;
}

@Persistent
private String Email;


public String getEmail() {
return Email;
}
public void setEmail(String Email) {
this.Email = Email;
}

@Persistent
private String Password;


public String getPassword() {
return Password;
}
public void setPassword(String Password) {
this.Password = Password;
}
}
