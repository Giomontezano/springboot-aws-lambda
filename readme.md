Como invocar a lambda:


1. Deverá retornar "Brasil", "Argentina" e "Paraguai".
> curl -H "Content-Type: text/plain" localhost:8080/countriesList

2. Deverá retornar apenas "Brasil".
> curl -H "Content-Type: text/plain" localhost:8080/findByName -d "Brasil"

3. Deverá logar na aplicação "oooi".
> curl -H "Content-Type: text/plain" localhost:8080/CountryConsumerBean -d "oooi"