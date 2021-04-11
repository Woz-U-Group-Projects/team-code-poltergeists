import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PumpLogComponent } from './pump-log.component';

describe('PumpLogComponent', () => {
  let component: PumpLogComponent;
  let fixture: ComponentFixture<PumpLogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PumpLogComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PumpLogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
