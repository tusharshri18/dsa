package recursion;

public class josephus {
    public static void main(String[] args) {
        System.out.println(calculateJosephus(6,4));
    }
        /*
    Josephus Problem:
    n people stand in a circle, numbered from 0 to n-1.
    Starting from the first person, every k-th person is eliminated.
    After each elimination, counting continues from the next person.
    The process repeats until only one person remains.

    Example:
    n = 6, k = 4
    Elimination order: 3 → 1 → 0 → 2 → 5
    Survivor: 4
    */

        /*
    Josephus Solution Formula (Explanation):

    Let f(n) represent the safe position when there are n people in the circle.
    Positions are considered using 0-based indexing for simpler calculation.

    Base Case:
    f(1) = 0
    → With only one person, that person (index 0) is always safe.

    Recursive Insight:
    When we eliminate one person from a circle of n people,
    the problem reduces to the same Josephus problem with (n − 1) people.

    However, after each elimination:
    - Counting resumes from the next person
    - This effectively rotates the circle by k positions

    Because of this rotation, the safe position in the smaller problem
    (f(n − 1)) must be shifted forward by k positions to match
    the original circle of size n.

    Recurrence Relation:
    f(n) = (f(n − 1) + k) % n
    → The modulo ensures the position wraps around the circle.

    Final Result:
    The value returned by f(n) is 0-based.
    Add 1 to convert it to 1-based indexing if required by the problem.
    */


    static int calculateJosephus(int numberOfPeople, int numberOfTurns)
    {
        if (numberOfPeople <= 1) return 0;
        return (calculateJosephus(numberOfPeople-1,numberOfTurns) + numberOfTurns) % numberOfPeople;
    }
}
