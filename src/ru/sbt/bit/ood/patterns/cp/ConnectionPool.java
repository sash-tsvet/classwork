package ru.sbt.bit.ood.patterns.cp;

public abstract class ConnectionPool {

    // Public API
    public Connection obtain() {
        // here goes some logic finding a 'free' connection and 'locking' it before returning
        return null;
    }
    public void release(Connection conn) {
        // here the given connection is marked as 'free' in a pool
    }

    // template methods
    protected abstract Connection createConnection();
    protected abstract boolean isAlive(Connection conn);
    protected abstract void closeConnection(Connection conn);
}
