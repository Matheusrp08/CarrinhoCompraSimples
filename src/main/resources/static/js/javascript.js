$(document).ready(function(){

$('#select').on('change', function(){
    var selectValor = '#'+$(this).val();

    $('#pai').children('div').hide();
    $('#pai').children(selectValor).show();


});


$(document).ready(function() {
    $('#tabelaproduto').DataTable( {
"language": {
            "lengthMenu": "Mostrando _MENU_ jogos por página",
            "zeroRecords": "Nada encontrado",
            "info": "Mostrando página _PAGE_ de _PAGES_",
            "infoEmpty": "Nenhum registro disponível",
            "infoFiltered": "(filtrando de _MAX_ registros no total)"
        }
    } );
} );

});

