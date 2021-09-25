package br.com.supera.game.store.controller;

import br.com.supera.game.store.exception.CarrinhoException;
import br.com.supera.game.store.model.Produto;
import br.com.supera.game.store.repository.ProdutoRepository;
import br.com.supera.game.store.rest.Resposta;
import br.com.supera.game.store.service.ProdutoService;
import br.com.supera.game.store.util.Constantes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoRepository produtoRepository;

    Logger logger = LoggerFactory.getLogger(RestProdutoController.class);

    @RequestMapping(path = Constantes.Url.URL_PRODUTO, method = RequestMethod.GET)
    public @ResponseBody
    Resposta consultarTodos() {
        Resposta resposta = new Resposta();
        try {
            resposta.setResposta(produtoService.buscarTodos());
            logger.info("Consultando todos os produtos");
        } catch (CarrinhoException e) {
            resposta.setCodigo(Constantes.Status.CODIGO_ERRO);
            resposta.setMensagem(e.getMensagem());
        }
        return resposta;
    }

    @RequestMapping(path = Constantes.Url.URL_PRODUTO + "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Resposta consultarProdutoPorId(@PathVariable Long id) {
        Resposta resposta = new Resposta();
        try {
            Produto produto = produtoService.buscarProdutoPorId(id);
            resposta.setResposta(produto);
            logger.info(String.format("Consultando produto %s", id));
        } catch (CarrinhoException e) {
            resposta.setCodigo(Constantes.Status.CODIGO_ERRO);
            resposta.setMensagem(e.getMensagem());
        }
        return resposta;
    }

    @RequestMapping(path = Constantes.Url.URL_PRODUTO, method = RequestMethod.POST)
    public @ResponseBody
    Resposta salvarProduto(@RequestBody Produto produto) {
        Resposta resposta = new Resposta();
        try {
            produto.setId(null);
            produtoService.salvarProduto(produto);
            resposta.setResposta(produto);
            logger.info(String.format("Salvando novo produto %s", produto.getNome()));
        } catch (CarrinhoException e) {
            resposta.setCodigo(Constantes.Status.CODIGO_ERRO);
            resposta.setMensagem(e.getMensagem());
        }
        return resposta;
    }

    @RequestMapping(path = Constantes.Url.URL_PRODUTO + "/{id}", method = RequestMethod.PUT)
    public @ResponseBody
    Resposta atualizarProduto(@RequestBody Produto produtoAtualizado, @PathVariable Long id) {
        Resposta resposta = new Resposta();
        try {
            Produto produtoSalvo = produtoService.buscarProdutoPorId(id);
            produtoAtualizado.setId(produtoSalvo.getId());
            Produto produto = produtoService.salvarProduto(produtoAtualizado);
            resposta.setResposta(produto);
            logger.info(String.format("Atualizando produto %s", id));
        } catch (CarrinhoException e) {
            resposta.setCodigo(Constantes.Status.CODIGO_ERRO);
            resposta.setMensagem(e.getMensagem());
        }
        return resposta;
    }

    @RequestMapping(path = Constantes.Url.URL_PRODUTO + "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    Resposta removerProduto(@PathVariable Long id) {
        Resposta resposta = new Resposta();
        try {
            produtoService.removerProduto(id);
            logger.info(String.format("Removendo produto %s", id));
        } catch (CarrinhoException e) {
            resposta.setCodigo(Constantes.Status.CODIGO_ERRO);
            resposta.setMensagem(e.getMensagem());
        }
        return resposta;
    }

}
