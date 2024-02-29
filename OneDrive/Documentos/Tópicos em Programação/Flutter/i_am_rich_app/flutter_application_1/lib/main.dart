import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.blueGrey[200],
        appBar: AppBar(
            backgroundColor: Colors.blueGrey[900],
            title: const Text('Eu Sou Rico!'),
          ),
        body: const Center(child: Image(
          image: AssetImage('imagens/rubi.png'),
        ),),
      ), 
    ),
  );
}