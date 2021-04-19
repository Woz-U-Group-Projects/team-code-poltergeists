import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DsPump } from '../../models/dsPump/dsPump';
import { DsPumpService } from '../../models/dsPump/dsPump.service';

@Component({
  selector: 'app-dsPump-details',
  templateUrl: './dsPump-details.component.html',
  styleUrls: ['./dsPump-details.component.css']
})
export class DsPumpDetailsComponent implements OnInit {

  id: number
  dsPump: DsPump
  constructor(private route: ActivatedRoute, private dsPumpService: DsPumpService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.dsPump = new DsPump();
    this.dsPumpService.getDsPumpById(this.id).subscribe( data => {
      this.dsPump = data;
    });
  }

}
