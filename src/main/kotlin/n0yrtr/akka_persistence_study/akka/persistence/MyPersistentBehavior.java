package n0yrtr.akka_persistence_study.akka.persistence;
import akka.actor.typed.Behavior;
import akka.persistence.typed.javadsl.CommandHandler;
import akka.persistence.typed.javadsl.EventHandler;
import akka.persistence.typed.javadsl.EventSourcedBehavior;
import akka.persistence.typed.PersistenceId;

/**
 * https://doc.akka.io/docs/akka/current/typed/persistence.html
 * ここを見ながら、とりあえず最初の状態を作成
 */
public class MyPersistentBehavior extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

    interface Command {}

    interface Event {}

    public static class State {}

    public static Behavior<Command> create(PersistenceId persistenceId) {
        return new MyPersistentBehavior(persistenceId);
    }

    private MyPersistentBehavior(PersistenceId persistenceId) {
        super(persistenceId);
    }

    @Override
    public State emptyState() {
        return new State();
    }

    @Override
    public CommandHandler<Command, Event, State> commandHandler() {
        return (state, command) -> {
            throw new RuntimeException("TODO: process the command & return an Effect");
        };
    }

    @Override
    public EventHandler<State, Event> eventHandler() {
        return (state, event) -> {
            throw new RuntimeException("TODO: process the event return the next state");
        };
    }
}
