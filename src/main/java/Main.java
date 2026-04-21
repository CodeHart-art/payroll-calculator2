import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the file employee file to process: ");
        String rawFile = scanner.nextLine();
        String rawPath = "src/main/resources/" + rawFile;

        System.out.print("Enter the name of the payroll file to create: ");
        String processedFile = scanner.nextLine();
        String processedPath = "src/main/resources/" + processedFile;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rawPath));
             FileWriter fileWriter = new FileWriter(processedPath)) {

            fileWriter.write("id|name|gross pay\n");


            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {

                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hours = Double.parseDouble(parts[2]);
                double wage = Double.parseDouble(parts[3]);


                Employees employees = new Employees(id, name, hours, wage);


                fileWriter.write(employees.getId() + "|" + employees.getName() + "|" + employees.grossPay()+ "\n") ;

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
