import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { AuthRoutingModule } from './auth-routing.module';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';

import { ResetPasswordComponent } from './components/reset-password/reset-password.component';
import { PumpLogComponent } from './components/pump-log/pump-log.component';



@NgModule({
  declarations: [LoginComponent, RegisterComponent, ResetPasswordComponent, PumpLogComponent ],
  imports: [
    CommonModule,
    AuthRoutingModule,
    FormsModule
  ],
  exports: [
    LoginComponent, 
    RegisterComponent,
    ResetPasswordComponent
  ]
})
export class AuthModule { }