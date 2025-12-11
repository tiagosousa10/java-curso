package io.github.cursodsousa.heranca;

public class Panda extends Animal {
    private String cor;
    private String corSecundaria;

    public void subirArvore() {
        System.out.println("Subir arvore");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }
}
