public class triangulos {
    private double comprimento1, comprimento2, comprimento3;

    public void setComprimento1(double comprimento1) {
        this.comprimento1 = comprimento1;
    }

    public void setComprimento2(double comprimento2) {
        this.comprimento2 = comprimento2;
    }

    public void setComprimento3(double comprimento3) {
        this.comprimento3 = comprimento3;
    }
    
    public void condicao_existencia () {
        if (comprimento1 + comprimento2 > comprimento3 || comprimento1 + comprimento3 > comprimento2 || comprimento2 + comprimento3 > comprimento1) {
         System.out.println("É possível sim formar um triângulo");
        }

        else {
            System.out.println("Não é possivel formar um triângulo");
        }
    }

    
    public void tipo_triangulo () {
        if (comprimento1 == comprimento3 && comprimento2 == comprimento3) {
         System.out.println("É um triângulo equilátero");
             }

            else if (comprimento1 == comprimento2 || comprimento2 == comprimento3 || comprimento1 == 3) {
                System.out.println("É um triângulo isósceles");
            }

            else {
                System.out.println("É um triângulo escaleno");
            }


        }
    }