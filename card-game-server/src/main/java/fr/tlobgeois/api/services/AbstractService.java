package fr.tlobgeois.api.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService {

    @Autowired
    protected ModelMapper modelMapper;

    protected final <S, D> D dtoConvert(S inputs, Class<D> destinationType) {
	return modelMapper.map(inputs, destinationType);
    }
}
