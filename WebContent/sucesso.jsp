<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>
	<% 
	   String usuario = (String) request.getAttribute("nome");
	   int numeroConta = (int) request.getAttribute("numeroConta");
	   int creditoFinal = (int) request.getAttribute("saldo");
	   
	   if(request.getAttribute("valorCreditado") == null && request.getAttribute("valorDebitado") == null && request.getAttribute("valorTransferido") == null){
			out.println("<br>" + usuario + " de conta " + numeroConta + " possui saldo de R$ " + creditoFinal); 
		}
	   
	   if(request.getAttribute("valorCreditado") != null){
		int valor = (int) request.getAttribute("valorCreditado");
		out.println("<br>" + usuario + " de conta " + numeroConta + " possui saldo de R$ " + creditoFinal + " depois de credito de R$ " + valor); 
	   }
	   
	   if(request.getAttribute("valorDebitado") != null){
		int valor = (int) request.getAttribute("valorDebitado");
		out.println("<br>" + usuario + " de conta " + numeroConta + " possui saldo de R$ " + creditoFinal + " depois de Debito de R$ " + valor); 
	   }
	   
	   if(request.getAttribute("valorTransferido") != null){
			int valor = (int) request.getAttribute("valorTransferido");
			String usuario2 = (String) request.getAttribute("nome2");
			int numeroConta2 = (int) request.getAttribute("numeroConta2");
			int creditoFinal2 = (int) request.getAttribute("saldo2");
			
			out.println("<br>" + usuario + " de conta " + numeroConta + " possui saldo de R$ " + creditoFinal + " depois de Transferir R$ " + valor); 
			out.println("<br>" + usuario2 + " de conta " + numeroConta2 + " possui saldo de R$ " + creditoFinal2 + " depois de Receber R$ " + valor); 

	   }
	   
		%>
</body>
</html>
