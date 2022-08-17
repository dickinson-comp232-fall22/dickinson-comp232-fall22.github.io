# HowTo page for COMP232

## Installing Eclipse 

Download and install The Eclipse IDE (integrated development
environment), available from
[eclipse.org](https://www.eclipse.org/downloads/).

   - During installation, choose the option "Eclipse IDE for Java
     Developers"



## Obtaining starter code and creating Git repository

Unless stated otherwise, the following instructions apply to each homework assignment:

1. Copy the assignment invitation URL, available from the course
   homework webpage.
1. In a browser, log into your GitHub account.
1. Paste the starter code link into the address bar of the same
   browser window you used to log in to GitHub and press enter to go
   to that link.
1. Follow any instructions about joining a GitHub Classroom or linking
   your GitHub login to the GitHub Classroom.
1. You will see a message to accept an assignment. Once you accept the
   assignment, GitHub will provide you with a link that you can use to
   access your personal code repository for the assignment. You may
   need to refresh the page to see the link to your repository. Once
   you see the link, follow it. You will now be on a page that we call
   your *personal assignment repository page*.
1. Create a Personal Access Token (PAT) for accessing your assignment
   repository. (You can skip this step if you already have a PAT that
   has the right access permissions.)
   * Follow GitHub's instructions for [Creating a personal access
     token](https://docs.github.com/en/github/authenticating-to-github/keeping-your-account-and-data-secure/creating-a-personal-access-token). The
     following points provide additional details specific to our
     scenario.
   * You can choose any name you want for this PAT. "Homework
     assignments" would be an appropriate choice.
   * For the expiration of the token, it will be easiest to use the
     same token throughout the semester. Therefore, choose the Custom
     expiration option and select a date after the end of the
     semester. 
   * When choosing the scopes or permissions for the token, select the
     "repo" option and leave everything else unchecked.
   * The random string highlighted in green is your PAT. Copy this and
     save it somewhere secure. Treat it the same way you would treat
     any other password. Anyone who knows this PAT has full access to
     your GitHub repositories.
   * Your PAT now serves the purpose of a password for accessing your
     GitHub repository. Whenever you are asked for a "password" to
     access a repository, you should instead use this PAT. Your GitHub
     account password is still used for accessing GitHub from a web
     browser.
1. On the GitHub webpage for your personal assignment repository,
   click the green Code button, and copy the web URL for "HTTPS". In
   the steps below, we will refer to this web URL as your *assignment
   repository URL*.
1. Open Eclipse.
1. Go to Window \| Show View \| Other \| Git \| Git Repositories. A
   Git Repositories view should appear below the Package Explorer.
1. In the Git Repositories view, click on "Clone a Git Repository and
   add the clone to this view". 
   * In the Clone Git Repository dialog box that opens up, paste your
     *assignment repository URL* into the URI field. Eclipse will
     often paste this in for you automatically if it detects that you
     already have a URL stored in your clipboard. The URL will start
     with `https://github.com/...`
   * In the Authentication section of the Clone Git Repository dialog
     box, enter your GitHub username but **do not enter your GitHub
     account password**. This is the place where you need to use your
     PAT, because your PAT serves the purpose of a password for access
     to repositories.
   * Click Next and Finish. A Git clone should appear in the Git
     Repositories window.
1. Right-click on the new repository in the Git Repositories
   view. Select Import Projects \| Finish.
1. A Java project should now appear in the Package Explorer view.

## Committing and pushing your changes to GitHub for backup and grading

In order to push your changes to the GitHub repository from Eclipse:

1. Right-click on the relevant Java project in the Git Repositories view and click on Commit. 
1. Find the newly-appeared "Git Staging" window and click on the double-plus symbol to move all of your changes from "Unstaged Changes" to "Staged Changes". 
    - Some versions of Eclipse exhibit a bug at this point. If the files appear not to have moved from Unstaged to Staged, manually refresh the view by pressing F5.
1. Type a descriptive commit message into the Commit Message box (this can be useful later to remind you of what changes you have made). 
1. Finally, click "Commit and Push" followed by "Close". 
    - If the view doesn't automatically update, refresh by pressing F5.

This saves all the changes on your computer and also pushes them to the GitHub servers. This is a good way to back up your progress, and it is also the way you will submit code for grading. The instructor will grade the most recently-committed version.


## Adding the JUnit4 library to a project in Eclipse

Quick shortcut if the project already uses JUnit4 but the library hasn't been added yet: hover over one of the red squiggly errors caused by the absence of JUnit4 (usually in an import statement near the top of the file), choose Quick Fix and accept the suggestion to Fix Project. 

Otherwise, you can explicitly add the library using the following steps:

1. Right-click on the project in Package Explorer and choose Properties.
1. Click on "Java Build Path" and select the Libraries tab.
1. Click "Add library...", choose JUnit, then Next.
1. Select JUnit library version "JUnit 4", then Finish, then Apply and Close.

## Changing default font of the editor in Eclipse

1. On Window menu, choose Preferences \| General \| Appearance \| Colors and Fonts
1. Choose Basic \| Text Font \| Edit...
1. Select the font you wish and choose Apply and Close

## Importing .java files into an Eclipse project

1. Right-click the project in Package Explorer.
1. Choose Import \| General \| File System, hit Next.
1. Browse to the folder containing your .java file(s) and click the Select Folder button (or it may be labeled "Open" on a Mac) to select this folder.
1. Put checkmarks by every folder or file that you wish to import.
1. Make sure the Into Folder setting is correct—usually this should be set to the `src` subdirectory of your project.
1. Click Finish.











----
Last modified: Wed Aug 17 18:42:11 UTC 2022 by jmac.
