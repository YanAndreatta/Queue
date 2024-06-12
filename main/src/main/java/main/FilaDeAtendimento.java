package main;

import java.util.Random;

import dataStructure.Queue;

public class FilaDeAtendimento {

  public static void main(String[] args) {
    int n = 5; // Representa a quantidade de clientes na fila
    var random =  new Random(); // Gerador de valor aleatório

    // Primeiro cliente
    int cliente = random.nextInt(101);
    Queue queue = new Queue(cliente);
    System.out.println("Chegou o cliente " + cliente);

    // Simula chegada dos demais clientes
    for (int i = 2; i <= n; i++) {
      cliente = random.nextInt(101);
      System.out.println("Chegou o cliente " + cliente);
      queue.enqueue(cliente);
    }

    // Atendimento dos clientes da fila
    var node = queue.dequeue();
    while (node != null) {
      System.out.println("Atendido o cliente: " + node.getValue());
      node = queue.dequeue();
    }

  } 
}
