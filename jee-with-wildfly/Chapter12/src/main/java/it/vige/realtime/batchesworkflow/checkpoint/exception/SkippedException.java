package it.vige.realtime.batchesworkflow.checkpoint.exception;

public class SkippedException extends Exception {

	private static final long serialVersionUID = -5977839964875500639L;

	@Override
	public String getMessage() {
		return "skipped exception";
	}

}
