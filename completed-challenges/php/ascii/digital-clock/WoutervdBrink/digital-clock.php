<?php
/**
 * Digital ASCII clock
 *
 * Displays a digital ASCII clock, using some self-written functions.
 * Works on Unix, possibly works on Windows.
 * @author Wouter van den Brink <wouter@woutervdb.com>
 */

$numbers = array(
    array(' ___  ', '|   | ', '|   | ', '|   | ', '|___| '),
    array('      ', '    | ', '    | ', '    | ', '    | '),
    array(' ___  ', '    | ', ' ___| ', '|     ', '|___  '),
    array(' ___  ', '    | ', ' ___| ', '    | ', ' ___| '),
    array('      ', '|   | ', '|___| ', '    | ', '    | '),
    array(' ___  ', '|     ', '|___  ', '    | ', ' ___| '),
    array(' ___  ', '|     ', '|___  ', '|   | ', '|___| '),
    array(' ___  ', '    | ', '    | ', '    | ', '    | '),
    array(' ___  ', '|   | ', '|___| ', '|   | ', '|___| '),
    array(' ___  ', '|   | ', '|___| ', '    | ', ' ___| ')
);

$endings = array(
    '\\  |     |',
    '|  |     |',
    '|  |    /',
    '|  |   /',
    '|  |  /'
);

while (true) {
    echo chr(27) . chr(91) . chr(72) . chr(27) . chr(91) . chr(50) . chr(74);
    echo '
        _________________________________________________
       /                                                /|
      /                                                / |
     /                                                /  |
    /                                                /   |
   /_______________________________________________ /    |
   |   _________________________________________   |     |
';
    $hours = str_split(date('H'));
    $minutes = str_split(date('i'));
    $seconds = str_split(date('s'));
    for ($i = 0; $i < 5; $i++) {
        if ($i === 0)
            echo '   |  / ';
        elseif($i === 5)
            echo '   |  \\ ';
        else
            echo '   |  | ';
        
        echo $numbers[$hours[0]][$i];
        echo $numbers[$hours[1]][$i];
        if ($i === 1 || $i === 4) {
            echo '\' ';
        } else {
            echo '  ';
        }
        echo $numbers[$minutes[0]][$i];
        echo $numbers[$minutes[1]][$i];
        if ($i === 1 || $i === 4) {
            echo '\' ';
        } else {
            echo '  ';
        }
        echo $numbers[$seconds[0]][$i];
        echo $numbers[$seconds[1]][$i];
        echo $endings[$i] . PHP_EOL;
    }
    echo '   |  \_________________________________________/  | /
   |_______________________________________________|/' . PHP_EOL;
    sleep(1);
}