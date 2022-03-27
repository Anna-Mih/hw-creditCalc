public class CreditPaymentService {
    public double calculate(double creditSum, double creditPeriodYear) {
        double creditRateMonth = 9.99 / 12 / 100;
        double creditPeriodMonth = creditPeriodYear * 12;
        double koefficient = creditRateMonth * Math.pow(1 + creditRateMonth, creditPeriodMonth) / (Math.pow(1 + creditRateMonth, creditPeriodMonth) - 1);
        double payment = creditSum * koefficient;
        return payment;
    }
}
