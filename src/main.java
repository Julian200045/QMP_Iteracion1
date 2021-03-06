public enum Material{ CUERO, JEAN, LANA, ALGODON, PLASTICO};

public enum Categoria{ PRENDA_SUPERIOR, PREDNA_INFERIOR, CALZADO, ACCESORIO};

public class Tipo{
  Categoria categoria;

  constructor(Categoria categoria){
    this.categoria = categoria;
  }

  method categoria(){
    return categoria;
  }
}

class Color{
  int  rojo, verde, azul;

  constructor(int rojo,int verde,int azul){
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }

  method colorEnHexa(){
    return String.format("#%02x%02x%02x", rojo, verde, azul);
  }

}

public class Prenda {

  Tipo tipo;
  Material material;
  Color color;
  Color colorSecundario;

  constructor(Tipo tipo,Material material,Color color, Color colorSecundario) {
    this.tipo = requireNonNull(tipo, "es necesario ingresar un tipo");
    this.material = requireNonNull(material, "es necesario ingresar un material");
    this.color = requireNonNull(color, "es necesario ingresar un color");
    this.colorSecundario = colorSecundario;
  }
}
