import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Task } from "./models/task";
import { Observable } from "rxjs";

@Injectable({
  providedIn: "root"
})
export class TaskService {
  // Java Spring Boot uses port 8080
  apiUrl: string = "http://localhost:8080/tasks";

  // C# dotnetcore uses port 5000
  //apiUrl: string = "http://localhost:5000/api/tasks";

  // Express will use port 3000
  //apiUrl: string = "http://localhost:3001/tasks";
  
  getTasks(): Observable<Task[]> {
    return this.http.get<Task[]>(this.apiUrl);
  }

  addTask(task: Task): Observable<Task> {
    return this.http.post<Task>(this.apiUrl, task);
  }

  deleteTask(id: number): Observable<Task> {
    return this.http.delete<Task>(this.apiUrl + "/" + id );
    
  }

  updateProject(task: Task): Observable<Task> {
    return this.http.put<Task>(this.apiUrl + "/" + task.id, task);
  }

  constructor(private http: HttpClient) {}
}
