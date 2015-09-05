/* This software is the exclusive property of Argonot.
 * © Argonot.fr 2015 - All rights reserved */

package org.argonot.forge.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <b>Tool</b> stand for the relevant informations about a web application owned by the forge
 * @author Meidi
 *
 */
@Entity
@Table(name="tools")
public class Tool {

    /**
     * Tool unique identifier
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tool", unique = true, nullable = false)
    private long id;

    /**
     * Name of the Tool
     */
    @Column(nullable=false)
    private String name;

    /**
     * Short description of the Tool's purpose
     */
    @Column(name="description", nullable=true)
    private String desc;

    /**
     * The Tool's illustration
     */
    @Column(nullable=false)
    private String urlImage;

    /**
     * The link to reach the Tool
     */
    @Column(nullable=false)
    private String urlTool;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlTool() {
        return urlTool;
    }

    public void setUrlTool(String urlTool) {
        this.urlTool = urlTool;
    }

}
