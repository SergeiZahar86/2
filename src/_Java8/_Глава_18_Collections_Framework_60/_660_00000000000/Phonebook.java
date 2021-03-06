package _Java8._Глава_18_Collections_Framework_60._660_00000000000;

/* A simple telephone number database that uses
   a property list. Простая база данных телефонных номеров,
построенная на основе списков свойств */
import java.io.*;
import java.util.*;
class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false; // changed - изменено
        // Try to open phonebook.dat file.
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // ignore missing file. игнорировать отсутствующий файл
        }

    /* If phonebook file already exists,
       load existing telephone numbers.   Если телефонная книга уже существует,
       загрузить существующие телефонные номера . */
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
        // Let user enter new names and numbers.   разрешить пользователю вводить новые
        // имена и номера телефонов абонентов
        do {
            System.out.println("Enter new name" + " ('quit' to stop): "); // quit - оставлять
            name = br.readLine();
            if (name.equals("quit"))
                continue;
            System.out.println("Enter number: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("quit"));
        // If phone book data has changed, save it.   сохранить телефонную книгу, если
        // она изменилась
        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Telephone Book");
            fout.close();
        }
        // Look up numbers given a name. искать номер по имени абонента
        do {
            System.out.println("Enter name to find" + " ('quit' to quit): ");
            name = br.readLine();
            if (name.equals("quit"))
                continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("quit"));
    }
}
