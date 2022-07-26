export class Educacion {
    id? : number;
    nombreInsti : string;
    nombreCarrera : string;
    anoInicio: number;
    anoFin: number;

    constructor(nombreInsti : string, nombreCarrera : string, anoInicio : number, anoFin : number){
        this.nombreInsti = nombreInsti;
        this.nombreCarrera = nombreCarrera;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
    }
}
