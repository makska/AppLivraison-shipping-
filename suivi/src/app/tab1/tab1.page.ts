import { Component } from '@angular/core';
import { DepotService } from '../service/depot.service';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page {
numero : any;
  constructor(public service: DepotService) {}
  trackByFn(index, item) {
    //Bonne pratique
    return item.id;
  }
  ngOnInit() {

    this.getData();
  }

  getData() {
    this.service.getAll().subscribe(
      response =>{this.service.list = response;}
     );}
    

     list(numero ) {
      this.service.getlistDepot(numero).subscribe(
        response =>{this.service.list = response;}
       );


  }
  addToCart()
  {
  
    
  }
  removeFromCart()
  {
  
    
  }
  formatNumberBeforeDigit = (x) => {
    return Math.trunc(x);
  };
  formatNumberAfterDigit = (x) => {
    const res = (x % 1).toFixed(3).substring(2);
    return res;
  };
}
