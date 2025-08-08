public class TextBox extends UIControl {
  public String text = "";

  public TextBox() {
    // super(true);
  }

  @Override
  public void render() {
    System.out.println("Render Textbox");
  }

  @Override
  public String toString() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clearText() {
    this.text = "";
  }
}

