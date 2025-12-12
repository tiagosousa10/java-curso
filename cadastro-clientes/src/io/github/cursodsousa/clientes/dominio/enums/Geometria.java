package io.github.cursodsousa.clientes.dominio.enums;

public class Geometria
{
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = FormaGeometrica.QUADRADO;

        int ladoRetangulo = formaGeometrica.getLados();
        System.out.println("Lados do Retangulo: " + ladoRetangulo);
    }
}
