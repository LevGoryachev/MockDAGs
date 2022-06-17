# Lgoryachev

SpringBoot Java
Заглушка для тестирования клиента локально.

Настроена на 8085 порт (см. в application.yaml).

Перед запуском бэкэнда APCS:
cоздать или добавить в свой кастомный application.yaml проперти заглушки:

apcs: <br />
&nbsp;&nbsp;airflow: <br />
&nbsp;&nbsp;&nbsp;&nbsp;url: http://localhost:8085/ <br />
&nbsp;&nbsp;&nbsp;&nbsp;username: user <br />
&nbsp;&nbsp;&nbsp;&nbsp;password: password <br /> 
&nbsp;&nbsp;&nbsp;&nbsp;dagRunsPath: api/v1/dags/%s/dagRuns <br />

запустить бэкэнд APCS с VM options:
-Dspring.config.location=C:\папка где лежит твой кастомный yaml/ -jar build/apcs.jar

и запустить MockDags. 
Заметка: приложения должны быть на разных портах, например APCS - 8080,
MockDags - 8085.

Можно лепить свои endpointы - DagsController


