@echo off
javac main.java
java main
goto continue
echo.

:continue
echo.
CHOICE /C:YN /M "Do you want to continue?"
IF ERRORLEVEL 2 goto no
IF ERRORLEVEL 1 goto yes

:yes
java main
goto continue
echo.

:no
exit /B
