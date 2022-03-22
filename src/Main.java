public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double creditSum = 1_000_000;

        double creditPeriodYear1 = 1;
        double payment = service.calculate(creditSum, creditPeriodYear1);
        System.out.println(payment);

        double creditPeriodYear2 = 2;
        payment = service.calculate(creditSum, creditPeriodYear2);
        System.out.println(payment);

        double creditPeriodYear3 = 3;
        payment = service.calculate(creditSum, creditPeriodYear3);
        System.out.println(payment);
    }
}
