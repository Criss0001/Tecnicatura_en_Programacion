function getMonth(num) {
  const months = [
    "Enero",
    "Febrero",
    "Marzo",
    "Abril",
    "Mayo",
    "Junio",
    "Julio",
    "Agosto",
    "Septiembre",
    "Octubre",
    "Noviembre",
    "Diciembre"
  ];

  if (num < 1 || num > 12) {
    return "Número fuera de rango";
  }

  return months[num - 1];
}

console.log("función for-i");
console.log(getMonth(10));
