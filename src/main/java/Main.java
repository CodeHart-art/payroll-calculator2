import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\john1\\pluralsight\\workbook-3\\payroll-calculator\\src\\main\\resources\\employees.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){

                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hours = Double.parseDouble(parts[2]);
                double wage =Double.parseDouble(parts[3]);


                Employees employees = new Employees(id,name,hours,wage);

                System.out.println(employees.getId());
                System.out.println(employees.getName());
                System.out.println(employees.grossPay());


            }


        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
