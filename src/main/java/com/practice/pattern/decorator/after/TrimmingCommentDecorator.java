package com.practice.pattern.decorator.after;

public class TrimmingCommentDecorator extends CommentDecorator {

    private CommentService commentService;

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("_", "");
    }
}
