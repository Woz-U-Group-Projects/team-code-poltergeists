package net.javaguides.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.DsPump;
import net.javaguides.springboot.repository.DsPumpRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class DsPumpController {

	@Autowired
	private DsPumpRepository dsPumpRepository;
	
	// get all dsPumps
	@GetMapping("/dsPumps")
	public List<DsPump> getAllDsPumps(){
		return dsPumpRepository.findAll();
	}		
	
	// create dsPump rest api
	@PostMapping("/dsPumps")
	public DsPump createDsPump(@RequestBody DsPump dsPump) {
		return dsPumpRepository.save(dsPump);
	}
	
	// get dsPump by id rest api
	@GetMapping("/dsPumps/{id}")
	public ResponseEntity<DsPump> getDsPumpById(@PathVariable Long id) {
		DsPump dsPump = dsPumpRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("DsPump not exist with id :" + id));
		return ResponseEntity.ok(dsPump);
	}
	
	// update dsPump rest api
	
	@PutMapping("/dsPumps/{id}")
	public ResponseEntity<DsPump> updateDsPump(@PathVariable Long id, @RequestBody DsPump dsPumpDetails){
		DsPump dsPump = dsPumpRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("DsPump not exist with id :" + id));
		

		dsPump.setShiftDate(dsPumpDetails.getShiftDate());
		dsPump.setShift(dsPumpDetails.getShift());
		dsPump.setTime(dsPumpDetails.getTime());
		dsPump.setOperator(dsPumpDetails.getOperator());
		dsPump.setRoSuction(dsPumpDetails.getRoSuction());
		dsPump.setHeaderPress(dsPumpDetails.getHeaderPress());
		dsPump.setP07aFlow(dsPumpDetails.getP07aFlow());
		dsPump.setP07bFlow(dsPumpDetails.getP07bFlow());
		dsPump.setP07cFlow(dsPumpDetails.getP07cFlow());
		dsPump.setP07dFlow(dsPumpDetails.getP07dFlow());
		dsPump.setP07eFlow(dsPumpDetails.getP07eFlow());
		dsPump.setP07aPress(dsPumpDetails.getP07aPress());
		dsPump.setP07bPress(dsPumpDetails.getP07bPress());
		dsPump.setP07cPress(dsPumpDetails.getP07cPress());
		dsPump.setP07dPress(dsPumpDetails.getP07dPress());
		dsPump.setP07ePress(dsPumpDetails.getP07ePress());
		dsPump.setAcidPumpDischargePress(dsPumpDetails.getAcidPumpDischargePress());
		dsPump.setHypoPumpDischargePress(dsPumpDetails.getHypoPumpDischargePress());
		dsPump.setWwBoosterSuctionPress(dsPumpDetails.getWwBoosterSuctionPress());
		dsPump.setWwBoosterDischPress(dsPumpDetails.getWwBoosterDischPress());
		dsPump.setP03aPress(dsPumpDetails.getP03aPress());
		dsPump.setP03bPress(dsPumpDetails.getP03bPress());
		dsPump.setP03cPress(dsPumpDetails.getP03cPress());
		dsPump.setDsHeaderPress(dsPumpDetails.getDsHeaderPress());
		dsPump.setDsDischPress(dsPumpDetails.getDsDischPress());
		dsPump.setP09aPress(dsPumpDetails.getP09aPress());
		dsPump.setP09bPress(dsPumpDetails.getP09bPress());
		dsPump.setP09cPress(dsPumpDetails.getP09cPress());
		dsPump.setT14aLevel(dsPumpDetails.getT14aLevel());
		dsPump.setT14bLevel(dsPumpDetails.getT14bLevel());
		dsPump.setF15aPress(dsPumpDetails.getF15aPress());
		dsPump.setF15bPress(dsPumpDetails.getF15bPress());
		dsPump.setF15cPress(dsPumpDetails.getF15cPress());
		dsPump.setF15dPress(dsPumpDetails.getF15dPress());
		dsPump.setCartridgeFilter(dsPumpDetails.getCartridgeFilter());
		dsPump.setCfDiffPress(dsPumpDetails.getCfDiffPress());
		dsPump.setT04Level(dsPumpDetails.getT04Level());
		dsPump.setHypoDayTankLevel(dsPumpDetails.getHypoDayTankLevel());
		dsPump.setRoDischResidual(dsPumpDetails.getRoDischResidual());
		dsPump.setFilterDischResidual(dsPumpDetails.getFilterDischResidual());
		dsPump.setDsResidual(dsPumpDetails.getDsResidual());
		dsPump.setF02aDp(dsPumpDetails.getF02aDp());
		dsPump.setF02bDp(dsPumpDetails.getF02bDp());
		dsPump.setF02cDp(dsPumpDetails.getF02cDp());
		dsPump.setT02aLevel(dsPumpDetails.getT02aLevel());
		dsPump.setT02bLevel(dsPumpDetails.getT02bLevel());
		dsPump.setAs9838(dsPumpDetails.getAs9838());
		dsPump.setCausticLevel(dsPumpDetails.getCausticLevel());
		dsPump.setComments(dsPumpDetails.getComments());
		dsPump.setF02a(dsPumpDetails.getF02a());
		dsPump.setF02b(dsPumpDetails.getF02b());
		dsPump.setF02c(dsPumpDetails.getF02c());
		
		DsPump updatedDsPump = dsPumpRepository.save(dsPump);
		return ResponseEntity.ok(updatedDsPump);
	}
	
	// delete dsPump rest api
	@DeleteMapping("/dsPumps/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteDsPump(@PathVariable Long id){
		DsPump dsPump = dsPumpRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("DsPump not exist with id :" + id));
		
		dsPumpRepository.delete(dsPump);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
