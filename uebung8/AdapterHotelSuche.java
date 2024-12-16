package exercises.uebung8;

public class AdapterHotelSuche implements ReiseAnbierter {

	private ReiseAnbierter anbierter;
	
	@Override
	public QueryResult executeQuery(QueryObject query) {
		return null;
	}
	
	public SuchErgebnis suche(SuchAuftrag auftrag) {
		return null;
	}
	
	private QueryObject transformToQuery(SuchAuftrag auftrag) {
		return null;
	}
	
	private SuchErgebnis transformToSuchErgebnis(QueryResult result) {
		return null;
	}
	

}
