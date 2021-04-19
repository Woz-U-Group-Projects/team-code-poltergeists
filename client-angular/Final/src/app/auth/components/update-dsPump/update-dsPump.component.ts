import { Component, OnInit } from '@angular/core';
import { DsPumpService } from '../../models/dsPump/dsPump.service';
import { DsPump } from '../../models/dsPump/dsPump';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-dsPump',
  templateUrl: './update-dsPump.component.html',
  styleUrls: ['./update-dsPump.component.css']
})
export class UpdateDsPumpComponent implements OnInit {

  id: number;
  dsPump: DsPump = new DsPump();
  constructor(private dsPumpService: DsPumpService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.dsPumpService.getDsPumpById(this.id).subscribe(data => {
      this.dsPump = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.dsPumpService.updateDsPump(this.id, this.dsPump).subscribe( data =>{
      this.goToDsPumpList();
    }
    , error => console.log(error));
  }

  goToDsPumpList(){
    this.router.navigate(['/dsPumps']);
  }
}
