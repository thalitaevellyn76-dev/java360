const frm = document.querySelector("Form");
const res = document.querySelector("h5");

frm.addEventListener("submit", (e) => { 
  const nome = frm.nome.value
  res.TextContent = 'Alo, ${nome}!'
  e.preventDefault()  
})