# BoardingPass


### DCEVM
- [Windows](https://github.com/TravaOpenJDK/trava-jdk-11-dcevm/releases/download/dcevm-11.0.11%2B1/Openjdk11u-dcevm-windows-x64.zip)
- [Linux](https://github.com/TravaOpenJDK/trava-jdk-11-dcevm/releases/download/dcevm-11.0.11%2B1/Openjdk11u-dcevm-linux-x64.tar.gz)
- [Mac](https://github.com/TravaOpenJDK/trava-jdk-11-dcevm/releases/download/dcevm-11.0.11%2B1/Openjdk11u-dcevm-mac-x64.tar.gz)
  - ```sh sudo xattr -r -d com.apple.quarintine```

### Project 
Generates a boarding pass, stored as a file on disk, based on user contact information, origin/destination airport selection, departure/arrival time, price, and special discounts per user demographics. 
The ETA is estimated with a constant flight speed, based on the distance calculated with the airport's latitude and longitude using the [Haversine Formula](https://en.wikipedia.org/wiki/Haversine_formula). 


### Technologies
- Git
- Java
- JUnit
