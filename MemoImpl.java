package ch.zli.m223.marlon.RestBest.model;

public class MemoImpl implements Memo{
	
	String note;
	Long id;
	
	protected MemoImpl() {}
	public MemoImpl(String note) {
		this.note = note;
		
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getNote() {
		return note;
	}

}
