import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RedesSocComponent } from './redes-soc.component';

describe('RedesSocComponent', () => {
  let component: RedesSocComponent;
  let fixture: ComponentFixture<RedesSocComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RedesSocComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RedesSocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
