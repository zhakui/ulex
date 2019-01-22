package com.zhkui.ulex.registry;

public abstract class AbstractRegistryService implements RegistryService{

    private RegistryEntity registryEntity;

    /**
     * @return RegistryEntity return the registryEntity
     */
    public RegistryEntity getRegistryEntity() {
        return registryEntity;
    }

    /**
     * @param registryEntity the registryEntity to set
     */
    public void setRegistryEntity(RegistryEntity registryEntity) {
        this.registryEntity = registryEntity;
    }
}