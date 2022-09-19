import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';


// import 'rxjs/add/operator/catch';
// import 'rxjs/add/observable/throw';



@Injectable({
  providedIn: 'root'
})
export class FoodcourtService {


  constructor(private http:HttpClient) { }

  public listfooditem():Observable<any>{
    return this.http.get<any>("http://localhost:8080/menu/all");
  }

 public addnewproduct(product:Product):Observable<any>{
  return this.http.post<any>("http://localhost:8080/menu/add",product)
 }

 public fetchdishlist(id:number):Observable<any>{
  return this.http.get<any>("")
 }

  

}
