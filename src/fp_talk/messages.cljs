(ns fp-talk.messages)

(defrecord ChangeEventName [name])

(defrecord ChangeEventSpeaker [speaker])

(defrecord CreateEvent [event])

(defrecord SearchResults [body])
