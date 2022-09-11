package com.practice.pattern.decorator.before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {

        // Client client = new Client(new CommentService());
        // trimming도 하고 spam filtering도 하고 싶다면? -> '상속'의 한계
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("comment_1");
        client.writeComment("comment_2");
        client.writeComment("comment_3");
    }
}
