import 'package:flutter/material.dart';

// Para formatar: ctrl + alt + l
void main() => runApp(ByteBankApp());

class ByteBankApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: ListaTransferencia(),
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
          Editor(
              controlador: _controladorCampoNumeroConta,
              rotulo: "Número da conta",
              dica: "0000"),
          Editor(
            controlador: _controladorCampoValor,
            rotulo: "Valor",
            dica: "0.00",
            icone: Icons.monetization_on,
          ),
          RaisedButton(
            child: Text('Confirmar'),
            onPressed: () => _criaTransferencia(context),
          ),
        ],
      ),
    );
  }

  void _criaTransferencia(BuildContext context) {
    final int _numeroConta = int.tryParse(_controladorCampoNumeroConta.text);
    final double _valor = double.tryParse(_controladorCampoValor.text);
    if (_numeroConta != null && _valor != null) {
      final transferenciaCriada = Transferencia(_valor, _numeroConta);
      debugPrint("$transferenciaCriada");
      debugPrint("Criando transferencia");
      Navigator.pop(context, transferenciaCriada);
    }
  }
}

class Editor extends StatelessWidget {
  final TextEditingController controlador;
  final String rotulo;
  final String dica;
  final IconData icone;

  Editor({this.controlador, this.rotulo, this.dica, this.icone});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(16.0),
      child: TextField(
        controller: controlador,
        style: TextStyle(
          fontSize: 24.0,
        ),
        decoration: InputDecoration(
          icon: icone != null ? Icon(icone) : null,
          labelText: rotulo,
          hintText: dica,
        ),
        keyboardType: TextInputType.number,
      ),
    );
  }
}
// tem que usar statefull qnd tiver atualizacao dinamica
class ListaTransferencia extends StatelessWidget {

  final List<Transferencia> _transferencias = List();

  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Transferências"),
        backgroundColor: Color.fromRGBO(0, 70, 10, 1),
      ),
      body: ListView.builder(
        itemCount: _transferencias.length,
        itemBuilder: (context, indice){
          final transferencia = _transferencias[indice];
          return ItemTransferencia(transferencia);
        },
      ),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.add),
        onPressed: () {
          final Future<Transferencia> future =
              Navigator.push(context, MaterialPageRoute(builder: (context) {
            return FormularioTransferencia();
          }));
          future.then((transferenciaRecebida) {
            debugPrint("Chegou no then do future");
            debugPrint("$transferenciaRecebida");
            _transferencias.add(transferenciaRecebida);
          });
        },
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


/*
ListView eh para elementos estaticos!
 */