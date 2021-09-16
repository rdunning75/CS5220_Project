package runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.*;
import javax.persistence.Persistence;


import com.google.protobuf.Any;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.hibernate.engine.jdbc.internal.DDLFormatterImpl;
import org.hibernate.engine.jdbc.internal.Formatter;

public class Main {

    public static void main(String args[]) {
        // Write the generated schema to a string
        StringWriter stringWriter = new StringWriter();
        Map<String, Object> properties = new HashMap<>();
        properties.put(
                "javax.persistence.schema-generation.scripts.action",
                "create");
        properties.put(
                "javax.persistence.schema-generation.scripts.create-target",
                stringWriter);
        Persistence.generateSchema(
                "hibernate-examples",
                properties);

        // Use Hibernate's SQL formatter to format each statement
        Formatter formatter = new DDLFormatterImpl();
        Scanner reader = new Scanner(stringWriter.toString());
        while (reader.hasNextLine())
            System.out.println(formatter.format(reader.nextLine()));
        reader.close();

        programLoop();

        System.exit(0);
    }

    private static int programLoop() {
        ArrayList<String> mainmenu = new ArrayList<>(Arrays.asList("", "s) List Student", "g) List Groups", "x) Exit"));
        ArrayList<String> studentmenu = new ArrayList<>(Arrays.asList("- Student", "b) Back to Main Menu", "n) New Student", "x) Exit"));
        ArrayList<String> groupmenu = new ArrayList<>(Arrays.asList("- Group", "b) Back to Main Menu", "n) New Group", "x) Exit"));


        boolean check = true;
        int level = 0;
        String value = "";
        while (check) {
            if (level == 0) {
                value = printConsole(mainmenu, 0);
                switch (value.toLowerCase()) {
                    case "s":
                        level = 1;
                        break;
                    case "g":
                        level = 2;
                        break;
                    case "x":
                        check = false;
                        break;
                    default:
                        System.out.println();
                        break;

                }
            } else if (level == 1) {
                value = printConsole(studentmenu, 1);

                switch (value.toLowerCase()) {
                    case "b":
                        level = 0;
                        break;
                    case "n":
                        break;
                    case "x":
                        check = false;
                        break;
                    default:
                        break;

                }
            } else if (level == 2) {
                value = printConsole(groupmenu, 2);

                switch (value.toLowerCase()) {
                    case "b":
                        level = 0;
                        break;
                    case "n":
                        break;
                    case "x":
                        check = false;
                        break;
                    default:
                        break;

                }
            }

        }

        return 0;
    }


    public static String printConsole(ArrayList<String> options, int menuNum) {
        String value = "";
        System.out.print("Dah Cool Skool Managament System " + options.get(0) + "\n");

        switch (menuNum) {
            case 1:
                
            case 2:

            case 3:

            case 4:

        }

        for (String x : options.subList(1, options.size())) {
            System.out.println(x);
        }

        Scanner scan = new Scanner(System.in);

        try {
            value = scan.next();
        } catch (Exception e) {
            System.out.println("That is not a viable option. Please look at menu");
        }


        return value;

    }



}
