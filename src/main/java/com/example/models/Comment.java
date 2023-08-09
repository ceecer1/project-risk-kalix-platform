package com.example.models;

import com.google.protobuf.util.Timestamps;

/**
 * Associated with Risk
 */
public record Comment(String commentId,
                      String userId,
                      /**
                       * The entityId attribute in the Comment model allows it to be associated with
                       * different types of entities beyond just risks and projects.
                       * This provides flexibility to add comments to other entities as needed in the future.
                       */
                      String entityId,
                      String riskId,
                      String content,
                      Timestamps createdAt,
                      Timestamps updatedAt) {
}
