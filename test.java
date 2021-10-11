

class test{
    public static void main(String[] args) {
        shape s = new shape("rect.shape");
        s.deleteShape();
        
        s.saveShape();
        shape ss = new shape("circle.shape");
        ss.deleteShape();
        ss.createCircle(0, 0, 5);
        ss.saveShape();
        objectX obj = new objectX("a.objectX");
        obj.addCenter(0, 0);
        obj.addShape(s);
        obj.addNewFrame();
        obj.selectFrame(1);
        obj.addCenter(0, 0);
        obj.addShape(ss);
        obj.saveFrame();
        obj.saveddad();
        obj.saveObject("c.objectX");
        canvas c = new canvas(100, 30,'x');
        c.addObject(obj,"hello");
        for(int i=0;i<10;i++){
        c.drawObject("hello",1, 5, 5, '*');
        c.display();
        c.drawObject("hello",1, 5, 5, '*');
        c.display();
            obj.saveObject("c.objectX");
        canvas c = new canvas(100, 30,'x');
        c.addObject(obj,"hello");
        for(int i=0;i<10;i++){
        c.drawObject("hello",1, 5, 5, '*');
        c.display();
        c.drawObject("hello",1, 5, 5, '*');
        c.display();
        }
    }
}
