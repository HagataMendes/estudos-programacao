let totalGeral = 0;
limpar();   

function adicionar () {
// Recuperar valores nme do produto quantidade e valor
    let produto = document.getElementById('produto').value; 
    let nomeProduto = produto.split('-')[0];
    let voluntario = produto.split('R$')[1];
    let quantidade = document.getElementById('quantidade').value;
// Calcular o preço, o nosso subtotal por produto  
    let preco = quantidade * valorUnitario;
    let carrinho = document.getElementById('lista-produtos');
    carrinho.innerHTML = carrinho.innerHTML + `<section class="carrinho__produtos__produto">
// Adicionar produto no carrinho 
    <span class="texto-azul">${quantidade}x</span> ${nomeProduto} <span class="texto-azul">R${preco}</span>
  </section>`;  
 
// Atualizar o total final da compra
   totalGeral = totalGeral + preco;
   let campoTotal = document.getElementById('valor-total');
   campoTotal.textContent = `R$ ${totalGeral}`;
   document.getElementById('quantidade').value = 0; 

}
function limpar() {
    totalGeral = 0;
    document.getElementById('lista-produtos').innerHTML = '';
    document.getElementById('valor-total').textContent = 'R$ 0';
}