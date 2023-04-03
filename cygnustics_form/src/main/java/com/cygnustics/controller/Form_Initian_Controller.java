package com.cygnustics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cygnustics.model.Form_Initiation;
import com.cygnustics.model.Root_Cause_Analysis;
import com.cygnustics.response.Form_Initiation_Response;
import com.cygnustics.service.Form_Initiation_Service;

@CrossOrigin
@RestController
public class Form_Initian_Controller {

	@Autowired
	Form_Initiation_Service form_Initiation_Service;

	@PostMapping("/processInitiationData")
	public Form_Initiation_Response processInitiationData(@RequestBody Form_Initiation form_Initiation)
			throws Exception {
		return form_Initiation_Service.processInitiationData(form_Initiation);
	}

	@PostMapping("/rootCauseAnalysis")
	public Form_Initiation_Response processRootCauseAnalysis(@RequestBody Root_Cause_Analysis root_Cause_Analysis)
			throws Exception {
		return form_Initiation_Service.processRootCauseAnalysis(root_Cause_Analysis);
	}

	@PostMapping("/rootCauseAnalysisFileUpload/{id}")
	public Form_Initiation_Response rootCauseAnalysisFileUpload(@RequestParam("file") MultipartFile file,
			@PathVariable("id") long id) throws Exception {

		return form_Initiation_Service.saveFile(file, id);
	}

}
