package org.stream.web.taglib.model;


import org.stream.web.taglib.ResourceType;

/**
 * 用于加载的资源
 * <p/>
 * User : dongyong.wang@mail-inc.com
 * Date: 12-05-09
 * Time: 下午2:15
 */
public class LoadResource {

    /**
     * 资源的类型
     */
    private final ResourceType type;
    /**
     * 资源的引用地址
     */
    private final String src;
    /**
     * 资源的内容
     */
    private final String text;

    /**
     * @param type
     * @param src
     * @param text
     */
    public LoadResource(ResourceType type, String src, String text) {
        this.type = type;
        this.src = src;
        this.text = text;
    }

    public ResourceType getType() {
        return type;
    }

    public String getSrc() {
        return src;
    }

    public String getText() {
        return text;
    }

}
