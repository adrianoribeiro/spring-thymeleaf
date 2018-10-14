package com.adriano.curso.web.conversor;

import org.springframework.core.convert.converter.Converter;

import com.adriano.curso.domain.TipoSexo;

public class TipoSexoConverter implements Converter<String, TipoSexo> {

    @Override
    public TipoSexo convert(String value) {
        char tipo = value.charAt(0);
        return tipo == TipoSexo.FEMININO.getDesc() ? TipoSexo.FEMININO : TipoSexo.MASCULINO;
    }
}
