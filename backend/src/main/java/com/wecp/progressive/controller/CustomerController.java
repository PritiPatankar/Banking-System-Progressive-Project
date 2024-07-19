package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException{
        return new ResponseEntity<List<Customers>>(customerService.getAllCustomers(), HttpStatus.OK);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable Integer customerId) throws SQLException{
        return new ResponseEntity<Customers>(customerService.getCustomerById(customerId),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) throws SQLException{
        return new ResponseEntity<Integer>(customerService.addCustomer(customers),HttpStatus.OK);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Void> updateCustomer(@PathVariable Integer customerId,@RequestBody Customers customers) throws SQLException{
        customerService.updateCustomer(customers);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Integer customerId) throws SQLException{
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    // @GetMapping("/{customerId}")
    // public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(Integer cutomerId) throws SQLException{
    //     return null;
    // }
}
