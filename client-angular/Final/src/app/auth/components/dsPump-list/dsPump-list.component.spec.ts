import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DsPumpListComponent } from './dsPump-list.component';


describe('DsPumpListComponent', () => {
  let component: DsPumpListComponent;
  let fixture: ComponentFixture<DsPumpListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DsPumpListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DsPumpListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
