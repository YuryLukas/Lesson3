
class Person {
    private String name;
    private String surname;

    Person(){

    }

    Person(String name){
        this.name = name;
    }

    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }
}