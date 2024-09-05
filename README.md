# Feeling stuck?

1. Review the assignment instructions and relevant lecture slides - there might be something you
missed or forgot!
1. Post to the "Ask the Class" forum with general questions. Do not paste any code into the public
forums.
1. If you are getting an error message, try searching online for the exact error message, there may
be resources to help point you in the right direction.
1. Attend office hours

# Working on assignments

First, accept the assignment by clicking on the link from Moodle. GitHub will create a copy of the starter
code and instructions for you.

You can then work on the code in one of two ways:

<details><summary>1. Codespaces (browser based editor)</summary>
You can use a browser-based version of VSCode to complete assignments, which means you
don't need VSCode, Docker, or git installed on your computer. This method uses a "Codespace": a cloud-based 
development environment provided by GitHub. 
<br/><br/>
<b>Note that you need an internet connection to develop like this.</b>
<br/><br/>
The PA instructions should have a link to open the assignment in a Codespace. 
<br/><br/>

Note that, with this method, all your changes are saved in the cloud. If you delete your Codespace before you 
submit, your changes are gone! 
</details>
<br/>

<details><summary>2. Local VSCode</summary>
You can also develop locally on your computer. You will need an internet connection to check out the starter code,
but after that you can work offline.
<br/><br/>
<b>Do this once per PA:</b>
   <ol>
    <li>Open VSCode</li>
    <li>Open the command palette (Cmd-Shift-P / Ctrl-Shift-P), and type "Git: Clone", and select it. Paste in the URL
    to your repository (found from the GitHub Classroom assignment after you accept it).</li>
    <li>Choose a location on your computer to put the code.</li>
   </ol>
<b>Then each time you open the assignment:</b>
<br/>
After the project opens, you should see a prompt in the lower right to "Reopen in container". Choose this.
If you don't see the prompt, you may not have Docker installed correctly, reach out to the course staff for help.

</details>      
<br/>

# Submission instructions

You can submit as many times as you want, up to the deadline. We will grade your most recent submission prior to the assignment deadline.

<details><summary>Expand to see instructions</summary>

1. Click on the "Source Control" tab in the left sidebar

<img src=".images/source_control_tab.png" width="600" />

2. Click the "Stage all changes" button. (This tells git which files you want to include in the next commit.)

<img src=".images/stage_all_changes.png" width="600" />

3. Enter a "commit message". Normally this message would describe the changes you made to the code, but for our projects you can enter anything (but it can't be empty). 
Then, click the dropdown on the "Commit" button and select "Commit & Push".

<img src=".images/commit.png" width="600" />
</details>
<br/>

# Getting updates to assignments

Occasionally, updates might need to be issued to assignments after you've accepted them. When this happens, 
it will be announced to the class. Follow the instructions below to incorporate the updates into your copy of
the assignment.

<details><summary>Expand to see instructions</summary>

To get the updates, follow these steps:
1. Merge the "Sync Assignment" pull request in your assignment repo
   1. Open the GitHub Classroom assignment link.
   1. Click on the link to your assignment repository (of the form: `https://github.com/brandeis-cosi-12b/pa<#>-<username>`)
   1. Click on "Pull requests" in the top bar
   1. Click on the "Sync Assignment" pull request.
   1. (Optional) Click on "Files changed" to see the specific changes
   1. Click on "Merge pull request", then confirm.

<img src=".images/sync_changes.png" width="600">

2. Pull the changes from GitHub down to your working directory (Codespace or local checkout).
   1. Open VSCode
   1. Commit any changes you have (see "Submission instructions" above). **The rest of these instructions will fail if you don't commit first**
   1. In VSCode, open the "Source control" tab from the left hand side panel.
   1. Choose "Pull" -> "Pull (rebase)"
   1. You should see the assignment updates in your code now.

<img src=".images/pull_rebase.png" width="600">
</details>
<br/>

# VSCode help

VSCode is a powerful Integrated Development Environment (IDE). It has many more features than you will need in this class, 
so it isn't important to explore or master everything. This section contains information on the parts you'll need to know throughout the course.

<details><summary>Expand to see details</summary>

Here are the main components of the screen:

<img src=".images/vscode_sections.png" width="600" />

Later in the course, assignments will include automated tests. These can be accessed from the testing tab on the left (it is only visible when tests exist).
You can run and debug tests with the various "play" buttons. Hover over them for more detail.

<img src=".images/testing_tab.png" width="600" />

## Running code

When you have a Java file open which includes a `main` method, you will see a play button in the top right corner. If you click on it, it will run the `main` method.

<img src=".images/running_code.png" width="600" />

</details>
<br/>
