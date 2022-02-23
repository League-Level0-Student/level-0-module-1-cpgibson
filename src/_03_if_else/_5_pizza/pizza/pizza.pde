PImage pepperoni;
PImage mushroom;
void setup() {
    size(500,500);
    fill(#FCE173);
    ellipse(250,250,475,475);
    fill(#BC301B);
    ellipse(250,250,425,425);
    fill(#F9FF62);
    ellipse(250,250,410,410);
    pepperoni = loadImage("pepperoni.png");
    mushroom = loadImage("mushroom.png");
    
}
void draw() {
    image(mushroom,220,200);
    image(pepperoni,100,100);
    image(pepperoni,90,200);
    image(mushroom,300,200);
    image(mushroom,260,280);
    image(mushroom,260,120);
    image(mushroom,260,50);
    image(mushroom,330,120);
    image(mushroom,330,280);
    image(mushroom,315,320);
}
