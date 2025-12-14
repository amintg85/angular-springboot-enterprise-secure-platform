
import { Component } from '@angular/core';
@Component({
 standalone:true,
 template:`
 <h1>Elite Enterprise Dashboard</h1>
 <button (click)="load()">Load KPI</button>
 <pre>{{data|json}}</pre>
 `
})
export class AppComponent{
 data:any;
 load(){
  fetch('/api/kpi').then(r=>r.json()).then(d=>this.data=d);
 }
}
