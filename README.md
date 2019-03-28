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



## #4 Mixtures
How to make gold from lead has baffled alchemists for centuries. Scientists
recently announced a sensational breakthrough. By mixing N different chemicals in exactly the correct ratio, one can create a mixture that transforms lead
into gold. However, these N chemicals are not found in nature individually but
rather only in specific ratios in liquid form. So making the correct mixture is
not as trivial as it may at first seem.

Consider the following example where N = 3 with chemicals A, B, C. Assume that two mixtures are available in liquid form in the ratios of 1:2:3 and
3:7:1, respectively. By mixing those two solutions together in the ratio 1:2, it
is possible to obtain a solution of A, B, C with ratio 7:16:5, but there is no way
to combine these two mixtures into a new one with ratio 3:4:5. However, if we
added a solution solution of A, B, C with ratio 2:1:2:, then a 3:4:5 mixture is
possible with eight parts of 1:2:3, one part 3:7:1, and 5 parts of 2:1:2.
So clearly, determining which mixing ratios can be obtained from a given set
of solution is not trivial. It is your goal in this assignment to do so.
Your input file will be called solutions.txt. The top line will be a line with
a desired solution ratio in the form a1 : a2 : a3 : . . . : aN . The next M lines will
be the base solution ratios.

Your output file (answer.txt) will consists of M lines, each containing a single
integer. These will indicate the parts necessary to get the desired solution. If
no solution is possible, then return the value −1 on each line.
So, for example above, the input file solutions.txt would look as follows:

3:4:5

1:2:3

3:7:1

2:1:2

and the output file answer.txt would look as follows:

8

1

5

