import 'package:flutter/material.dart';

void main() => runApp(
      MaterialApp(
        home: Scaffold(
          appBar: AppBar(
            title: const Text("Transferências"),
            backgroundColor: Color.fromRGBO(0, 70, 10, 1),
          ),
          floatingActionButton: FloatingActionButton(
            child: Icon(Icons.add), onPressed: () {},
          ),
        ),
      ),
    );
