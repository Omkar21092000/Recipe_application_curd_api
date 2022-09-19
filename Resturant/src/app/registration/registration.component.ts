import { Component, OnInit } from '@angular/core';
import { FoodcourtService } from '../foodcourt.service';
import { NgForm } from '@angular/forms';
import { Product } from '../product';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  product=new Product();

  message:any;
  registerForm!:FormGroup;
  
 

  constructor(private service:FoodcourtService ,private _route:Router,private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.registerForm=this.formBuilder.group({
      dishname:['',Validators.required],
      ingredient:['',Validators.required],
      methodofcooking:['',Validators.required],
      serve:['',Validators.required],
      type:['',Validators.required]

    });
  }

  addnewdish(){
    this.service.addnewproduct(this.product).subscribe((data)=>this.message=data)
    // ( 
    //   data=>{
    //     console.log("Data add successfully");
    //     this._route.navigate(['']);
    //   },
    //   error=>console.log("error")
    // )
  }

  gotolist(){
    this._route.navigate(['']);
  }

  

}
