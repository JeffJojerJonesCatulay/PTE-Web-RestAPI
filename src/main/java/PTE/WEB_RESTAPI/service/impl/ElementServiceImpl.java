package PTE.WEB_RESTAPI.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PTE.WEB_RESTAPI.entity.Elements;
import PTE.WEB_RESTAPI.repository.ElementsRepository;
import PTE.WEB_RESTAPI.service.ElementsService;


/**
 * @author Jeff Catulay
 * @category Service
 * @version 1.1.0
 */
@Service
public class ElementServiceImpl implements ElementsService{
	
	@Autowired
	private ElementsRepository elementsRepository;

	@Override
	public List<Elements> getAllElements() {
		return elementsRepository.getAllInfo();
	}

	@Override
	public Elements getByElementName(String elementName) {
		return elementsRepository.getAllInfoByElement(elementName);
	}

	@Override
	public Elements getBySymbol(String symbol) {
		return elementsRepository.getAllInfoBySymbol(symbol);
	}

	@Override
	public List<Elements> getByAtomicNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Elements> getByChemicalGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Elements> getByState() {
		// TODO Auto-generated method stub
		return null;
	}

}
