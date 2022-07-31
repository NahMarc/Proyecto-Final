export class persona{
    id?: number;
    nombre: string;
    apellido: string;
    titulo: string;
    sobremi: string;
    img: string;
    imgbanner: string;

    constructor(nombre: string,apellido: string,titulo: string,sobremi: string,img:string,imgbanner: string) {
        this.nombre = nombre;
        this.apellido =apellido;
        this.titulo = titulo;
        this.sobremi = sobremi;
        this.img = img;
        this.imgbanner = imgbanner;
    }
}