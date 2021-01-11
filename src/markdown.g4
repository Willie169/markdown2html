grammar markdown;

prog        :   (referblock
            |   codeblock
            |   list
            |   title
            |   text)*
            ;

title       :   main_title
            |   sub_title
            ;

main_title  :   SHARP SPACE words newline;

sub_title   :   SHARP SHARP SPACE words newline;

list        :   listline;

listline    :   tab* number DOT SPACE line;

referblock  :   referline+;

referline   :   GT SPACE words newline;

codeblock   :   UPPERDOT UPPERDOT UPPERDOT inlinespace* newline
                (codes | newline)*
                newline
                UPPERDOT UPPERDOT UPPERDOT inlinespace;

text        :   line;

symbols     :   SHARP | STAR | OTHERSYMBOL | DOT;

line        :   (inlinebold | inlineitalic | words | inlinespace)* newline;

words       :   (character | singledigit | othersymbol | inlinespace | dot)+;

codes       :   (character | singledigit | symbols | inlinespace)+;

inlinebold  :   STAR STAR words STAR STAR;

inlineitalic:   STAR words STAR;

inlinespace :   (SPACE | tab);

number      :   (ZERO | POSDIGIT (ZERO | POSDIGIT)*);


singledigit :   ZERO | POSDIGIT;

newline     :   NEWLINE;

character   :   CHARACTER;

othersymbol :   OTHERSYMBOL;

tab         :   TAB;

dot         :   DOT;


SHARP       :   '#';

SPACE       :   ' ';

STAR        :   '*';

GT          :   '>';

DOT         :   '.';

ZERO        :   '0';

UPPERDOT    :   '`';

TAB         :   '\t';

NEWLINE     :   '\n';

POSDIGIT    :   [1-9];

CHARACTER   :   [a-zA-Z];

OTHERSYMBOL :   ',' | ';' | '_' | '(' | ')' | '{' | '}' | ':' | '-' | ']' | '\'' | '"' | '/';
