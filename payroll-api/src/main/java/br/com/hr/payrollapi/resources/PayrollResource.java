package br.com.hr.payrollapi.resources;

import br.com.hr.payrollapi.domain.Payroll;
import br.com.hr.payrollapi.domain.User;
import br.com.hr.payrollapi.feignClients.UserFeign;
import br.com.hr.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    //private final UserFeign userFeign;
    private final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {

        //User user = userFeign.findById(workerId).getBody();

        return ResponseEntity.ok().body(
                service.getPayment(workerId, payment)
                /*new Payroll(
                        user.getName(), //da erro pq pode vir nulo
                        payment.getDescription(),
                        user.getHourlyPrice(),
                        payment.getWorkedHours(),
                        user.getHourlyPrice() * payment.getWorkedHours())*/
        );
    }
}
