package com.bkd.momento;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public EditorState createState() {
        return new EditorState(this.content);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void undo(){
        String tempContent = this.content;
        tempContent.substring(0, this.content.length()-1);
        this.content = tempContent;
        System.out.println("Content: " + this.content);
    }
}
