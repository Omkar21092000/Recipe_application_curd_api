import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FoodcourtService } from '../foodcourt.service';
import { Product } from '../product';

@Component({
  selector: 'app-editmenu',
  templateUrl: './editmenu.component.html',
  styleUrls: ['./editmenu.component.css']
})
export class EditmenuComponent implements OnInit {

  product=new Product();

  constructor(private _route:Router,private service:FoodcourtService,private activateroute:ActivatedRoute) { }

  ngOnInit(){
    // let id= (this.activateroute.snapshot.paramMap.get('id'));
    // this.service.fetchdishlist(id).subscribe();
   
  }

  updatedish(){
    this.service.addnewproduct(this.product).subscribe
    ( 
      data=>{
        console.log("Data updated successfully");
        this._route.navigate(['']);
      },
      error=>console.log("error")
    )
  }

  gotolist(){
    this._route.navigate(['']);
  }

}
