# CmpSci221
Game attempt


Spaceship powerup type game. Classic arcade game people will recognize except created and altered by us.
Powerups only add hull health at the moment. "Hull Health" was used because I ambitiously hoped to put a large ship in the bottom that
we're protecting.
Enemies spawn in increments of 5*level (5, 10, 15, etc..).
There are only 3 images used: the player's ship, enemy ships, and projectiles. The player's ship is being reused to represent powerups due
to laziness.
Orientation seems to be bugged for me and just puts everything in the same JLabel even though I delcare them as different. I would rather
that than have them not show up at all so I left them there.
At the end of the game (Hull Health reaches 0 or you run into an enemy ship) the game ends telling you this and revealing all the stats
in case you wish to record them. I do not have a server or storage memory devoted to storing scores.
