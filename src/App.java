import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        InputOutputHandler handlerIO = new InputOutputHandler();
        ArrayList<Person> personsList = new ArrayList<Person>();
        Integer numberOfPerson;

        handlerIO.showMessage("Какое количество персон будете описывать?");
        numberOfPerson = handlerIO.getInteger();
        for(int i=0; i<numberOfPerson;i++){
            Person person = new Person();
            
            handlerIO.showMessage("Введите имя: ");
            //String inputText=handlerIO.getString();
            person.setName(handlerIO.getString());
            personsList.add(person);
        }

        handlerIO.writeListInFile(personsList);
        
        personsList = handlerIO.readFile();
        
        for(Person item: personsList){
            handlerIO.showMessageLn(item.getName());
        }
    }
}
