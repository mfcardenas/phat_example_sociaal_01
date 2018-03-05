# Social Ambient Assisted Living (SociAAL)
## Tutorial PHAT-SIM
### Construcción de Simulaciones

<img src="https://github.com/mfcardenas/phat_example_sociaal_01/blob/master/img/img_portada_01.png" title="SociAAL Tool"/>

### Creación de Simulación: Caso desorientación
------

<p>El objetivo de esta es guía es permitir al usuario construir una simulación que permita recrear situaciones que un paciente, por ejemplo, puede realizar en su casa. En este caso, se quiere simular a un paciente que realiza actividades sin sentido dentro de su hogar. Para ello, la simulación contará con las siguientes características:</p>

#### Escenario
------
<p>La simulación se llevará a cabo dentro de la vivienda de un paciente. Dicha vivienda consta de los siguientes espacios:</p>

1. Salón (LivingRoom)
2. Cocina (Kitchen)
3. Corredor (Corridor)
4. Recibidor (Hall)
5. Baño 1 (BathRoom 1)
6. Baño 2 (BathRoom 2)

#### Paciente
------
<p>El paciente será una persona de 72 años con dificultades para caminar.</p>

#### Actividades
------
<p>Las actividades a realizar por el paciente son las siguientes:</p>

1. El paciente se encuentra en la cocina
2. El paciente camina hasta el salón.
3. El paciente enciende la televisión.
4. El paciente se sienta en el sofá.
5. El paciente espera cerca de <i>30</i> segundos sentado en el sofá.
6. El paciente se levanta del sofá y espera <i>10</i> segundos de pie.
7. El paciente se dirige al baño y espera <i>5</i> segundos en dicho espacio de la casa.
8. El paciente se dirige a la habitación y espera <i>2</i> segundos en dicho espacio de la casa.
9. El paciente se dirige a la cocina.
10. El paciente bebe agua.
11. El paciente se dirige al Recibidor.
12. Fin de la simulación.

#### Uso de modelado para construir la simulación
------
<p>Para construir la simulación se necesitarán los siguientes elementos:</p>

1. Código github de ejemplo: https://github.com/mfcardenas/phat_example_sociaal_01.git
2. Java 1.7
3. Maven 3.1.1 <i>(o superior)</i>. Es necesario que se defina la variable <i><b>M2_HOME</b></i> en el ordenador en el que se vaya a trabajar.
4. Ant 1.9 <i>(o superior)</i>

<p>Para más información de las herramientas <i>2,3 y 4</i> visite el sitio web: http://grasia.fdi.ucm.es/sociaal/software/</p>

<p>Asumiendo que el usuario trabaja con Linux, siga las siguientes indicaciones:</p>

1. Abrir el editor SociAALML: 
```
$>./startEdit.sh
```
2. Una vez abierto el editor, puede modelar su propia simulación y guardar (Save) los cambios que realice.

<img src="https://github.com/mfcardenas/phat_example_sociaal_01/blob/master/img/img_doc_03.png" title="Save Option"/>

3. Cuando finalice el modelado de la simulación, se debe generar el código fuente java necesario para ejecutar la simulación. Utilice la siguiente instrucción para ello:
```
$>./compileSim.sh
```
4. Ejecute la simulación: 
```
$> ./runSim Sim1 
```

<p><i><b>Sim1</b></i> será el nombre de la simulación que haya construido con el modelador (ver la imagen siguiente).</p>
<img src="https://github.com/mfcardenas/phat_example_sociaal_01/blob/master/img/img_doc_02.png" title="Nombre de la Simulación"/>

