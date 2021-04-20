import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DsPumpDetailsComponent } from './components/dsPump-details/dsPump-details.component';
import { LoginComponent } from './components/login/login.component';
import { DsPumpListComponent } from './components/dsPump-list/dsPump-list.component';
import { RegisterComponent } from './components/register/register.component';
import { ResetPasswordComponent } from './components/reset-password/reset-password.component';
import { UpdateDsPumpComponent } from './components/update-dsPump/update-dsPump.component';
import { CreateDsPumpComponent } from './components/create-dsPump/create-dsPump.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent},
  { path: 'register', component: RegisterComponent},
  { path: 'reset-password', component: ResetPasswordComponent},
  { path: 'create-dsPump', component: CreateDsPumpComponent},
  { path: 'update-dsPump', component: UpdateDsPumpComponent },
  { path: 'dsPump-details', component: DsPumpDetailsComponent},
  { path: 'dsPumps', component: DsPumpListComponent},
  {path: 'dsPump-list', component: DsPumpListComponent},
  { path: 'create-dsPump', component: CreateDsPumpComponent},
  { path: '', redirectTo: 'dsPumps', pathMatch: 'full'}
  
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthRoutingModule { }












