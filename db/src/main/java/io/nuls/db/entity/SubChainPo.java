/**
 * MIT License
 *
 * Copyright (c) 2017-2018 nuls.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.nuls.db.entity;

/**
 * @author Niels
 * @date 2017/11/20
 */
public class SubChainPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.creator_address
     *
     * @mbg.generated
     */
    private String creatorAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.tx_hash
     *
     * @mbg.generated
     */
    private String txHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.g_block_hash
     *
     * @mbg.generated
     */
    private String gBlockHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.g_merkle_hash
     *
     * @mbg.generated
     */
    private String gMerkleHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.g_block
     *
     * @mbg.generated
     */
    private byte[] gBlock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.g_block_header
     *
     * @mbg.generated
     */
    private byte[] gBlockHeader;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_chain.sign
     *
     * @mbg.generated
     */
    private byte[] sign;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.id
     *
     * @return the value of sub_chain.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.id
     *
     * @param id the value for sub_chain.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.creator_address
     *
     * @return the value of sub_chain.creator_address
     *
     * @mbg.generated
     */
    public String getCreatorAddress() {
        return creatorAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.creator_address
     *
     * @param creatorAddress the value for sub_chain.creator_address
     *
     * @mbg.generated
     */
    public void setCreatorAddress(String creatorAddress) {
        this.creatorAddress = creatorAddress == null ? null : creatorAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.tx_hash
     *
     * @return the value of sub_chain.tx_hash
     *
     * @mbg.generated
     */
    public String getTxHash() {
        return txHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.tx_hash
     *
     * @param txHash the value for sub_chain.tx_hash
     *
     * @mbg.generated
     */
    public void setTxHash(String txHash) {
        this.txHash = txHash == null ? null : txHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.g_block_hash
     *
     * @return the value of sub_chain.g_block_hash
     *
     * @mbg.generated
     */
    public String getgBlockHash() {
        return gBlockHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.g_block_hash
     *
     * @param gBlockHash the value for sub_chain.g_block_hash
     *
     * @mbg.generated
     */
    public void setgBlockHash(String gBlockHash) {
        this.gBlockHash = gBlockHash == null ? null : gBlockHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.g_merkle_hash
     *
     * @return the value of sub_chain.g_merkle_hash
     *
     * @mbg.generated
     */
    public String getgMerkleHash() {
        return gMerkleHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.g_merkle_hash
     *
     * @param gMerkleHash the value for sub_chain.g_merkle_hash
     *
     * @mbg.generated
     */
    public void setgMerkleHash(String gMerkleHash) {
        this.gMerkleHash = gMerkleHash == null ? null : gMerkleHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.title
     *
     * @return the value of sub_chain.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.title
     *
     * @param title the value for sub_chain.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.g_block
     *
     * @return the value of sub_chain.g_block
     *
     * @mbg.generated
     */
    public byte[] getgBlock() {
        return gBlock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.g_block
     *
     * @param gBlock the value for sub_chain.g_block
     *
     * @mbg.generated
     */
    public void setgBlock(byte[] gBlock) {
        this.gBlock = gBlock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.g_block_header
     *
     * @return the value of sub_chain.g_block_header
     *
     * @mbg.generated
     */
    public byte[] getgBlockHeader() {
        return gBlockHeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.g_block_header
     *
     * @param gBlockHeader the value for sub_chain.g_block_header
     *
     * @mbg.generated
     */
    public void setgBlockHeader(byte[] gBlockHeader) {
        this.gBlockHeader = gBlockHeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_chain.sign
     *
     * @return the value of sub_chain.sign
     *
     * @mbg.generated
     */
    public byte[] getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_chain.sign
     *
     * @param sign the value for sub_chain.sign
     *
     * @mbg.generated
     */
    public void setSign(byte[] sign) {
        this.sign = sign;
    }
}
