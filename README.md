<h2>Introduction</h2>
This project introduces two distinct concepts that are both provided through the same
Application, making it unique in its approach. The first concept is the ability to remotely
Control the lighting within a space via the mobile application. This feature enables the user
to turn off the lights from the convenience of their phone. The second concept is the
ability to measure humidity through the mobile application. Users can obtain real-time
readings of both the temperature and humidity levels in their environment. These two
concepts offer practical and innovative features to the user, providing them with both
comfort and convenience at their fingertips.
<br>


<h2>Solution</h2>
This report offers a mobile application solution for the two aforementioned concepts.
One of the application's features is to display the temperature of the surrounding
environment instantly. This is made possible through the use of a humidity sensor that continuously takes
readings and sends them to the Firebase cloud database. Upon request from the user, the application
retrieves and displays the temperature measurement.
In addition, we propose a method to control home light bulbs via the mobile application remotely.
The IoT device communicates with Firebase to receive commands from the application, which are
then translated into operational instructions for the bulb via a relay. The relay converts the low
voltage (5V DC) current to high voltage (230V AC) current necessary to power the bulb circuit.
<br>

<h2>Development Tools</h2>
We utilized Android Studio as our primary integrated development environment to develop
the mobile application. Android Studio was the best fit for our project requirements, which allowed
us to create an application compatible with both Android and iOS platforms using the Flutter
software development kit. To ensure the system's accessibility from any location, we connected
the database to the internet and used Firebase as the cloud database server. For implementing the
code in our IoT circuits, we used the Arduino IDE. The devices we used include Node MCU,
Relay, DHT 11 Humidity Sensor, 5V Bulb, and Wires

<h2>Circuite Diagram</h2>
<img src ="https://github.com/DaniduZe/SmartHome-Bulb-Controller/assets/110765521/4615a73a-369c-48f3-bbb4-3acc0bf973c7">
<br>
<h2>Final Resault</h2>
<img src = "https://github.com/DaniduZe/SmartHome-Bulb-Controller/assets/110765521/e77ef8b9-f714-41a6-803d-60518df8d77a">
<h2>Preview of Mobile APP</h2>
<img src = "https://github.com/DaniduZe/SmartHome-Bulb-Controller/assets/110765521/d22a06d0-c34d-4cba-9c2a-640b2a495da4" width="800" height="600">


