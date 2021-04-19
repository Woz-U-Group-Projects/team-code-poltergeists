import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { DsPump } from './dsPump';

@Injectable({
  providedIn: 'root'
})
export class DsPumpService {

  private baseURL = "http://localhost:8080/api/v1/dsPumps";

  constructor(private httpClient: HttpClient) { }
  
  getDsPumpsList(): Observable<DsPump[]>{
    return this.httpClient.get<DsPump[]>(`${this.baseURL}`);
  }

  createDsPump(dsPump: DsPump): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, dsPump);
  }

  getDsPumpById(id: number): Observable<DsPump>{
    return this.httpClient.get<DsPump>(`${this.baseURL}/${id}`);
  }

  updateDsPump(id: number, dsPump: DsPump): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, dsPump);
  }

  deleteDsPump(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
