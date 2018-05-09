package io.nuls.protocol.constant;

import io.nuls.kernel.constant.NulsConstant;

/**
 * 协议相关的常量和一些通用的常量定义在这里
 * The relevant constants of the protocol and some general constants are defined here.
 *
 * @author: Niels Wang
 * @date: 2018/4/17
 */
public interface ProtocolConstant extends NulsConstant {
    /**
     * 出块间隔时间（秒）
     * Block interval time.
     * unit:second
     */
    long BLOCK_TIME_INTERVAL_SECOND = 10;

    /**
     * 出块间隔时间（毫秒）
     * Block interval time.
     * unit:millis
     */
    long BLOCK_TIME_INTERVAL_MILLIS = BLOCK_TIME_INTERVAL_SECOND * 1000L;

    /**
     * 协议模块节点id
     * module id of the protocol module
     */
    short MODULE_ID_PROTOCOL = 3;

    /**
     * 系统运行的最小连接节点数量
     * The number of minimum connection nodes that the system runs.
     */
    int ALIVE_MIN_NODE_COUNT = 2;

    /**
     * 最大区块大小（不包含区块头）
     * Maximum block size (excluding block headers)
     */
    long MAX_BLOCK_SIZE = 2 << 21;

    /**
     * 协议模块的所有消息类型定义
     * All message type definitions for the protocol module.
     * =======================================================================
     */
    /**
     * "数据找不到应"答消息的类型
     * The data cannot find the type of answer.
     */
    short MESSAGE_TYPE_NOT_FOUND = 1;
    /**
     * 新交易发送及转发的消息类型
     * The type of message that the new transaction sends and forwards.
     */
    short MESSAGE_TYPE_NEW_TX = 2;
    /**
     * 获取区块的消息的类型
     * Gets the type of message for the block.
     */
    short MESSAGE_TYPE_GET_BLOCK = 3;
    /**
     * 发送区块的消息的类型
     * The type of message to send the block.
     */
    short MESSAGE_TYPE_BLOCK = 4;
    /**
     * 获取区块头的消息的类型
     * Gets the type of message for the block-header.
     */
    short MESSAGE_TYPE_GET_BLOCK_HEADER = 5;
    /**
     * 发送区块头的消息的类型
     * The type of message to send the block-header.
     */
    short MESSAGE_TYPE_BLOCK_HEADER = 6;
    /**
     * 获取交易或交易列表的消息的类型
     * Gets the type of message for the transactions.
     */
    short MESSAGE_TYPE_GET_TX_GROUP = 7;
    /**
     * 发送区块头的消息的类型
     * The type of message to send the transactions.
     */
    short MESSAGE_TYPE_TX_GROUP = 8;
    /**
     * 新区块发送及转发的消息类型
     * The type of message that the new SmallBlock sends and forwards.
     */
    short MESSAGE_TYPE_NEW_BLOCK = 9;
    /**
     * 获取区块hash或hash列表的消息的类型
     * Gets the type of message for the Blocks hashes.
     */
    short MESSAGE_TYPE_GET_BLOCKS_HASH = 10;
    /**
     * 发送区块hash的消息的类型
     * The type of message to send the Blocks hashes.
     */
    short MESSAGE_TYPE_BLOCKS_HASH = 11;
    /**
     * 发送字符串给对等节点的消息的类型
     * The type of message that is sent to a peer.
     */
    short MESSAGE_TYPE_STRING = 12;
}
