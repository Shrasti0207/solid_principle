class Rectangle{
    int m_width;
    int m_length;
    public void setWidth(int width){
        m_width = width;
    }
    public void setLength(int length) {
        m_length = length;
    }
    public int getWidth() {
        return m_width;
    }
    public int getLength() {
        return m_length;
    }

    public int getArea() {
        return m_width * m_length;
    }
}

class Square extends Rectangle{
    public void setSide(int side){
        m_width = side;
        m_length = side;
    }
}

