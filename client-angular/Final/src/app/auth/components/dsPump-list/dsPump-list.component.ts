import { Component, OnInit } from '@angular/core';
import { DsPump } from '../../models/dsPump/dsPump';
import { DsPumpService } from '../../models/dsPump/dsPump.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-dsPump-list',
  templateUrl: './dsPump-list.component.html',
  styleUrls: ['./dsPump-list.component.css']
})
export class DsPumpListComponent implements OnInit {

  dsPumps: DsPump[];

  constructor(private dsPumpService: DsPumpService,
    private router: Router) { }

  ngOnInit(): void {
    this.getDsPumps();
  }

  private getDsPumps(){
    this.dsPumpService.getDsPumpsList().subscribe(data => {
      this.dsPumps = data;
    });
  }

  dsPumpDetails(id: number){
    this.router.navigate(['dsPump-details', id]);
  }

  updateDsPump(id: number){
    this.router.navigate(['update-dsPump', id]);
  }

  deleteDsPump(id: number){
    this.dsPumpService.deleteDsPump(id).subscribe( data => {
      console.log(data);
      this.getDsPumps();
    })
  }
}
