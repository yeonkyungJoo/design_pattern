package com.practice.pattern.decorator.after;

public class SpamFilteringCommentDecorator extends CommentDecorator {
// 단일책임원칙
    private CommentService commentService;

    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (isNotSpam(comment)) {
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment) {
        return comment.contains("1");
    }
}
