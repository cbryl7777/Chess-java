package chess.engine.board;

import chess.engine.pieces.Piece;

public abstract class Move {

    final Board board;
    final Piece movedPiece;
    final int destinationCoordinates;

    private Move(final Board board,
         final Piece movedPiece,
         final int destinationCoordinates) {
        this.board = board;
        this.movedPiece = movedPiece;
        this.destinationCoordinates = destinationCoordinates;
    }

    public static final class MajorMove extends Move{

        public MajorMove(Board board,
                  Piece movedPiece,
                  int destinationCoordinates) {
            super(board, movedPiece, destinationCoordinates);
        }
    }

    public static final class AttackMove extends Move{

        final Piece attackedPiece;

        public AttackMove(Board board,
                   Piece movedPiece,
                   int destinationCoordinates,
                   final Piece attackedPiece) {
            super(board, movedPiece, destinationCoordinates);
            this.attackedPiece = attackedPiece;
        }
    }


}
