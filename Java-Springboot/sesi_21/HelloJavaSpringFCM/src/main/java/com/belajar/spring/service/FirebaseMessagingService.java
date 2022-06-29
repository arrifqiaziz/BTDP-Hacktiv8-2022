package com.belajar.spring.service;

import org.springframework.stereotype.Service;

import com.belajar.spring.entity.Note;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;

@Service
public class FirebaseMessagingService {

	private final FirebaseMessaging firebaseMessaging;

	public FirebaseMessagingService(FirebaseMessaging firebaseMessaging) {
		this.firebaseMessaging = firebaseMessaging;
	}

	public String sendNotification(Note note, String topic) throws FirebaseMessagingException {

		Notification notification = Notification.builder().setTitle(note.getSubject()).setBody(note.getContent())
				.setImage(note.getImage()).build();

		Message message = Message.builder().setTopic(topic).setNotification(notification).putAllData(note.getData())
				.build();

		return firebaseMessaging.send(message);
	}

}
