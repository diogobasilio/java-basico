public class Arrays {
    public static void main(String[] args) {

        // Não é uma boa prática! double temp[];
        double[] temperaturas = new double[365];

        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;


        System.out.println("O valor da temperatura no dia 1 é: " + temperaturas[0]);
        System.out.println("O tamanho do array " + temperaturas.length);


        for (int i = 0; i < temperaturas.length; i++) {  //for mais comum
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
        }

        for (double temp : temperaturas) {  //For melhorado
            System.out.println(temp);
        }


    }

}
