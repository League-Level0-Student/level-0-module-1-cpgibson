PImage face;
void setup() {
size(750,750);
face = loadImage("zface.jpg");
}
void draw() {
image(face,0,0);
face.resize(width,height);
if (mouseX >= 375){
 fill(127,0,127);
}
else {
 fill(255,0,0); 
}
ellipse(200,425,50,50);
fill(0,0,0);
ellipse(200,425,10,10);
 
 
 if (mouseX >= 375){
 fill(0,0,255);
}
else {
 fill(0,255,0); 
}
ellipse(550,425,50,50);
fill(0,0,0);
ellipse(200,425,10,10);
}
