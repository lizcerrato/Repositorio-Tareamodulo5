public class Main {
    public static void main(String[] args) {
    
        Circulo c = new Circulo("Rojo", 5.0);
        c.dibujar();
        System.out.println("Radio del círculo: " + c.obtenerRadio());

        Linea l = new Linea("Azul", 10.0);
        l.dibujar();
        System.out.println("Largo de la línea: " + l.obtenerLargo());

        Triangulo t = new Triangulo("Verde", 6.0, 8.0);
        t.dibujar();
        System.out.println("Área del triángulo: " + t.calcularArea());

        Cuadrado q = new Cuadrado("Amarillo", 4.0);
        q.dibujar();
        System.out.println("Área del cuadrado: " + q.calcularArea());
    }
}