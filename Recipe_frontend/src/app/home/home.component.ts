import { Component, OnInit } from '@angular/core';
import {  Router } from '@angular/router';
import { FoodcourtService } from '../foodcourt.service';

// import { FoodcourtService } from '../foodcourt.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  listofmenu:any;
  searchText:any;
  

  

  constructor(private service:FoodcourtService,private _route:Router) { }

  ngOnInit() {
    
    this.service.listfooditem().subscribe((data)=>this.listofmenu=data);

    
  }
  gotoaddnewmenu(){
    this._route.navigate(['/adddish']);
  }

  UpdateProductmenu(id: number) {
    console.log("id: "+ id);
    this._route.navigate(['/editvalue', id]);
  }

}
