# CECS328H
Assignments for CECS338H - Data Structures and Algorithms Honors

CECS 328 Honors Programming Assignments

Darin Goldstein


## #2 Party
Alice wants to throw a party and is deciding whom to call. She has N people to
choose from, and she has made up a list of which pairs of these people know each
other. She wants to pick as many people as possible, subject to two constraints:
at the party, each person should have at least k1 other people whom they know
and k2 other people whom they don’t know. (Note that you can’t know or not
know yourself. You don’t count in your own computation.)
Input to your program will be a text file called description.txt. The first
line will hold the number k1 and the second line will hold the number k2. The
remainder of the file will be a 0-1 adjacency matrix indicating which people
know which others. If there is an edge between two people, then they know
each other. If not, they don’t. People will be represented numbers from 1 to N.
(Part of the problem will be to determine the number N from the adjacency
matrix itself.)
Output should consist of a list of integers, one per line, in the file party.txt
of the people who should be invited to the party.
For example, assume that the input file description.txt is as follows.

1

2

0001110011

0001000010

0001000010

1110111011

1001010010

1001100011

0001000010

0000000010

1111111101

1001010010

The file party.txt should be empty. No valid party can be formed from this
group of 10 people.
