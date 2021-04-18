import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DsPumpDetailsComponent } from './components/dsPump-details/dsPump-details.component';
import { LoginComponent } from './components/login/login.component';
import { PumpLogComponent } from './components/pump-log/pump-log.component';
import { RegisterComponent } from './components/register/register.component';
import { ResetPasswordComponent } from './components/reset-password/reset-password.component';
import { UpdateDsPumpComponent } from './components/update-dsPump/update-dsPump.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent},
  { path: 'register', component: RegisterComponent},
  { path: 'reset-password', component: ResetPasswordComponent},
  { path: 'pump-log', component: PumpLogComponent},
  {path: 'update-dsPump', component: UpdateDsPumpComponent },
  { path: 'dsPump-details', component: DsPumpDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthRoutingModule { }
