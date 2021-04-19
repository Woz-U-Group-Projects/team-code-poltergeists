import { TestBed } from '@angular/core/testing';

import { DsPumpService } from './dsPump.service';

describe('EmployeeService', () => {
  let service: DsPumpService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DsPumpService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
