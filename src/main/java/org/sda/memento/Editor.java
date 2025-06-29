package org.sda.memento;

class Editor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }




    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento m) {
        this.text = m.getState();
    }

    static class Memento {
        private final String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setText("Version 1");
        Memento saved = editor.save();

        editor.setText("Version 2");
        System.out.println("Current: " + editor.getText());

        editor.restore(saved);
        System.out.println("Restored: " + editor.getText());
    }
}
