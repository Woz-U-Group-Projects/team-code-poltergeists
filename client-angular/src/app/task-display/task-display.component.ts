import { Component, OnInit } from "@angular/core";
import { TaskService } from "../task.service";
import { Task } from "../models/task";
import { __param } from "tslib";

@Component({
  selector: "app-task-display",
  templateUrl: "./task-display.component.html",
  styleUrls: ["./task-display.component.css"]
})
export class TaskDisplayComponent implements OnInit {
  constructor(private taskService: TaskService) {}
  newTask: Task = new Task();
  tasks: Task[] = [];

  getTasks() {
    this.taskService.getTasks().subscribe(tasks => (this.tasks = tasks));
  }

  addTask() {
    this.taskService.addTask(this.newTask).subscribe(result => {
      this.getTasks();
      this.newTask = new Task();
    });
  }

  deleteTask(id: number) :void {
    this.taskService.deleteTask(id);
  }

  updateProject(task: Task) {
    this.taskService.updateProject(task);
  }

  ngOnInit() {
    this.getTasks();
    // this.route.params.subscribe(params => {})
    // this.taskService.getTasks(+param.id)
  }
}
