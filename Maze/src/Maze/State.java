package Maze;

public class State {
	public int row;
	public int column;
	public int heuristic;
	public String symbol;
	
	public State(int row, int column, String symbol) {
		this.row = row;
		this.column = column;
		this.symbol = symbol;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getHeuristic() {
		return heuristic;
	}
	public void setHeuristic(int heuristic) {
		this.heuristic = heuristic;
	}
	public int heuristics(State start, State end) {
		return Math.abs(this.row - start.row) + Math.abs(this.column - start.column) + Math.abs(this.row - end.row) + Math.abs(this.column - end.column);
	}
}
