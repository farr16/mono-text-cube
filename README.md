# mono-text-cube

Project for a program which creates monospaced text cubes made from text input by the user.

The text cube consists of the input phrase, as well as a series of slashes meant to give the appearance of a 3D object made of ASCII characters.

## The Cubes

The following is an example of a monospaced text cube made from the input text 'EXAMPLE'
```
      E X A M P L E
    / X         / X
  /   A       /   A
E X A M P L E     M
X     P     X     P
A     L     A     L
M     E X A M P L E
P   /       P   /
L /         L /
E X A M P L E
```

The cubes are composed from two types of edges:
1. Edges parallel to the plane of the screen, which are made from characters of the input text
2. Edges going into the screen, which are made from forward slashes

There are a few rules which govern what input text can be made into this style of text cube:
1. The input text must begin and end with the same letter so the edges can overlap properly
2. The input text must be at least five characters long so the front and back faces of the cube can be distinct

Additionally, a few other rules will be enforced on input to enforce what I consider to be good style for the cubes:
1. Whitespace characters will be filtered out to give the cubes a more solid appearance
2. The input text will be converted to all caps to give the edges a more solid appearance
3. The input text must consist of only alphanumeric characters besides whitespace to give the edges a more even consistency

## The application

Work in progress

## Acknowledgements

This project was inspired by /u/LinLeyLin, which is a bot which posts similar text cubes automatically on reddit. Seeing some of those posts inspired me to build some of these cubes by hand, to look into rules of how they can be constructed, and ultimately to write an application which constructs them with different settings and options.
