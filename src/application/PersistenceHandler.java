package application;

abstract class PersistenceHandler {

	abstract void saveParty(Party p);
	abstract void saveCandidate(Candidate c);

}
