Action()
{

	web_url("gts1c3.der", 
		"URL=http://pki.goog/repo/certs/gts1c3.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t1.inf", 
		LAST);

	web_url("gtsr1.der", 
		"URL=http://pki.goog/repo/certs/gtsr1.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t2.inf", 
		LAST);

	web_url("gts1c3.der_2", 
		"URL=http://pki.goog/repo/certs/gts1c3.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t3.inf", 
		LAST);

	web_url("gtsr1.der_2", 
		"URL=http://pki.goog/repo/certs/gtsr1.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t4.inf", 
		LAST);

	web_url("gts1c3.der_3", 
		"URL=http://pki.goog/repo/certs/gts1c3.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t5.inf", 
		LAST);

	web_url("gtsr1.der_3", 
		"URL=http://pki.goog/repo/certs/gtsr1.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t6.inf", 
		LAST);

	web_url("r2m01.cer", 
		"URL=http://crt.r2m01.amazontrust.com/r2m01.cer", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t7.inf", 
		LAST);

	lr_think_time(13);

	web_url("rootca1.cer", 
		"URL=http://crt.rootca1.amazontrust.com/rootca1.cer", 
		"Resource=1", 
		"RecContentType=binary/octet-stream", 
		"Referer=", 
		"Snapshot=t8.inf", 
		LAST);

	lr_think_time(7);

	web_url("rootg2.cer", 
		"URL=http://crt.rootg2.amazontrust.com/rootg2.cer", 
		"Resource=1", 
		"RecContentType=binary/octet-stream", 
		"Referer=", 
		"Snapshot=t9.inf", 
		LAST);

	lr_think_time(5);

	web_url("r2m03.cer", 
		"URL=http://crt.r2m03.amazontrust.com/r2m03.cer", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t10.inf", 
		LAST);

	lr_think_time(4);

	web_url("x.cer", 
		"URL=http://x.ss2.us/x.cer", 
		"Resource=1", 
		"RecContentType=binary/octet-stream", 
		"Referer=", 
		"Snapshot=t11.inf", 
		LAST);

	lr_think_time(7);

	web_url("McAfeeRSAOrganizationValidationSecureServerCA3.crt", 
		"URL=http://crt.sectigo.com/McAfeeRSAOrganizationValidationSecureServerCA3.crt", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t12.inf", 
		LAST);

	lr_think_time(11);

	web_url("gts1c3.der_5", 
		"URL=http://pki.goog/repo/certs/gts1c3.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t15.inf", 
		LAST);

	web_url("gtsr1.der_4", 
		"URL=http://pki.goog/repo/certs/gtsr1.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t16.inf", 
		LAST);

	lr_think_time(5);

	web_url("gts1c3.der_6", 
		"URL=http://pki.goog/repo/certs/gts1c3.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t17.inf", 
		LAST);

	web_url("DigiCertTLSRSASHA2562020CA1-1.crt", 
		"URL=http://cacerts.digicert.com/DigiCertTLSRSASHA2562020CA1-1.crt", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t18.inf", 
		LAST);

	web_url("DigiCertGlobalCAG2.crt", 
		"URL=http://cacerts.digicert.com/DigiCertGlobalCAG2.crt", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t19.inf", 
		LAST);

	web_url("gtsr1.der_5", 
		"URL=http://pki.goog/repo/certs/gtsr1.der", 
		"Resource=1", 
		"RecContentType=application/pkix-cert", 
		"Referer=", 
		"Snapshot=t20.inf", 
		LAST);

	web_url("DigiCertGlobalRootCA.crt", 
		"URL=http://cacerts.digicert.com/DigiCertGlobalRootCA.crt", 
		"Resource=1", 
		"Referer=", 
		"Snapshot=t22.inf", 
		LAST);

	return 0;
}