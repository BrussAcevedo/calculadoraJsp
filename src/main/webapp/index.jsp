<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora JSP</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link href="assets/css/styles.css" rel="stylesheet">

</head>
<body class="backgroundColor">
	<section class="Calculadora container  margen">

		<div class="txtBlanco py-4 my-4">
			<h1>Calculadora</h1>
		</div>

		<form id = "formulario1" action="MostrarResultados" method="Post" autocomplete="off">
			<div class="numA py-2">
				<input class="form-control form-control-lg backgroundTransparent"
					type="text" placeholder="Número 1"
					aria-label=".form-control-lg example" name="TxtNumA" required>
			</div>

			<div class="numB py-2">
				<input class="form-control form-control-lg backgroundTransparent"
					type="text" placeholder="Número 2"
					aria-label=".form-control-lg example" name="TxtNumB" required>
			</div>

			<div class="operacion py-2">
				<select class="form-select backgroundTransparent" id="txtDias" name="operacionSelect" required>
					<option value = "" selected disabled>Selecciona la operacion...</option>
					<option value="suma">Suma</option>
					<option value="resta">Resta</option>
					<option value="multiplicacion">Multiplicación</option>
					<option value="division">División</option>
					<option value="ordenarNum">Ordena de Mayor a menor</option>
					<option value="parImpar">Par / Impar</option>
				</select>
			</div>

			<div class="d-grid gap-2 py-1">
				<button type="submit" class="btn btn-info txtBlanco opacidad">Calcular</button>
			</div>

		</form>

		<div class="Resultados pt-5 txtBlanco">
			<%
			String resultado = (String) request.getAttribute("resultado");
			if (resultado != null) {
			%>
			<h2>Resultado:</h2>
			<p>${resultado}</p>

			<%
			}
			%>
		</div>
	</section>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>