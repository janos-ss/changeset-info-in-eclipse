package tutorial2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.team.internal.core.subscribers.ChangeSet;
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
  
  void experiment() {
    ChangeSet changeSet;
    //org.eclipse.mylyn.internal.team.ui.FocusedTeamUiPlugin x;
    //                           ^^^^ cannot resolve
    //FocusedTeamUiPlugin.getDefault().getActiveChangeSetProviders();
//    Collection<AbstractActiveChangeSetProvider> providerList = FocusedTeamUiPlugin.getDefault().getActiveChangeSetProviders();
//    for (AbstractActiveChangeSetProvider provider : providerList) {
//      ActiveChangeSetManager changeSetManager = provider.getActiveChangeSetManager();
//          
//      if (changeSetManager != null) {
//        ChangeSet[] sets = changeSetManager.getSets();
//        
//        for(ChangeSet set : sets) {
//          //work with the changeset here
//        }
//      }
//    }
  }

}
