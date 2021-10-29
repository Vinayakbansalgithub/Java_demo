package DesignPattern;

public class Radis {

}
//Redis is an open-source, in-memory data structure store, used as a database, cache, and message broker.
//Redis provides data structures such as strings, hashes, lists, sets, sorted sets with range queries, 
//bitmaps, hyperloglogs, geospatial indexes, and streams. Redis has built-in replication, Lua scripting, LRU eviction, transactions, 
//and different levels of on-disk persistence, and provides high availability via Redis Sentinel and 
//automatic partitioning with Redis Cluster
//
//So Redis can be used as a traditional monolithic and can be used as distributed system as a cluster of nodes with sharding.
//
//
//All Redis data resides in the server’s main memory, in contrast to databases such as PostgreSQL, SQL Server,
//
//The result is — blazing fast performance with average read or writes operations taking less than a millisecond
//and support for millions of operations per second.
//
//
//from the CAP theorem perspective Redis is neither highly available nor consistent. 
//to understand why let's explain how Redis sync the data from memory to disk as the disk can consider consistency.
//
//RDB (Redis Database): The RDB persistence performs point-in-time snapshots of your dataset at specified intervals
//RDB is a very compact single-file point-in-time representation of your Redis data. RDB files are perfect for backups.
//By default Redis saves snapshots of the dataset on disk, in a binary file called dump.rdb. You can configure Redis to have it 
//save the dataset every N seconds if there are at least M changes in the dataset
//
//Redis Cluster provides a way to run a Redis installation where data is automatically sharded across multiple Redis nodes.
//Redis Cluster also provides some degree of availability during partitions
//Redis Cluster does not use consistent hashing,
//
//Redis Cluster consistency guarantees?
//
//Consistency is always very important but as we explained Redis can not guarantee consistency also Redis Cluster is not able to guarantee strong consistency. 
//
//The first reason why Redis Cluster can lose writes is that it uses asynchronous replication. 