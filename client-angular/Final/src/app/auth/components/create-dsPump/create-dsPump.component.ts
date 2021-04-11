import { Component, OnInit } from '@angular/core';
import { DsPump } from '../../models/dsPump/dsPump';
import { DsPumpService } from '../../models/dsPump/dsPump.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-dsPump',
  templateUrl: './create-dsPump.component.html',
  styleUrls: ['./create-dsPump.component.css']
})
export class CreateDsPumpComponent implements OnInit {

  dsPump: DsPump = new DsPump();
  constructor(private dsPumpService: DsPumpService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveDsPump(){
    this.dsPumpService.createDsPump(this.dsPump).subscribe( data =>{
      console.log(data);
      this.goToDsPumpList();
    },
    error => console.log(error));
  }

  goToDsPumpList(){
    this.router.navigate(['/dsPumps']);
  }
  
  onSubmit(){
    console.log(this.dsPump);
    this.saveDsPump();
  }
}
