import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateDsPumpComponent } from './update-dsPump.component';

describe('UpdateDsPumpComponent', () => {
  let component: UpdateDsPumpComponent;
  let fixture: ComponentFixture<UpdateDsPumpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateDsPumpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateDsPumpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
