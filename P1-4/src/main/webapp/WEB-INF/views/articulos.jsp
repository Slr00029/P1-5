<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuario</title>
</head>
<body>

<CENTER>
<table>
<tr>
<th></th>
<th><img src="https://euxshop.com/1654-large_default/womens-balenciaga-speed-mid-sneaker-white.jpg" heigh="75" width="100"></th>
<th><img src="https://www.decathlon.es/media/835/8350877/big_89d304900f4d48f48a2bf431ebb003cd.jpg" heigh="75" width="100"></th>
<th><img src="http://www.castrilruralromero.es/images/category_6/El%20%C3%BAltimo%20dise%C3%B1o%20de%20diversificaci%C3%B3n%20Verde%20Nike%20Zapatilla%20F%C3%BAtbol%20Sala%20Hipervenon%20Verde%20Deportivas%206250938%20Mujer%20Zapatos.jpg" heigh="75" width="100"></th>
<th><img src="https://d243u7pon29hni.cloudfront.net/imagesOnDemand/get?imagePath=/images/products/portatil-hp-255g6-amd-e2-9000e-4-gb-ram-137677401_l.png&width=480&height=480&quality=65&imgType=product" heigh="75" width="100"></th>
<th><img src="https://www.tpvmax.es/395-thickbox_default/ordenador-sobremesa-monitor-19.jpg" heigh="75" width="100"></th>
</tr>
<c:choose>
<c:when test="${ not empty lista2}">
<tr>
<th style="color:#ff0000"> Nombre Artículo </th>
<c:forEach items= "${lista2}" var="list2">
<th><c:out  value="${list2.nombre}"  /></th>
</c:forEach>
</tr>
<tr>
<th style="color:#ff0000"> ID </th>
<c:forEach items= "${lista2}" var="list2">
<th><c:out  value="${list2.id}"  /></th>
</c:forEach>
</tr>
<tr>
<th style="color:#ff0000"> Precio </th>
<c:forEach items= "${lista2}" var="list2">
<th><c:out  value="${list2.precio}"  /></th>
</c:forEach>
</tr>
<tr>
<th style="color:#ff0000"> Pagar ya </th>
<th><form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="6G59AAXCF5CJA">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form>
</th>
<th><form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="NT2PH3EFGNGXE">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form>
</th>
<th><form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="Z3G537P9W3DL6">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form>
</th>
<th><form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="6EDZFA32VSVZQ">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form>
</th>
<th><form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="QLJY2BYXN6Q5S">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form>
</th>
</tr>
<tr>
<th></th>
<th><form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="DM9BTCAJEXAGG">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form> </th>
<th><form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="4UE79F7BYBTHW">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form></th>
<th><form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="AZ8XTC4PMZS4Q">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form></th>
<th><form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="MPLXAD64VKWGU">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form></th>
<th><form target="paypal" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="ELUWHNHPGE2HL">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal, la forma rápida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form></th>
</tr>




</c:when>
</c:choose>
</table>
<h1>Si desea modificar los datos de su usuario: <form action="ajustes" method=get><input type=submit value=Modificar></form></h1>

<br><br><br>
<p><form action="home" method=get><input type=submit value=Inicio></form></p>
</CENTER>
</body>
</html>