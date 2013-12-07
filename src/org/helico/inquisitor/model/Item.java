package org.helico.inquisitor.model;

/**
 * Created with IntelliJ IDEA.
 * User: Denis
 * Date: 08.12.13
 * Time: 0:57
 * To change this template use File | Settings | File Templates.
 CREATE  TABLE IF NOT EXISTS `item` (
 `id` INT NOT NULL AUTO_INCREMENT ,
 `theme_id` INT NOT NULL ,
 `name` VARCHAR(45) NULL ,
 PRIMARY KEY (`id`) ,
 INDEX `fk_item_theme1_idx` (`theme_id` ASC) ,
 CONSTRAINT `fk_item_theme1`
 FOREIGN KEY (`theme_id` )
 REFERENCES `theme` (`id` )
 ON DELETE NO ACTION
 ON UPDATE NO ACTION)
 ENGINE = InnoDB;

 */
public class Item {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getThemeId() {
        return themeId;
    }

    public void setThemeId(long themeId) {
        this.themeId = themeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(long id, long themeId, String name) {
        this.id = id;
        this.themeId = themeId;
        this.name = name;
    }

    private long id;

    private long themeId;

    private String name;

}
