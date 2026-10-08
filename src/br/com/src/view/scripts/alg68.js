const frm = document.querySelector("form")


frm.addEventListener("submit",(e) =>{
    const nomeFilme = frm.filme.value
    alert(`o filme escolhido foi: ${nomeFilme}`)

    //receber o tempo em minutos e converter para horas e minutos
    const tempo = Number(frm.tempo.value)
    const horas = Math.floor(tempo / 60)
    const minutos =  tempo % 60
    alert (`o filme tem ${horas} hora*(s) e ${minutos} ,minuto(s) de duracao.`)
    e.preventDefault()
})