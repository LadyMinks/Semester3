#include <OneWire.h>
#include <DallasTemperature.h>

#define ONE_WIRE_BUS 0

OneWire oneWire(ONE_WIRE_BUS);  

DallasTemperature sensors(&oneWire);

void setup(void)
{
  sensors.begin();  
  Serial.begin(9600);
}

void loop(void)
{ 
  sensors.requestTemperatures(); 

  // Celsius
  Serial.print("Temperature: ");
  Serial.print(sensors.getTempCByIndex(0));
  Serial.print((char)176);//shows degrees character
  Serial.print("C  |  ");
  
  //Fahrenheit
  Serial.print((sensors.getTempCByIndex(0) * 9.0) / 5.0 + 32.0);
  Serial.print((char)176);//shows degrees character
  Serial.println("F");
  
  delay(500);
}
