# java-basics-training-4.0

This is a project for all homeworks for AQA Training 4.0

## Git Hub actions

1. Create a new repo under your account with the same naming ```java-basics-training-4.0```
2. Clone original repo
    ```git clone git@github.com:GreatIrrOrg/java-basics-training-4.0.git```
3. Locally get inside new created folder ```cd java-basics-training-4.0```
4. Change origin url of your local repo
    ```git remote set-url origin git@github.com:<your-github-name>/java-basics-training-4.0.git```
5. Push changes
   ```git push --mirror git@github.com:<your-github-name>/java-basics-training-4.0.git```
6. Check out that your local repo has correct origin remote
   ```git remote show origin``` - should contain Fetch URL and Push URL to your own remote repo
7. Check out that homework branches exists:
   ```git branch -r```

## IntelliJ IDEA project configuration
1. Import in IntelliJ IDEA using `File -> New -> Project from Existing Sources...`.
2. Select the directory of your local repo. 
3. Go through the `Import Project` wizard by clicking `Next`.
4. On `Please select project SDK` point it to your Java 11 JDK.
5. Press `Ctrl+Alt+Shift+S` (`Command + ;`) and check that in your `Project Structure`.
   Check value of `Project language level` is set to `11 - Local variable syntax etc.`.

## Homework 

1. Checkout corresponding branch for the homework
2. In case if you see that classes are marked with red dot <br/> <img width="302" alt="image" src="https://github.com/user-attachments/assets/336e14f1-9bc2-44fb-9790-5153fe9f1558"> <br/>
   click on **`src`** folder and mark it as a **`Sources Root`** <br/>
    <img width="617" alt="image" src="https://github.com/user-attachments/assets/66a2dae2-f99f-4cbf-9139-44aacacfb634">
4. Read README.md file for the homework task
5. Open test class, put your cursor on `@Test` annotation, press `Alt+Enter`
   and choose `Add 'testng' to classpath`.
6. Set the value to `org.testng:testng:7.1.0` and mark checkbox `Download to`.
7. Complete all TODO tasks. Do not change test class.
8. After you finished assignment compilation should be without any errors (`Ctrl+F9` or `Command + F9`).
4. Do the task =) 
