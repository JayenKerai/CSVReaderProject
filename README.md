## Employee CSV Reader Project
[Our trello board!](https://trello.com/b/yBfkTaxb/groupproject)
T: Tyler, C: Conor, J: Jayen, E: Emese
# Sprint 1 - 2pm (approx 1 hour)
* ALL: Setting up
* ALL: Planning outline of day 1
* ALL: Attempt to implement git in the project
Review: #1 and #2 done, #3 issues.
Retrospective: Avoid using git because of issues with using it, for small + restricted time project decided that it was more harm than good.
# Sprint 2 - 3pm (approx 1 hour)
* T: Employee object
* J/E: Reading from the CSV file
* E (T/J): Writing tests for the CSV reader
Review: Employee object done, reading (and testing CSV reader) making good progress.
Retrospective: Difficulty with handling the initial tasks because they felt reliant on the CSV reader. TDD also difficult as we had nothing to test, needed to look into 'Mocking'.
# Sprint 3 - 4pm (approx 1 hour)
* J/E/T: Complete CSV reader before 5pm (end of day 1)
* J/E/T: Write further tests + attempt to pass them
Review: Got it completed in the time we wanted to. All testing passed as well.
Retrospective: Had good use of TDD (e.g. implemented a temporary double readline() in the CSVReader in order to skip the first row of headers and pass the test).
# Sprint 4 - 5pm (approx 1 hour)
* ALL: J/E/T catch C up on the progress so far
* ALL: E uploaded current status of the project so we were all synced
Review: Day 1 complete, work we wanted to complete is complete. Some potential future issues including checking for the max number of lines or handling exceptions (such as null pointer exceptions).
Retrospective: Need to start logging sprints better + setting better goals.
# Sprint 5 - 9.15am (45 mins)
* T: Write up readme file from yesterday's work
* C: Looking through code done yesterday, updating trello board
* J/E: Writing + testing the collections handler
Review: All tasks done well.
Retrospective: 
(Note: Need to remember/structure it properly do the retrospective at the time)
# Sprint 6 - 10.10am (50 mins)
* C: Length of CSV file
* T: Handling duplicates
* J/E: Merge collections with length - merge files + test that
Review: Tasks #1 and #2 done, but #3 missed
Retrospective: Need to stick to the tasks more, ended up forgetting to implement the length counter (now added to trello and will do in next hour)
(Break)
# Sprint 7 - 11.30am (1 hour)
* T: Separate class for duplicates and then add
* C: Corrupted data?
* J/E: Model View Controller implementation/considerations
* E: Merge collections with length - merge files + test that
Review: Everyting bar duplicate/corrupt works. Need more testing though.
Retrospective: Duplicate/Corrupt task was too complicated needs to be simplified and prioritised in next sprint
# Sprint 8 - 12.30pm (2 hours w/ lunch)
* ALL: Duplicates
* S: Search pre setup
Review: Completed it but realised that it broke everything else (class structure)
Retrospective: Better instruction on what to do 
# Sprint 9 - 2.30pm (1 hour)
* ALL: Rework duplicate classes to manage it
Review: Duplicate classes are now separated and the program seems to function (big error fixed in reading number of lines after duplicates removed), need to test the whole program now.
Retrospective: Plan our program structure better so we have an idea of how the classes join together before we make them rather than trying to fit them together afterwards.
# Sprint 10 - 3.30pm
* ALL: Writing tests
* J: Constructor has a lot of stuff in - refactor
* ALL: Upload and submit to github (10 mins only!)
* BACKLOG/IF FINISHED: start handling exceptions
Sprint 10 delayed because quiz - 45mins from 5.15pm
Review: Done! - Not enough time to massively handle exceptions, so moved to not done column.
Retrospective: Leave more time to upload and submit (but quiz)
