import 'package:flutter/material.dart';

void main() => runApp(ByteBankApp());

class ByteBankApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: FormularioTransferencia(),

      ),
    );
  }
}

class FormularioTransferencia extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Criando Transferência"),
      ),
      body: Text("Teste")
    );
  }
}

class ListaTransferencia extends StatelessWidget {
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Transferências"),
        backgroundColor: Color.fromRGBO(0, 70, 10, 1),
      ),
      body: Column(
        children: <Widget>[
          ItemTransferencia(Transferencia(400.0, 1024)),
          ItemTransferencia(Transferencia(5000.0, 0001)),
          ItemTransferencia(Transferencia(7005.0, 0021)),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.add), onPressed: () {},
      ),
    );
  }

}

class ItemTransferencia extends StatelessWidget {

  final Transferencia _transferencia;

  ItemTransferencia(this._transferencia);

  Widget build(BuildContext context) {
    return Card(
      child: ListTile(
        leading: Icon(Icons.monetization_on),
        title: Text(_transferencia._valor.toString()),
        subtitle: Text(_transferencia._numeroConta.toString()),
      ),
    );
  }
}
class Transferencia{
  final double _valor;
  final int _numeroConta;

  Transferencia(this._valor, this._numeroConta);
}