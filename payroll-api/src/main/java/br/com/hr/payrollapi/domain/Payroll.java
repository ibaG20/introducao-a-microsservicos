package br.com.hr.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Payroll {

    private String workerName; //vem da api de user
    private String description;
    private Double hourlyPrice; //vem da api de user
    private Double workedHours;
    private Double totalPayment;
}
