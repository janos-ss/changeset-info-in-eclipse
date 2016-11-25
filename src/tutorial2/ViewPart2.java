package tutorial2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class ViewPart2 extends ViewPart {

  private Button button;

  public ViewPart2() {
    super();
  }

  @Override
  public void createPartControl(Composite parent) {
    button = new Button(parent, SWT.DEFAULT);
    button.setText("Button In New View");
  }

  @Override
  public void setFocus() {
    button.setFocus();
  }

}
