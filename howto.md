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
1. Go to Window \| Show View \| Other \| Git \| Git Repositories. A Git Repositories view should appear below the Package Explorer.
1. In the Git Repositories view, click on "Clone a Git Repository and add the clone to this view". In the Window that opens up, paste the URL for the starter code repository (already copied above) into the URI field. Enter your GitHub username and password. Click Next and Finish. A Git clone should appear in the Git Repositories window.
1. Right click on the Git Repository and select Import Projects \| Finish.
1. A Java project should now appear in the Package Explorer tab in the left part of the Eclipse window.

## Committing and pushing your changes to GitHub for backup and grading

In order to push your changes to the GitHub repository from Eclipse:

1. right click on the relevant Java project in the Git Repositories view and click on Commit. 
1. Find the newly-appeared "Git Staging" window and click on the double-plus symbol to move all of your changes from "Unstaged Changes" to "Staged Changes". 
    - Some versions of Eclipse exhibit a bug at this point. If the files appear not to have moved from Unstaged to Staged, manually refresh the view by pressing F5.
1. Type a descriptive commit message into the Commit Message box (this can be useful later to remind you of what changes you have made). 
1. Finally, click "Commit and Push" followed by "Preview", "Push", "Close". 
    - If the view doesn't automatically update, refresh by pressing F5.

This saves all the changes on your computer and also pushes them to the GitHub servers. This is a good way to back up your progress, and it is also the way you will submit code for grading. The instructor will grade the most recently-committed version.


## Adding the JUnit4 library to a project in Eclipse

Quick shortcut if the project already uses JUnit4 but the library hasn't been added yet: hover over one of the red squiggly errors caused by the absence of JUnit4 (usually in an import statement near the top of the file), choose quick fix and accept the suggestion to fix project. 

Otherwise, you can explicitly add the library using the following steps:

1. Right click on the project in Package Explorer and choose Properties.
1. Click on "Java Build Path" and select the Libraries tab.
1. Click "Add library...", choose JUnit, then Next.
1. Select JUnit library version "JUnit 4", then Finish, then Apply and Close.

## Changing default font of the editor in Eclipse

1. On Window menu, choose Preferences \| General \| Appearance \| Colors and Fonts
1. Choose Basic \| Text Font \| Edit...
1. Select the font you wish and choose Apply and Close

## Importing .java files into an Eclipse project

1. Right click the project in Package Explorer.
1. Choose Import \| General \| File System, hit Next.
1. Browse to the folder containing your .java file(s) and click the Select Folder button (or it may be labelled "Open" on a Mac) to select this folder.
1. Put checkmarks by every folder or file that you wish to import.
1. Make sure the Into Folder setting is correct—usually this should be set to the `src` subdirectory of your project.
1. Click Finish.











----
Last modified: Wed Aug 18:49:19 UTC 2021 by jmac.
