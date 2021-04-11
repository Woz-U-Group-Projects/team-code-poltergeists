import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DsPumpListComponent } from './auth/components/dsPump-list/dsPump-list.component';
import { CreateDsPumpComponent } from './auth/components/create-dsPump/create-dsPump.component';
import { UpdateDsPumpComponent } from './auth/components/update-dsPump/update-dsPump.component';
import { DsPumpDetailsComponent } from './auth/components/dsPump-details/dsPump-details.component';



const routes: Routes = [
  {path: 'dsPumps', component: DsPumpListComponent},
  {path: 'create-dsPump', component: CreateDsPumpComponent},
  {path: '', redirectTo: 'dsPumps', pathMatch: 'full'},
  {path: 'update-dsPump/:id', component: UpdateDsPumpComponent},
  {path: 'dsPump-details/:id', component: DsPumpDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
