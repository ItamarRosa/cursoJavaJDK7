package fundamentoDasClasses;

/*
Um programa que usa a classe Box. 
*/
class Box {
    double width;
    double height;
    double depth;
}

//Esta classe declara um objeto do tipo Box.
class BoxDemo {
    public static void main(final String[] args) {
        Box myBox = new Box();

        double vol;

        //atribuindo valores à variśveis de instância de mayBox.
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // calcular o volume da caixa.
        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("O volume é: " + vol);
    }
}