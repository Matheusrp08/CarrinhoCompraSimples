package br.com.supera.game.store.controller;

import br.com.supera.game.store.model.Produto;
import br.com.supera.game.store.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarrinhoController {

	@Value("${server.url}")
	public String serverUrl;

	@Value("${server.port}")
	public String serverPort;

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	public String carrinho(Model model) {
		model.addAttribute("serverUrl", serverUrl);
		model.addAttribute("serverPort", serverPort);
		return "carrinho";
	}

	@PostMapping("/produtos")
	public String getPostNew() {
		return "produtos";
	}




}