# java-training-4.0

This is a project for all homeworks for AQA Training 4.0

## Local Settings

1. Generate SSH key if you don't have one https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent 
2. Add your newly created SSH key if you haven't added it yet https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account
3. Install GitHub CLI ```brew install gh``` on your Mac
4. Login into GitHub CLI ```gh auth login``` and follow all instructions (here is the example of how it should look) <br/><br/>
<img width="762" alt="image" src="https://github.com/user-attachments/assets/ace9f093-e4e0-4292-afcd-6f5ddd108ef4"> <br/><br/>
5. Create your own repo from template via command ```gh repo create java-training-4.0 --public --template https://github.com/GreatIrrOrg/java-training-4.0.git --include-all-branches --clone```

## GitHub actions

1. Check that on your own account new repo was created with homework branches

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
