@echo off
title cardone-configuration-consumer
set myself=%~dp0

call java -Xms256m -Xmx512m -Dfile.encoding=UTF-8 -Dfile.encoding=UTF-8 -cp %myself%\*;%myself%\target\* org.springframework.boot.loader.JarLauncher --app.root=file:/%myself%

call run.bat