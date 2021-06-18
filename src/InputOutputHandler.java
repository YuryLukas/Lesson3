import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.nio.file.*;

class InputOutputHandler  {

    private Scanner keyboardScanner = new Scanner(System.in);
    String fileName ="data.txt";
    Path path = Paths.get("data.txt");
    Scanner fileScanner;
    FileWriter writer;

    InputOutputHandler() { 
        
    }

    public void showMessage(String message) {
        System.out.print(message);
    }

    public void showMessageLn(String message) {
        System.out.println(message);
    }
    
    public String getString() {
        return keyboardScanner.next();
    }

    public int getInteger() {
        try{
            return keyboardScanner.nextInt();
        }
        catch(Exception e)
        {
            return 0;
        }
    }
    
    public void showRepeatedString(String sample, int counter) {
        String tmp="";
        for(int i=0; i < counter; i++){
            tmp += sample;
        }
        System.out.println(tmp);
    }

    public ArrayList<Person> readFile() {
        ArrayList<Person> persons = new ArrayList<Person>();

        try {
            fileScanner = new Scanner(Paths.get(fileName));

            while(fileScanner.hasNext()){
                Person person = new Person(fileScanner.next());
                persons.add(person);
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения файла!");
        }

        fileScanner.close();
        return persons;
    }

    public void writeListInFile(ArrayList<Person> persons) {
        
        try {
            writer = new FileWriter(fileName,true);
            for(Person item: persons){
                writer.write(item.getName()+"\n");
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи в файл!");
        }
    }

}