package com.br.treino.curso.aula.aula17;

public class ForLoop {
    public static void main(String[] args) {




        //for(int i=0;i<5;i++){
            //System.out.println("valor:"+i);
       // }


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("valor i:"+i+"\n");
                System.out.println("valor j:"+j);
                System.out.println("soma:"+i+j);
            }
        }


        int cont=0;
        for(;cont<10;){
            System.out.println("valor"+cont);
            cont++;

        }
    }

}
