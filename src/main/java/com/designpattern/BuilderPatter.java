package com.designpattern;

public class BuilderPatter {
    //creational design pattern
    public static void main(String[] args) {
        User user = User.UserBuilder.builder().name("naresh").surname("kumar").build();
        System.out.println(user.getName());
        System.out.println(user.getSurname());
    }
}

class User{
    private final String name;
    private final String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
    }

    public static class UserBuilder{
        private String name;
        private String surname;

        public UserBuilder(){ }
        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder surname(String surname){
            this.surname = surname;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}