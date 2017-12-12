package tech.lapsa.insurance.dao.beans;

import javax.ejb.Stateless;

import com.lapsa.insurance.domain.policy.PolicyRequest;

import tech.lapsa.insurance.dao.PolicyRequestDAO.PolicyRequestDAOLocal;
import tech.lapsa.insurance.dao.PolicyRequestDAO.PolicyRequestDAORemote;

@Stateless
public class PolicyRequestDAOBean
	extends AGeneralInsuranceRequestDAO<PolicyRequest>
	implements PolicyRequestDAOLocal, PolicyRequestDAORemote {

    public PolicyRequestDAOBean() {
	super(PolicyRequest.class);
    }
}
