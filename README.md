# Equipo Tepaches

- Velez Enrique
- Galindo Ruvalcaba Luis Adrian
- Pinzon Chan Jose Carlos

## Modelado y Programación 2026-1 - Practica 02

### Profesora: Rosa Victoria Villa Padilla

**Objetivo:** *El objetivo de esta práctica es implementar adecuadamente los patrones State, Template y Decorator en la resolución del problema propuesto. Su solución debe estar integrada en un solo diagrama de clases y un diagrama de estados, así como una sola implementación.*

Se te ha encargado implementar el siguiente problema:

La cadena de pizzerías “El Pequeño Cesarín” ha solicitado tu ayuda para resolver el problema de empleados que tienen, pues ya nadie quiere trabajar ahí. Por este motivo, te han pedido que programes un robot, el cual trabajará en todas los puestos de una primera sucursal, y si el éxito es el esperado, entonces se replicará a todas las demás sucursales. El robot tendrá las siguientes tareas:
El robot sólo atiende a un cliente a la vez. Mientras el robot no esté trabajando, estará dormido, hasta que algún cliente lo llame.
Al ser llamado, el cliente puede ordenar una pizza o un helado (más adelante serán descritos los productos). El cliente sólo puede ordenar una pizza, un postre o uno de cada uno. Finalmente, se debe confirmar que la orden está completa. Una vez confirmada la orden, el robot no podrá dormir hasta terminar todo el proceso de preparación y entrega, por lo tanto, la orden sólo podrá cancelarse antes de la confirmación de ésta. Al cancelarse la orden, el robot vuelve a dormirse.
Una vez confirmada la orden, el robot podrá preparar el producto o los productos solicitados, cuando se le indique.
Al terminar de preparar, el robot esperará a que el cliente le solicité la entrega de su orden. Junto con la orden, se entregará un ticket donde se desglose el precio de los productos y el precio final. Una vez entregada la orden, el robot vuelve a dormir.

Las pizzas que se venden cuentan con el mismo tipo de información: id del producto, nombre, descripción, precio y un indicador de si es vegetariana. Todas las pizzas tienen un proceso de preparación análogo:
- Preparar la masa
- Aplanar la masa
- Colocar salsa de tomate
- Colocar queso
- Colocar especias
- Colocar proteína
- Meter al horno
- Esperar
- Sacar del horno
- Empaquetar
  
Sin embargo, se debe considerar que los tipos de queso y proteína varían entre las distintas pizzas, de las cuales deben existir al menos 5 diferentes (ustedes deben elegir los tipos de queso y proteínas a su gusto). Además, antes de iniciar la preparación, el cliente debe indicar el tipo de masa que quiere (napolitana, romana o americana). Al momento de la preparación, el robot debe mostrar la secuencia de los pasos que está siguiendo según la receta. En el ticket, únicamente se muestra el nombre de la pizza y su precio.

Por último, existen 3 sabores de helado: fresa, vainilla y chocolate. Cada vaso de helado se puede servir con ingredientes extra (gomitas de gusano, gomitas de panda, gomitas de aro, chispas de chocolate, malvaviscos, fresitas, manguitos y kiwis). Cada ingrediente tiene un costo adicional y pueden colocarse máximo 3 de cada uno. Una vez agregado algún ingrediente al helado, ya no es posible removerlo. Al momento de la preparación, el robot primero debe esperar la indicación del sabor del helado y, posteriormente, ir agregando cada ingrediente extra como el cliente se lo indique. En el ticket, se muestra el sabor del helado y cada uno de los ingredientes que fueron añadidos (si alguno fue agregado más de una vez, puede aparecer la palabra tantas veces como se haya añadido; por ejemplo, si se pidieron 2 manguitos, puede aparecer “manguitos, manguitos”). 

