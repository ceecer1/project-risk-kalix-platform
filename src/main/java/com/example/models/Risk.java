package com.example.models;

import com.example.enums.RiskLevelEnum;
import com.example.enums.RiskStatusEnum;
import com.google.protobuf.util.Timestamps;

/**
 * Belongs to a Project, Belongs to a RiskCategory, Assigned to a User,
 * Linked to MitigationTasks, Linked to ContingencyTasks
 */
public record Risk(String riskId,
                   String title,
                   String description,
                   String probability,
                   String impact,
                   RiskLevelEnum riskLevel,
                   /**
                    * a detailed description of how the risk is planned to be mitigated, including steps, strategies, responsible parties, resources required, and any other relevant information
                    */
                   String mitigationPlan,
                   /**
                    * a detailed description of the steps to be taken, resources to be allocated, and strategies to be implemented in case the risk event becomes a reality. Contingency plans are essentially a form of risk response that helps project teams prepare for and manage adverse situations.
                    *
                    * For example, if a project risk is related to unexpected budget overruns, the contingency plan might include actions like seeking additional funding sources, revising the project scope, identifying cost-cutting measures, or adjusting the project timeline.
                    */
                   String contingencyPlan,
                   RiskStatusEnum status,
                   Timestamps createdAt,
                   Timestamps modifiedAt
) {
}
