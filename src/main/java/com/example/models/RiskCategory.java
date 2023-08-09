package com.example.models;

import com.google.protobuf.util.Timestamps;

/**
 *     Refers to a classification or grouping of risks based on common
 *     characteristics or attributes. Risk categories are used to organize and categorize
 *     different types of risks that may arise in a project or organizational context.
 *     Predefined categories , allowing users to classify risks and apply appropriate
 *     risk management strategies based on the category of the risk.
 *     Technical Risks: Risks related to software architecture, technology choices, coding practices, etc.
 *     Schedule Risks: Risks related to project timeline, task dependencies, and delays.
 *     Financial Risks: Risks related to budget constraints, funding issues, and resource allocation.
 *     Scope Risks: Risks related to changes in project scope, requirements, and feature creep.
 *     External Risks: Risks arising from external factors like regulatory changes, market shifts, etc.
 */
public record RiskCategory(String categoryId,
                           String name,
                           String description,
                           Timestamps createdAt,
                           Timestamps modifiedAt) {
}
