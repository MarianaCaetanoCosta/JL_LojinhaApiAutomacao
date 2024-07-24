package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {

    //Retorna o usuário
    public static UsuarioPojo criarUsuarioAdministrador(){
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin("admin");
        usuario.setUsuarioSenha("admin");

        return usuario;
    }
}
