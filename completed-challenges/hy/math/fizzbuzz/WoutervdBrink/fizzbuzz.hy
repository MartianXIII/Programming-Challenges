; FizzBuzz
; Performs the FizzBuzz "challenge".
; @author Wouter van den Brink <wouter@woutervdb.com>

(for [i (range 1 100)] [
    (cond
        [(= (% i 15) 0) [
            (print "FizzBuzz")
        ]]
        [(= (% i 3) 0) [
            (print "Fizz")
        ]]
        [(= (% i 5) 0) [
            (print "Buzz")
        ]]
        [true [
            (print i)
        ]]
    )
])