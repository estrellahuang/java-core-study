package io.github.estrellahuang.lambda;

/**
 * 动漫实体类
 * @author Huang Yuxin
 * @date 2019-07-16
 */
public class Animation {

    private Long id;
    private String name;
    private String protagonist;

    public Animation(Long id, String name, String protagonist) {
        this.id = id;
        this.name = name;
        this.protagonist = protagonist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }
}
