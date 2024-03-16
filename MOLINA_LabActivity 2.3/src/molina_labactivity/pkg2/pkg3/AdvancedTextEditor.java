package molina_labactivity.pkg2.pkg3;


public class AdvancedTextEditor extends TextEditor {
    
    
    public AdvancedTextEditor(String text){
        super(text); //calls the initial text
    }
    
        public void undo(){ //to undo
        history--;
        
        setText(prevText[history]);
    }
        
    }
