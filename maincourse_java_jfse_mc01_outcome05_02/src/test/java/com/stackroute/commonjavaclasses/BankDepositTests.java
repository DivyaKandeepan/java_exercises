package com.stackroute.commonjavaclasses;

import org.junit.jupiter.api.Test;
import java.time.Period;
import static org.junit.jupiter.api.Assertions.*;
public class BankDepositTests {
    private BankDeposit bankDeposit = new BankDeposit();

    @Test
    public void givenInvestmentDateAndDuration_shouldReturnMaturityDate() {
        String investmentDate = "01/01/2022";
        Period duration = Period.ofYears(2);

        String maturityDate = bankDeposit.getMaturityDate(investmentDate, duration);

        assertEquals("01/01/2024", maturityDate);
    }

    @Test
    public void givenInvestmentDateAndMaturityDate_shouldReturnInvestmentDuration() {
        String investmentDate = "01/01/2022";
        String maturityDate = "01/01/2024";

        String investmentDuration = bankDeposit.getInvestmentDuration(investmentDate, maturityDate);

        assertEquals("2 years, 0 months, 0 days", investmentDuration);
    }

    @Test
    public void givenNullInvestmentDateAndDuration_shouldReturnEmptyString() {
        String investmentDate = null;
        Period duration = Period.ofYears(2);

        String maturityDate = bankDeposit.getMaturityDate(investmentDate, duration);

        assertEquals("", maturityDate);
    }

    @Test
    public void givenInvestmentDateAndNullDuration_shouldReturnEmptyString() {
        String investmentDate = "01/01/2022";
        Period duration = null;

        String maturityDate = bankDeposit.getMaturityDate(investmentDate, duration);

        assertEquals("", maturityDate);
    }

    @Test
    public void givenNullInvestmentDateAndMaturityDate_shouldReturnEmptyString() {
        String investmentDate = null;
        String maturityDate = "01/01/2024";

        String investmentDuration = bankDeposit.getInvestmentDuration(investmentDate, maturityDate);

        assertEquals("", investmentDuration);
    }

}