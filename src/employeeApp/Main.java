package employeeApp;

import com.workintech.models.Company;
import com.workintech.models.Employee;
import com.workintech.models.Healthplan;
import com.workintech.models.Plan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan healthplan = new Healthplan(1, "healthPlan1", Plan.PLAN1);
        System.out.println("healthplan-------------------------------");

        System.out.println(healthplan);

        System.out.println("healthplan.getId(): " + healthplan.getId());
        System.out.println("healthplan.getName(): " + healthplan.getName());
        System.out.println("healthplan.getPlan(): " + healthplan.getPlan());

        healthplan.setId(33);
        System.out.println("healthplan.setId(33) called");
        System.out.println("healthplan.getId(): " + healthplan.getId());

        healthplan.setName("changed healthplan name");
        System.out.println("healthplan.setName(\"changed healthplan name\") called");
        System.out.println("healthplan.getName(): " + healthplan.getName());

        healthplan.setPlan(Plan.PLAN3);
        System.out.println("healthplan.setPlan(Plan.PLAN3) called");
        System.out.println("healthplan.getPlan(): " + healthplan.getPlan());

        System.out.println("-------------------------------");

        System.out.println("employee-------------------------------");
        Employee employee = new Employee(11, "employee fullname", "qwerty",
                "email@email.com", new String[4]);

        System.out.println(employee);

        System.out.println("employee.getId(): " + employee.getId());
        System.out.println("employee.getFullName(): " + employee.getFullName());
        System.out.println("employee.getEmail(): " + employee.getEmail());
        System.out.println("employee.getPassword(): " + employee.getPassword());
        System.out.println("Arrays.toString(employee.getHealthplans()): " + Arrays.toString(employee.getHealthplans()));

        employee.setId(999);
        System.out.println("called employee.setId(999)");
        System.out.println("employee.getId(): " + employee.getId());

        employee.setFullName("full name changed");
        System.out.println("called employee.setFullName(\"full name changed\")");
        System.out.println("employee.getFullName(): " + employee.getFullName());

        employee.setEmail("anotheremail@email.com");
        System.out.println("called employee.setEmail(\"anotheremail@email.com\")");
        System.out.println("employee.getEmail(): " + employee.getEmail());

        employee.setPassword("newpassword");
        System.out.println("called employee.setPassword(\"newpassword\")");
        System.out.println("called employee.setPassword(\"newpassword\")");

        employee.setHealthplans(new String[]{"hp1", "hp2", null, null, "hp5"});
        System.out.println("called employee.setHealthplans(new String[]{\"hp1\", \"hp2\", null, null, \"hp5\"})");
        System.out.println("Arrays.toString(employee.getHealthplans()): " + Arrays.toString(employee.getHealthplans()));

        employee.addHealthPlan(3, "hp4");
        System.out.println("called employee.addHealthPlan(3, \"hp4\")");
        System.out.println("Arrays.toString(employee.getHealthplans()): " + Arrays.toString(employee.getHealthplans()));
        System.out.println("calling employee.addHealthPlan(1, \"hp2\")");
        employee.addHealthPlan(1, "hp2");
        System.out.println("calling employee.addHealthPlan(10, \"hp11\")");
        employee.addHealthPlan(10, "hp11");

        System.out.println("-------------------------------");


        System.out.println("company-------------------------------");
        Company company = new Company(11, "company X", 3512323,
                null);

        System.out.println(company);

        System.out.println("company.getId(): " + company.getId());
        System.out.println("company.getName(): " + company.getName());
        System.out.println("company.getGiro(): " + company.getGiro());
        System.out.println("Arrays.toString(company.getDeveloperNames()): " + Arrays.toString(company.getDeveloperNames()));


        company.setId(1111);
        System.out.println("called company.setId(999)");
        System.out.println("company.getId(): " + company.getId());

        company.setGiro(-35);
        System.out.println("called company.setGiro(-35), and expecting it to be set to zero");
        System.out.println("company.getGiro(): " + company.getGiro());

        company.setGiro(1242412123123123123.0);
        System.out.println("called company.setGiro(124241234432143)");
        System.out.println("company.getGiro(): " + company.getGiro());

        company.setName("newCompanyName");
        System.out.println("called company.setName(\"newCompanyName\")");
        System.out.println("company.getName(): " + company.getName());

        company.setDeveloperNames(new String[]{"dev1", "dev2", null, "dev4"});
        System.out.println("called company.setDeveloperNames(new String[]{\"dev1\", \"dev2\", null, \"dev4\"});");
        System.out.println("Arrays.toString(company.getDeveloperNames()): " + Arrays.toString(company.getDeveloperNames()));

        company.addEmployee(1, "anotherDev1");
        company.addEmployee(35, "anotherDev35");
        company.addEmployee(2, "dev1");
        company.addEmployee(2, "dev3");


        System.out.println(company);



        /*

        System.out.println("employee.getId(): " + employee.getId());

        employee.setFullName("full name changed");
        System.out.println("called employee.setFullName(\"full name changed\")");
        System.out.println("employee.getFullName(): " + employee.getFullName());

        employee.setEmail("anotheremail@email.com");
        System.out.println("called employee.setEmail(\"anotheremail@email.com\")");
        System.out.println("employee.getEmail(): " + employee.getEmail());

        employee.setPassword("newpassword");
        System.out.println("called employee.setPassword(\"newpassword\")");
        System.out.println("called employee.setPassword(\"newpassword\")");

        employee.setHealthplans(new String[]{"hp1", "hp2", null, null, "hp5"});
        System.out.println("called employee.setHealthplans(new String[]{\"hp1\", \"hp2\", null, null, \"hp5\"})");
        System.out.println("Arrays.toString(employee.getHealthplans()): " + Arrays.toString(employee.getHealthplans()));

        employee.addHealthPlan(3, "hp4");
        System.out.println("called employee.addHealthPlan(3, \"hp4\")");
        System.out.println("Arrays.toString(employee.getHealthplans()): " + Arrays.toString(employee.getHealthplans()));
        System.out.println("calling employee.addHealthPlan(1, \"hp2\")");
        employee.addHealthPlan(1, "hp2");
        System.out.println("calling employee.addHealthPlan(10, \"hp11\")");
        employee.addHealthPlan(10, "hp11");*/

        System.out.println("-------------------------------");

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
