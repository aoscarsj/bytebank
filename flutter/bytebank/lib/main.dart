import 'package:flutter/material.dart';

void main() => runApp(
      MaterialApp(
        home: Scaffold(
          body: Column(
            children: <Widget>[
              Card(
                child: ListTile(
                  leading: Icon(Icons.monetization_on),
                  title: Text("100.0"),
                  subtitle: Text("0001"),
                ),
              ),Card(
                child: ListTile(
                  leading: Icon(Icons.monetization_on),
                  title: Text("200.0"),
                  subtitle: Text("0001"),
                ),
              ),
            ],
          ),
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
