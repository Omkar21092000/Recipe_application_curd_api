import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditmenuComponent } from './editmenu/editmenu.component';
import { HomeComponent } from './home/home.component';
import { RegistrationComponent } from './registration/registration.component';


const routes: Routes = [
  {path:"adddish",component:RegistrationComponent},
  {path:"",component:HomeComponent},
  {path:"editvalue/:id",component:EditmenuComponent},
  {path:"editvalue",component:EditmenuComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
