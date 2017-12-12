package tech.lapsa.insurance.dao;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.lapsa.insurance.domain.casco.CascoRequest;

public interface CascoRequestDAO extends GeneralInsuranceRequestDAO<CascoRequest> {

    @Local
    public interface CascoRequestDAOLocal extends CascoRequestDAO {
    }

    @Remote
    public interface CascoRequestDAORemote extends CascoRequestDAO {
    }
}
