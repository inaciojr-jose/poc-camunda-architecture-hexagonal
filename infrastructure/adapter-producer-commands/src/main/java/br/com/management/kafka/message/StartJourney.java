package br.com.management.kafka.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StartJourney extends DomainEvent {

    private String type;
    private String cpf;
    private String typeDescription;
    private boolean internalUserTask = true;
    private String bpmnInstance;
    private String processInstanceId;
    private String taskId;
    private boolean taskComplete;
    private String activityInstanceId;
    private String currentActivityId;
    private Object infoUserTask;

}
