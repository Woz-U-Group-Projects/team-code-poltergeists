import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDsPumpComponent } from './create-dsPump.component';

describe('CreateDsPumpComponent', () => {
  let component: CreateDsPumpComponent;
  let fixture: ComponentFixture<CreateDsPumpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateDsPumpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateDsPumpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
