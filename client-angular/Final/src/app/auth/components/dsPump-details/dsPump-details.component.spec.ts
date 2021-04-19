import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DsPumpDetailsComponent } from './dsPump-details.component';

describe('DsPumpDetailsComponent', () => {
  let component: DsPumpDetailsComponent;
  let fixture: ComponentFixture<DsPumpDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DsPumpDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DsPumpDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
