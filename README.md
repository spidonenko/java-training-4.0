# java-basics-training-4.0

This is a project for all homeworks for AQA Training 4.0

## Git Hub actions

1. Create a new repo under your account with the same naming ```java-basics-training-4.0```
2. Clone original repo
    ```git clone 'https://github.com/GreatIrrOrg/java-basics-training-4.0.git'```
3. Change origin url of your local repo
    ```git remote set-url origin 'https://github.com/<your-github-name>/java-basics-training-4.0.git'```
4. Push changes
   ```git push --mirror public```

## IntelliJ IDEA project configuration
1. Import in IntelliJ IDEA using `File -> New -> Project from Existing Sources...`.
2. Select the directory of your local repo. 
3. Go through the `Import Project` wizard by clicking `Next`.
4. On `Please select project SDK` point it to your Java 11 JDK.
5. Press `Ctrl+Alt+Shift+S` (`Command + ;`) and check that in your `Project Structure`.
   Check value of `Project language level` is set to `11 - Local variable syntax etc.`.
6. Open test class, put your cursor on `@Test` annotation, press `Alt+Enter`
   and choose `Add 'testng' to classpath`.
7. Set the value to `org.testng:testng:7.1.0` and mark checkbox `Download to`.
8. Complete all TODO tasks. Do not change test class.
9. After you finished assignment compilation should be without any errors (`Ctrl+F9` or `Command + F9`).

## Homework 

1. Checkout corresponding branch for the homework
2. Read README.md file for the homework task
3. Do the task =) 
