import { Component } from '@angular/core';
// import { FormGroup, FormBuilder, Validators } from '@angular/forms';
// import { of } from 'rxjs';
import { Customer } from '../../types/Customer';

@Component({
  selector: 'app-customerarray',
  // standalone: true,
  // imports: [],
  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})
export class CustomerarrayComponent {
  customers: Customer[]=[
  new Customer("John Doe", "john@example.com", "john_doe", "password123", "User", "1"),
  new Customer("John Doe1", "john1@example.com", "john_doe1", "password123", "Admin", "2")
  ];
  
  
 
}
