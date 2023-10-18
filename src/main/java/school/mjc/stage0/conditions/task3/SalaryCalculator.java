package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float salar = salary;
        if (salary < 0) {
            System.out.println("wrong input");
        }
        if (salary > 0 && salary <= 10000) {
            System.out.println(salar * 15 / 100);
        }
        if (salary > 10000 && salary <= 20000) {
            System.out.println(salar * 18 / 100);
        }
        if (salary > 20000) {
            System.out.println(salar * 20 / 100);
        }

    }
}
