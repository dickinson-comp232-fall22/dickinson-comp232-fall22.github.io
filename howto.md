# HowTo page for COMP232

## Installing Eclipse 

Download and install The Eclipse IDE (integrated development
environment), available from
[eclipse.org](https://www.eclipse.org/downloads/).

   - During installation, choose the option "Eclipse IDE for Java
     Developers"



## Obtaining starter code and creating Git repository

Unless stated otherwise, the following instructions apply to each homework assignment:

1. Copy the starter code link, available from the course homework webpage.
1. Log into your GitHub account and paste the starter code link in the address bar of the same window you used to log in to GitHub.
1. If you see a message stating that you need to "Join the classroom: ...", ignore it and click on "skip to the next step".
1. You will see a message to accept an assignment. Once you accept the assignment, GitHub will provide you with a link that you can use to access the code repository for the lab.
1. On the GitHub webpage for the starter code repository, click the green Code button, and copy the web URL for "clone with HTTPS".
1. Open Eclipse.
1. Go to Window | Show View | Other | Git | Git Repositories. A Git Repositories view should appear below the Package Explorer.
1. In the Git Repositories view, click on "Clone a Git Repository and add the clone to this view". In the Window that opens up, paste the URL for the starter code repository (already copied above) into the URI field. Enter your GitHub username and password. Click Next and Finish. A Git clone should appear in the Git Repositories window.
1. Right click on the Git Repository and select Import Projects | Finish.
1. A Java project should now appear in the Package Explorer tab in the left part of the Eclipse window.

## Committing and pushing your changes to GitHub for backup and grading

In order to push your changes to the GitHub repository from Eclipse, right click on the relevant Java project in the Git Repositories view and click on Commit. Find the newly-appeared "Git Staging" window and click on the double-plus symbol to move all of your changes from "Unstaged Changes" to "Staged Changes". Type a descriptive commit message into the Commit Message box (this can be useful later to remind you of what changes you have made). Finally, click "Commit and Push" followed by "Preview", "Push", "Close". This saves all the changes on your computer and also pushes them to the GitHub servers. This is a good way to back up your progress, and it is also the way you will submit code for grading. The instructor will grade the most recently-committed version.

Pulling graded files from GitHub and sharing with lab partner
You can always view the instructor's grade and comments on your Java source code on the GitHub website. But to share these comments with your lab partner, you will need to pull the instructor's changes back to your own machine. To do this, right click on the relevant Java project in the Git Repositories view and click on Pull. Then email the .java files to your lab partner.
Finding your source files to share with a lab partner
Note that Eclipse stores your .java files within a directory on your computer. In most labs, you will be working with a lab partner. Most often, you will work simultaneously with your partner via screen sharing—so you will be working together on one set of files. However, sometimes you will want to work individually and share your progress with each other. There are many sophisticated ways of collaborating on shared files, but in this course we use the simplest possible approach: it is recommended that you simply email your .java files to your partner (or share the files by any other filesharing technique that you are comfortable with).
Before you can do this, you will need to find your .java files within the local file system on your computer. Within Eclipse, this is achieved by right-clicking on the relevant .java file in Package Explorer, then choose Show In | System Explorer.

## Submitting lab report, including self-assessment report, to Moodle

For every lab, the source code will be submitted to a GitHub repository as described above. In addition, however, for every lab you will also be required to submit a lab report to Moodle. Some labs require you to collect and write about some results as part of the lab itself, in which case those results would form part of your lab report. However, whether or not the lab explicitly requires you to report on results, every lab report must contain a self-assessment report. The self-assessment report is a very brief summary of which parts of the lab you successfully completed, together with descriptions of any parts that are incomplete or not working correctly. Typically, the self-assessment report will be between one and five sentences in length. It should take at most 10 minutes to write the report. The main purpose of the self-assessment report is to help the instructor grade your work efficiently and accurately while also creating the best possible opportunity for the instructor to help you with problems you encountered. If you believe you completed and tested all parts of the lab successfully, you can state this in a single sentence. If not, briefly describe the parts that are incomplete or not working correctly. Submit your lab report in PDF, Word or another common format to Moodle.

## Creating a new project in Eclipse

Open the File menu and choose New.
Choose Project... from the pop-up menu.
In the New Project dialog, select Java Project and click Next.
Enter the name for your project in the Project Name box.
If, at any stage in this process, you are offered the opportunity to create a module, do not select that option. We do not want a module as part of our project.
Click Finish.
A new project with the name that you specified will appear in the Package Explorer tab in the left part of the Eclipse window.

Opening a Closed project in Eclipse
Closed projects appears as a closed folder in the Package Explorer tab in the left part of the Eclipse window.

Double click on the project's folder in the Package Explorer tab.
Click Yes in the Question dialog asking about opening referenced projects.

Creating a new package in Eclipse

Ensure that the project to which you want to add the package is open. See Opening a project, above.
Right click on the src folder of the project and choose New.
Select Package... from the pop-up menu.
Enter the name of your package in the Name field of the New Java Package dialog.
Click Finish.
A new package with the name that you specified will appear within the project's src folder in the Package Explorer tab in the left part of the Eclipse window.

Creating a new class/interface in Eclipse
Right click on the package to which you want to add the class or interface and choose New.
Select Class or Interface as appropriate.
Enter the name of the new class or interface in the Name field of the dialog.
Click Finish.
A new class (or interface) will appear within the package in the Package Explorer tab in the left part of the Eclipse window. An editor window will also open for the new class (or interface) with a stub implementation to be completed.

Running a Java program (i.e. main) in Eclipse
Right click on the class containing the main method you wish to run.
Select Run as and choose "Java Application" from the pop-up menu.
The program will execute and any output generated will appear in the Console tab at the bottom of the Eclipse window.

NOTE: Pressing Shift-Apple-F11 (Mac) or Ctrl-F11 (Windows) will re-run the last executed program.

Creating a new JUnit Test Case in Eclipse
Right click on the class that you wish to test and choose New.
Select JUnit Test Case from the pop-up menu.
Choose the New JUnit 4 test radio button at the top of the New JUnit Test Case dialog.
Click on Finish.
If this is the first test case added to the project a second dialog box will appear stating Junit 4 is not on the build path. Click OK.
A new class will appear beneath the class being tested in the Package Explorer tab in the left part of the Eclipse window. The name of the new class will be the name of the class being tested with "Test" appended to the end. An editor window will also open for the new test class with a stub implementation to be completed.

Creating a new JUnit test method
Find the editor window for the test class you wish to add to. Bring this window to the front.
Create a stub for your test method as shown here:
@Test 
public void testSomething() { 
    fail("not implemented"); 
} 

Change the name of the method from testSomething to be descriptive of what you are testing.
Replace the fail assertion in the body of the test method with your test.
The assertions that can be used in a JUnit test include the following. Note that for the purposes of this course it is acceptable to omit the "message" parameter in the assertions below.

fail("message") Test always fails with message when this assertion is encountered.
assertEquals("message", expectedValue, actualValue) Test fails with message if the actualValue does not equal the expectedValue. If expectedValue and actualValue are objects their .equals methods are used for the comparison.
assertEquals("message", expectedValue, actualValue, detla) Test fails with message if the actualValue is not within + or - delta of the expectedValue. This form is required for testing equality of double and float values.
assertFalse("message", value) Test fails with message if the value is not false.
assertTrue("message", value) Test fails with message if the value is not true.
assertNotNull("message", value) Test fails with message if the value is null.
assertNull("message", value) Test fails with message if the value is not null.
assertNotSame("message", expectedObject, actualObject) Test fails if the expectedObject and the actualObject are the same object (i.e. == is used for the comparision).
assertSame("message", expectedObject, actualObject) Test fails if the expectedObject and the actualObject are not the same object (i.e. == is used for the comparision).
Running JUnit Test Cases in Eclipse
Right click the JUnit Test Case (or package, or project) containing the tests you want to run.
Choose Run As and select JUnit Test from the pop-up menu. All of the test methods in the Test Case (or package, or project) that you selected will be executed. The JUnit tab will become active on the left side of the Eclipse window and will show you your test results.
Click on any failed test to see the message from the failed assertion.
Double click on any failed test to see the test method containing the assertion that failed.

## Adding the JUnit4 library to a project in Eclipse

Quick shortcut if the project already uses JUnit4 but the library hasn't been added yet: hover over one of the red squiggly errors caused by the absence of JUnit4 (usually in an import statement near the top of the file), choose quick fix and accept the suggestion to fix project. 

Otherwise, you can explicitly add the library using the following steps:

1. Right click on the project in Package Explorer and choose Properties.
1. Click on "Java Build Path" and select the Libraries tab.
1. Click "Add library...", choose JUnit, then Next.
1. Select JUnit library version "JUnit 4", then Finish, then Apply and Close.

## Changing default font of the editor in Eclipse
On Window menu, choose Preferences | General | Appearance | Colors and Fonts
Choose Basic | Text Font | Edit...
Select the font you wish and choose Apply and Close

## Importing .java files into an Eclipse project
1. Right click the project in Package Explorer.
1. Choose Import | General | File System, hit Next.
1. Browse to the folder containing your .java file(s) and click the Select Folder button (or it may be labelled "Open" on a Mac) to select this folder.
1. Put checkmarks by every folder or file that you wish to import.
1. Make sure the Into Folder setting is correct—usually this should be set to the src subdirectory of your project.
1. Click Finish.













----
Last modified: Tue Aug 00:50:04 UTC 2021 by jmac.
