; Love Calculator
; There doesn't seem to be an official algorithm, so I'm just going to write
; my own shitty algorithm. Here goes nothing!
; @author Wouter van den Brink <wouter@woutervdb.com>
(import hashlib time)

(print "== Love Calculator ==")
(print "So you're deeply in love, but you're wondering if you two really are")
(print "the perfect match? Enter your names and find out!")
(setv name1 (raw-input "Enter your name: "))
(setv name2 (raw-input "Enter the name of your victim: "))
(print "Please wait...")
(time.sleep 1)

(setv name1 (.digest (hashlib.md5 name1)))
(setv name2 (.digest (hashlib.md5 name2)))

(setv percent 0)
(for [i name1] [
    (setv percent (+ percent (ord i)))
])
(for [i name2] [
    (setv percent (+ percent (ord i)))
])

(setv percent (% percent 101))

(print (+ "Your relationship has a " (string percent) "% chance of succes!"))
(print "The result is just for fun; don't even think it might be true.")