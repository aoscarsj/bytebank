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
  final TextEditingController _controladorCampoNumeroConta =
  TextEditingController();
  final TextEditingController _controladorCampoValor = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Criando Transferência"),
      ),
      body: Column(
        children: <Widget>[
          Padding(
            padding: const EdgeInsets.all(16.0),
            child: TextField(
              controller: _controladorCampoNumeroConta,
              style: TextStyle(
                fontSize: 24.0,
              ),
              decoration: InputDecoration(
                  labelText: "Número da conta", hintText: "0000"),
              keyboardType: TextInputType.number,
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(16.0),
            child: TextField(
              controller: _controladorCampoValor,
              style: TextStyle(
                fontSize: 24.0,
              ),
              decoration: InputDecoration(
                  icon: Icon(Icons.monetization_on),
                  labelText: "Valor",
                  hintText: "0.00"),
              keyboardType: TextInputType.number,
            ),
          ),
          RaisedButton(
            child: Text('Confirmar'),
            onPressed: () {
              int _numeroConta = int.tryParse(
                  _controladorCampoNumeroConta.text);
              double _valor = double.tryParse(_controladorCampoValor.text);
              if (_numeroConta != null && _valor != null) {
                final transferenciaCriada = Transferencia(_valor, _numeroConta);
                debugPrint("$transferenciaCriada");
                Scaffold.of(context).showSnackBar(SnackBar(content: Text("$transferenciaCriada"),));
              } else
                debugPrint("Null...");
            },
          ),
        ],
      ),
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
        child: Icon(Icons.add),
        onPressed: () {},
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

class Transferencia {
  final double _valor;
  final int _numeroConta;

  Transferencia(this._valor, this._numeroConta);

  @override
  String toString() {
    return 'Transferencia{_valor: $_valor, _numeroConta: $_numeroConta}';
  }
}
