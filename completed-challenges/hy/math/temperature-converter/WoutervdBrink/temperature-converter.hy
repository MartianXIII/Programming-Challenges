; Temperature Converter
; Converts temperatures, F->C and C->F.
; @author Wouter van den Brink <wouter@woutervdb.com>


(defn convert-celcius-fahrenheit [] [
    (setv temperature (float (raw-input "Enter a temperature (C): ")))
    (print
        (+ (/ (* temperature 9) 5) 32))
])
(defn convert-fahrenheit-celcius [] [
    (setv temperature (float (raw-input "Enter a temperature (F): ")))
    (print
        (/ (* 5 (- temperature 32)) 9))
])
(while true
    (print "Temperature Converter")
    (print "1. Celcius -> Fahrenheit")
    (print "2. Fahrenheit -> Celcius")
    (setv mode (raw-input "Enter mode: "))
    (cond
        [(or (= mode "1") (= mode "1.")) [
            (convert-celcius-fahrenheit)
            (exit)
        ]]
        [(or (= mode "2") (= mode "2.")) [
            (convert-fahrenheit-celcius)
            (exit)
        ]]
        [true [
            (print "What's that?")
            (print "")
        ]]
    )
)
