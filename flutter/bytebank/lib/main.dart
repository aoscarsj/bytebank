import 'package:flutter/material.dart';

void main() => runApp(Column(
      children: <Widget>[
        Text(
          'Deliver features faster',
          textDirection: TextDirection.rtl,
        ),
        Text(
          'Craft beautiful UIs',
          textDirection: TextDirection.ltr,
        ),
        Text(
          'Craft beautiful UIs',
          textDirection: TextDirection.ltr,
        ),
        Column(
          children: <Widget>[
            Text(
              'Filho do coluna 2',
              textDirection: TextDirection.ltr,
            )
          ],
        )
      ],
    ));
