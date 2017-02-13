<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<% response.setContentType("application/json"); %>
{
	"response": {
		"result": {
			"Leads": {
				"row": {
					"no": "1",
					"FL": [{
						"content": "1143670000011452553",
						"val": "LEADID"
					}, {
						"content": "1143670000000377178",
						"val": "SMOWNERID"
					}, {
						"content": "Hotcourses Zoho",
						"val": "Lead Owner"
					}, {
						"content": "Uncontactable",
						"val": "Lead Status"
					}, {
						"content": "5230435",
						"val": "Site User ID"
					}]
				}
			}
		},
		"uri": "/crm/private/json/Leads/getRecordById"
	}
}