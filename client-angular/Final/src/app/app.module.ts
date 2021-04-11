import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';

import { MatGridListModule } from '@angular/material/grid-list';
import { MatCardModule } from '@angular/material/card';
import { MatMenuModule } from '@angular/material/menu';

import { FlexLayoutModule } from '@angular/flex-layout';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
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
    LayoutModule,
    FlexLayoutModule, 
    AuthModule,
    SharedModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent],

})
export class AppModule { }
