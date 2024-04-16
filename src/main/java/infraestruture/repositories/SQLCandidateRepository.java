package infraestruture.repositories;

import domain.Candidate;
import domain.CandidateQuery;
import domain.CandidateRepository;

import java.util.List;
import java.util.Optional;

public class SQLCandidateRepository implements CandidateRepository {
    @Override
    public void save(List<Candidate> candidates) {

    }

    @Override
    public List<Candidate> find(CandidateQuery query) {
        return List.of();
    }

//    @Override
//    public List<Candidate> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public Optional<Candidate> findById(String id) {
//        return Optional.empty();
//    }
}
