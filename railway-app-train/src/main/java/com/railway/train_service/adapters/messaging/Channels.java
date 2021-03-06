package com.railway.train_service.adapters.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Channels {
	static final String RESERVE_TRAIN = "reserve_train";
	static final String TRAIN_RESERVED = "train_reserved";
	static final String DISCARD_TRAIN_RESERVATION = "discard_train_reservation";
	static final String REQUEST_MAINTENANCE = "request_maintenance";
	static final String CHANGE_TRAIN_STATUS = "change_train_status";
	static final String NOTIFY_EMERGENCY_SERVICES = "notify_emergency_services";
	static final String NOTIFY_ACCIDENT = "notify_accident";
	static final String NOTIFY_TRAIN_OUT_OF_SERVICE = "notify_train_out_of_service";

	@Input(RESERVE_TRAIN)
	SubscribableChannel reserveTrain();
	
	@Input(DISCARD_TRAIN_RESERVATION)
	SubscribableChannel discardTrainReservation();
	
	@Output(TRAIN_RESERVED)
	MessageChannel trainReserved();
	
	@Output(REQUEST_MAINTENANCE)
	MessageChannel requestMaintenance();
	
	@Input(CHANGE_TRAIN_STATUS)
	SubscribableChannel changeTrainStatus();

	@Output(NOTIFY_EMERGENCY_SERVICES)
	MessageChannel notifyEmergencyServices();
	
	@Output(NOTIFY_ACCIDENT)
	MessageChannel notifyAccident();

	@Output(NOTIFY_TRAIN_OUT_OF_SERVICE)
	MessageChannel notifyTrainOutOfService();
}
