// package com.wecp.progressive.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.repository.CustomerRepository;

// @Service
// public class CustomerServiceImplJpa implements CustomerService{

//     @Autowired
//     private CustomerRepository customerRepository;


//     @Override
//     public List<Customers> getAllCustomers(){
//         // TODO Auto-generated method stub
//         return customerRepository.findAll();
       
//     }

//     @Override
//     public Customers getCustomerById(int customerId){
//         // TODO Auto-generated method stub
//         return customerRepository.findById(customerId).orElse(null);
        
//     }

//     @Override
//     public int addCustomer(Customers customers){
//         // TODO Auto-generated method stub
//         customerRepository.save(customers);
//         return customers.getCustomerId();
//     }

//     @Override
//     public void updateCustomer(Customers customers) {
//         // TODO Auto-generated method stub
//         Customers c = customerRepository.findById(customers.getCustomerId()).orElse(null);
//         if(c != null){
//             c.setEmail(customers.getEmail());
//             c.setName(customers.getName());
//             c.setPassword(customers.getPassword());
//             c.setRole(customers.getRole());
//             c.setUsername(customers.getUsername());
//             c.setAccounts(customers.getAccounts());
//             customerRepository.save(c);
//         }
//     }

//     @Override
//     public void deleteCustomer(int customerId){
//         // TODO Auto-generated method stub
//         if(customerRepository.findById(customerId) != null){
//             customerRepository.deleteById(customerId);
//         }
        
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByName() {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public List<Customers> getAllCustomersFromArrayList() {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public List<Customers> addCustomersToArrayList(Customers customers) {
//         // TODO Auto-generated method stub
//         return null;
        
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByNameFromArrayList() {
//         // TODO Auto-generated method stub
//         return null;
        
//     }

//     @Override
//     public void emptyArrayList() {
//         // TODO Auto-generated method stub
        
//     }
    
// }