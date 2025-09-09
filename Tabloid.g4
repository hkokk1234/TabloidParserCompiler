grammar Tabloid;

// ----------------- Kanones tou Parser -----------------

programma: dilosi* EOF;

dilosi: anathesi| ektypwsi| eisodos| epistrofi| dhmiourgiasynartishs| klhsh| if| while| 'PLEASE LIKE AND SUBSCRIBE';
//anathesi timhs se metavlhth
anathesi:'EXPERTS CLAIM' ID 'TO BE' ekfrasi;
//ektypwsh timhs
ektypwsi:'YOU WON\'T WANT TO MISS' ekfrasi;
//eisodos timis apo ton xristi kai apothikefsi se metavliti
eisodos:('TELL ME' | 'LATEST NEWS ON') ID;

epistrofi:'SHOCKING DEVELOPMENT' ekfrasi?;
//orismos synarthshs me orismata kai swma
dhmiourgiasynartishs:'DISCOVER HOW TO' ID 'WITH' parametroi 'RUMOR HAS IT' dilosi+'END OF STORY';
//lista onomatwn orismatwn
parametroi:ID (',' ID)*;
//klhsh synartisis me orismata
klhsh:ID 'OF' listaOrismatwn?;
//lista timwn pou pernane ws orismata
listaOrismatwn:ekfrasi(',' ekfrasi)*;

//kanonas if
if:'WHAT IF' synthiki dilosi+ ('LIES!' ('RUMOR HAS IT' dilosi+)? )?'END OF STORY';
//kanonas while
while:'STAY TUNED WHILE' synthiki'RUMOR HAS IT' dilosi+'END OF STORY';
// kanonas gia synthikes sygkrisis
synthiki: ekfrasi sygkritis ekfrasi;

sygkritis:'SMALLER THAN'  # Mikrotero
    | 'BIGGER THAN'      # Megalytero
    | 'LESS THAN'        # SynwnymoMikroterou
    | 'BEATS'            # SynwnymoMegalyterou
    | 'EQUAL TO'         # Iso
    | 'NOT EQUAL TO'     # Diaforo
    | 'IS ACTUALLY'      # SynwnymoIsotitas
    ;
// Genikos kanones ekfraseon
ekfrasi: ekfrasi op=('*'|'/'|'%'|'TIMES'|'DIVIDED BY'|'MODULO') ekfrasi # PollaplasiasmosDiairesei
    | ekfrasi op=('+'|'-'|'PLUS'|'MINUS') ekfrasi                     # ProsthesiAfairesi
    | ekfrasi op=('AND'|'OR') ekfrasi                                 # LogikesPraxeis
    | ekfrasi sygkritis ekfrasi                                       # SygkritikiEkfrasi
    | '(' ekfrasi ')'                                                 # Parentheseis
    | klhsh                                                 # EkfrasiKlisis
    | INT                                                             # Akeraio
    | FLOAT                                                           # Dekadiko
    | STRING                                                          # Keimeno
    | BOOL                                                            # LogikiTimh
    | ID                                                              # Metavliti
    ;

// ----------------- Kanones tou Lexer -----------------

ID:[a-zA-Z_][a-zA-Z_0-9]*;
 //akeraioi
INT:[0-9]+;
//dekadikoi
FLOAT:[0-9]+ '.' [0-9]+;
// symboloseires  me  eisagogika
STRING:'\'' .*? '\'';
// Logikes times
BOOL:'TRUE' | 'FALSE' | 'TOTALLY RIGHT' | 'COMPLETELY WRONG';
// sxolia pou agnoountai
COMMENT:'UNCONFIRMED RUMOR:' ~[\r\n]* -> skip;
// kena tabs kai grammes na agnoountai
WS:[ \t\r\n]+ -> skip;
