import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';



import { AuthModule } from './auth/auth.module';
import { SharedModule } from './shared/shared.module';
import { HttpClientModule } from '@angular/common/http';
import { DsPumpListComponent } from './auth/components/dsPump-list/dsPump-list.component';
import { CreateDsPumpComponent } from './auth/components/create-dsPump/create-dsPump.component';
import { FormsModule} from '@angular/forms';
import { UpdateDsPumpComponent } from './auth/components/update-dsPump/update-dsPump.component';
import { DsPumpDetailsComponent } from './auth/components/dsPump-details/dsPump-details.component';





@NgModule({
  declarations: [
    AppComponent,
    DsPumpListComponent,
    CreateDsPumpComponent,
    UpdateDsPumpComponent,
    DsPumpDetailsComponent
   
   
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    AuthModule,
    SharedModule,
    HttpClientModule,
    FormsModule,
    

  ],
  providers: [],
  bootstrap: [AppComponent],

})
export class AppModule { }
