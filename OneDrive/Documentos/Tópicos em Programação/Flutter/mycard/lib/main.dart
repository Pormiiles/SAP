import 'package:flutter/material.dart';

void main() {
  runApp(
    MyApp(),
  );
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.deepOrange,
        body: SafeArea(
          child: 
            Row(
              crossAxisAlignment: CrossAxisAlignment.center,
              children: [
                Container(
                height: 100,
                width: 100,
                color: Colors.white,
                child: const Center(child: Text('Container 1'),
                ),
              ),
              Container(
                height: 100,
                width: 100,
                color: Colors.green,
                child: const Center(child: Text('Container 2'),
                ),
              ),
              Container(
                height: 100,
                width: 100,
                color: Colors.purple,
                child: const Center(child: Text('Container 3'),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}