package br.com.supera.game.store.controller;

import br.com.supera.game.store.model.Produto;
import br.com.supera.game.store.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class CarrinhoController {

    @Value("${server.url}")
    public String serverUrl;

    @Value("${server.port}")
    public String serverPort;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/")
    public String carrinho(Model model) {
        model.addAttribute("serverUrl", serverUrl);
        model.addAttribute("serverPort", serverPort);
        return "carrinho";
    }

    @RequestMapping(value = "/salvarprodutos", method = RequestMethod.GET)
    public String form() {
        return "produtos";
    }

    @RequestMapping(value = "/salvarprodutos", method = RequestMethod.POST)
    public String Enviarprodutos(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/produtos";
    }


    @RequestMapping("/produtos")
    public ModelAndView listaProdutos() {
        ModelAndView mv = new ModelAndView("carrinho");
        Iterable<Produto> produtos = produtoRepository.findAll();
        mv.addObject("produtos", produtos);
        return mv;
    }


    @Bean
    private ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("classpath:templates/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }


}