package com.stackroute.commonjavaclasses;
import com.stackroute.commonjavaclasses.BankDeposit;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class BankDeposit {
    public String getMaturityDate(String Date, Period duration) {
        if (Date == null || duration == null) {
            return "";
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsed_Date = LocalDate.parse(Date, formatter);
        LocalDate maturity_Date = parsed_Date.plus(duration);

        return maturity_Date.format(formatter);
    }

    public String getInvestmentDuration(String Date, String maturity_Date) {
        if (Date == null || maturity_Date == null) {
            return "";
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(Date, formatter);
        LocalDate endDate = LocalDate.parse(maturity_Date, formatter);
        Period duration = Period.between(startDate, endDate);

        return duration.getYears() + " years, " + duration.getMonths() + " months, " + duration.getDays() + " days";
    }
}