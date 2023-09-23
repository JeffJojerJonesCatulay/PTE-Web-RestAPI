package PTE.WEB_RESTAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PTE.WEB_RESTAPI.entity.Elements;
import PTE.WEB_RESTAPI.responseHandler.Response;
import PTE.WEB_RESTAPI.service.ElementsService;


/**
 * @author Jeff Catulay
 * @category Rest Controller
 * @version 1.0.0
 */
@CrossOrigin
@RestController
@RequestMapping("/api/v1.0.0/pte")
public class ElementsController {

	@Autowired
	private ElementsService elementsService;
	
	@GetMapping
	public ResponseEntity<Object> getInitialDataAll(){
		List<Elements> initialData = elementsService.getAllElements();
		return Response.generateResponse("Success", HttpStatus.OK, initialData);
	}
	
}
