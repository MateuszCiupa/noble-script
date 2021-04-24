import sys
from antlr4 import *
from MyGrammarLexer import MyGrammarLexer
from MyGrammarParser import MyGrammarParser

class MyGrammarListener(ParseTreeListener):
    def enterKey(self, ctx):
        pass
    def exitKey(self, ctx):
        pass
    def enterValue(self, ctx):
        pass
    def exitValue(self, ctx):
        pass

class KeyPrinter(MyGrammarListener):     
    def exitKey(self, ctx):         
        print("Oh, a key!")
    def enterKey(self, ctx):         
        print("Oh, a key!")
    def enterValue(self, ctx):
        print("Oh, a value enter!", ctx)
    def exitValue(self, ctx):
        print("Oh, a value exit!", ctx)

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = MyGrammarLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MyGrammarParser(stream)
    tree = parser.prog()
    printer = KeyPrinter()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
 
if __name__ == '__main__':
    main(sys.argv)