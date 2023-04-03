package com.cygnustics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cygnustics.model.Form_Initiation;
import com.cygnustics.model.Root_Cause_Analysis;
import com.cygnustics.repository.Form_Initiation_Repository;
import com.cygnustics.repository.Root_Cause_Analysis_Repository;
import com.cygnustics.response.Form_Initiation_Response;
import com.cygnustics.response.ResponseData;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class Form_Initiation_Service {

	@Autowired
	Form_Initiation_Repository form_Initiation_Repository;

	@Autowired
	Root_Cause_Analysis_Repository root_Cause_Analysis_Repository;

	@Value("${file.upload-dir}")
	private String fileUploadPath;

	public Form_Initiation_Response processInitiationData(Form_Initiation form_Initiation) throws Exception {
		Form_Initiation_Response response = new Form_Initiation_Response();
		ResponseData responseData = new ResponseData();
		try {
			Form_Initiation formData = form_Initiation_Repository.save(form_Initiation);

			response.setFormInitiationId(formData.getFormId());
			response.setResponseMessage("Data Saved");
			responseData.setResponseCode("200");
			responseData.setResponseDesc("Success Response");
			response.setResponseData(responseData);
			return response;
		} catch (Exception e) {
			response.setResponseMessage("Error");
			responseData.setResponseCode("400");
			responseData.setResponseDesc("Error Response:- " + e.getMessage());
			response.setResponseData(responseData);
			return response;
		}
	}

	public Form_Initiation_Response processRootCauseAnalysis(Root_Cause_Analysis root_Cause_Analysis) throws Exception {
		Form_Initiation_Response response = new Form_Initiation_Response();
		ResponseData responseData = new ResponseData();
		try {
			// save root cause analysis data
			Root_Cause_Analysis rootData = root_Cause_Analysis_Repository.save(root_Cause_Analysis);

			response.setFormInitiationId(rootData.getFormId());
			response.setResponseMessage("Data Saved");
			responseData.setResponseCode("200");
			responseData.setResponseDesc("Success Response");
			response.setResponseData(responseData);
			return response;

		} catch (Exception e) {
			response.setResponseMessage("Error");
			responseData.setResponseCode("400");
			responseData.setResponseDesc("Error Response:- " + e.getMessage());
			response.setResponseData(responseData);
			return response;
		}

	}

	public Form_Initiation_Response saveFile(MultipartFile multipartFile, long formId) throws IOException {
		Form_Initiation_Response response = new Form_Initiation_Response();
		ResponseData responseData = new ResponseData();

		Path uploadPath = Paths.get(fileUploadPath);
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}

		// String fileCode = RandomStringUtils.randomAlphanumeric(8);

		try (InputStream inputStream = multipartFile.getInputStream()) {
			Path filePath = uploadPath.resolve(formId + "_" + fileName);
			Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);

			response.setFormInitiationId(formId);
			response.setResponseMessage("File Saved");
			responseData.setResponseCode("200");
			responseData.setResponseDesc("Success Response");
			response.setResponseData(responseData);
			return response;
		} catch (IOException e) {
			response.setResponseMessage("Error");
			responseData.setResponseCode("400");
			responseData.setResponseDesc("Error Response:- " + e.getMessage());
			response.setResponseData(responseData);
			return response;
		}
	}

}
