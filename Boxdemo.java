class Box
{
double width,height,depth;
Box(double width,double height,double depth)
{
this.width=width;
this.height=height;
this.depth=depth;
}
double volume()
{
return width*depth*height;
}
}
class Boxdemo
{
public static void main(String args[])
{
Box mybox=new Box(10,10,10);
double vol=mybox.volume();
System.out.println(vol);
}
}