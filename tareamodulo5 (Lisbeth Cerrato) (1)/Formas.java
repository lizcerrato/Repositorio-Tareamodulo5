// Superclase Formas
class Formas {
    protected String color; 

    public Formas(String color) {
        this.color = color;
    }

    public void establecerColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void dibujar() {
        System.out.println("Dibujando una forma...");
    }
}

// Subclase Circulo
class Circulo extends Formas {
    private final double radio;

    public Circulo(String color, double radio) {
        super(color); 
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }

    public double obtenerRadio() {
        return radio;
    }
}

// Subclase Linea
class Linea extends Formas {
    private final double largo;

    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una línea.");
    }

    public double obtenerLargo() {
        return largo;
    }
}

// Subclase Triangulo
class Triangulo extends Formas {
    private final double base;
    private final double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo.");
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Subclase Cuadrado
class Cuadrado extends Formas {
    private final double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }

    public double calcularArea() {
        return lado * lado;
    }
}