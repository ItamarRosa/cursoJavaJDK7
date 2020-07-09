package fundamentoDasClasses;

//Esta classe define uma pilha de inteiros que pode conter 10 valores.
class Stack {
    int stck[] = new int[10]; 
    int tos;

    //Inicializar topo da pilha
    Stack() {
        tos = -1;
    }

    //Inserir um intem na pilha
    void push(int item) {
        if (tos == 9) {
            System.out.println("A pilha está cheia.");  
        } else {
            stck[++tos] = item;
        }
    }
    //Tirar um item da pilha
    int pop(){
        if(tos < 0 ){
            System.out.println("Apilha está vazia.");
            return 0;

        } else {
            return stck[tos--];
        }
    }
}

/*
Como você pode ver, a class Stack define dois itens de dados e três métodos. A pilha
de inteiros é mantida pelo Array stck. Este array é indexado pela variável tos, que sempre 
contém o ídice do topo da pilha. O contrutor Stack() inicializa tos em -1 que indica uma pilha vazia.

*/