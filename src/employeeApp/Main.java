package employeeApp;

import com.workintech.models.Healthplan;
import com.workintech.models.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{
    static Healthplan healthplan = new Healthplan(1, "healthPlan1", Plan.PLAN1);

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
