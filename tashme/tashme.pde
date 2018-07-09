PImage mustache;
PImage troll;
void setup(){
  troll=loadImage("Troll.jpg");
  mustache=loadImage("Bushy2.png");
  size(800,800);
  troll.resize(800,800);
  mustache.resize(200,100);
}
void draw(){
  background(troll);
  image(mustache, 370,375);
}