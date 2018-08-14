$(function(){
    'use strict';

	$(document).on('submit', '#form_voto_negativo', function(e){
		e.preventDefault();
		var dados = $(this).serialize(),
			idcomp = $('a.linkfeedback.article-thumbs-up').data('idcomp');

		$.ajax({
			type: 'POST',
			url: '/articles/grava_fb.php',
			data: dados,
			beforeSend:function(){
				$('#form_voto_negativo > .submit').attr('disabled',true);
				$('#form_voto_negativo > .submit').hide();
				$('#form_voto_negativo > .loading').show();
			},
			success:function(data){
				data = $.parseJSON(data);
				if (data.action != 1) {
					Recaptcha.reload();
					$('#vote-negative-error').html(data.result);
					$('#form_voto_negativo > .submit').attr('disabled',false);
					$('#form_voto_negativo > .submit').show();
					$('#form_voto_negativo > .loading').hide();
				} else {
					$('#form_voto_negativo > .submit').attr('disabled',false);
					$('#form_voto_negativo > .submit').show();
					$('#form_voto_negativo > .loading').hide();
					$('a.linkfeedback.article-thumbs-up').removeClass('article-thumbs-up').addClass('voted').attr('href', '#');
					$('a.linkfeedback.article-thumbs-down').removeClass('article-thumbs-up').addClass('voted').attr('href', '#');
					$('#counterDown, #counterDown_rodape').html('&nbsp;('+data.votes+')');
					$('#box_voto').html('<span id="vote-success">'+data.result+'</span>');
					setTimeout(function(){
						$('#box_voto').hide();
					}, 5000);
					$('#div_feedback_post > span').html('You already gave feedback for this post, thanks.');
					$.ajax({
						type: 'GET',
						url: '/articles/reload_comments.asp',
						data: {idcomp: idcomp},
						success:function(data){
							$('#div_comentarios').html(data);
						},
						error:function(data){
							alert('Error on reload comments.');
						}
					});
				}
			},
			error:function(data){
				$('#form_voto_negativo > .submit').attr('disabled',false);
				$('#form_voto_negativo > .submit').show();
				$('#form_voto_negativo > .loading').hide();
				alert('An error has occurred. Please, try again.');
			}
		});
	});

	$(document).on('click', 'a.linkfeedback.article-thumbs-up', function(e){
		e.preventDefault();
		var idcomp = $(this).data('idcomp');

		$.ajax({
			type: 'GET',
			url: '/articles/grava_fb.php',
			data: {idcomp: idcomp, util: '1'},
			success:function(data){
				data = $.parseJSON(data);
				if (data.action == 1) {
					$('a.linkfeedback.article-thumbs-up').removeClass('article-thumbs-up').addClass('voted').attr('href', '#');
					$('a.linkfeedback.article-thumbs-down').removeClass('article-thumbs-up').addClass('voted').attr('href', '#');
					$('#counterUp, #counterUp_rodape').html(data.votes);
					$('#box_voto').html('<span id="vote-success">'+data.result+'</span>').show();
					$.scrollTo('#box_voto', 600, {
						offset: {
							top: -80
						}
					});
					setTimeout(function(){
						$('#box_voto').hide();
					}, 5000);
					$('#div_feedback_post > span').html('You already gave feedback for this post, thanks.');
				} else {
					alert(data.result);
				}
			},
			error:function(data){
				alert('An error has occurred. Please, try again.');
			}
		});
	});

	$(document).on('click', 'a.linkfeedback.article-thumbs-down', function(e){
		e.preventDefault();
		if ($('#ja_votou').html() == 1) {
			alert('You have already voted for this post, thank you');
		} else {
			$('#box_voto').show();
			$.scrollTo('#box_voto', 600, {
				offset: {
					top: -80
				}
			});
		}
	});

	$(document).on('click', 'a#close_box_voto', function(e){
		e.preventDefault();
		$('#box_voto').hide();
	});

	$(document).on('click', '.box-notification > a.close-box-notification', function(e){
		e.preventDefault();
		$(this).parent().hide();
	});

	$(document).on('click keyup', function(e){
		if ((e.keyCode && e.keyCode == 27) || (!e.keyCode && !$(e.target).closest('.box-notification').length)) {
			$('.box-notification').hide();
		} else {
			e.stopPropagation();
		}
	});

	$(document).on('click', 'a.linkfeedback.voted', function(e){
		e.preventDefault();
		$('#div_feedback_post').show();
		setTimeout(function(){
			$('#div_feedback_post').hide();
		}, 5000);
		e.stopPropagation();
	});

	$(document).on('click', 'a#btnDownload, a#btnSourceCode', function(e){
		e.preventDefault();
		var	tipo = $(this).data('type'),
			show_before = '#before_'+$(this).data('before');
		btnGgAnalytcs(tipo, true);
		if ($(this).hasClass('linkpadrao')) {
			$(show_before).show();
		} else {
			$('#login').show();
			setTimeout(function(){
				$('#login').hide();
			}, 5000);
		}
		e.stopPropagation();
	});

	$(document).on('click', '.box-notification a.gg_analytics', function(){
		var	tipo = $(this).data('type');

		btnGgAnalytcs(tipo, false);
	});

	function btnGgAnalytcs(tipo, msg) {
		var titulo = $('#tituloPage').data('titulo'),
			btn = '',
			action = '';

		if (tipo == 'download' || tipo == 'sourcecode') {
			if (tipo == 'download') {
				btn = 'download_button';
				action = 'down';
			} else if (tipo == 'sourcecode') {
				btn = 'sourcecode_button';
				action = 'down_source';
			}

			if (msg == true) {
				action += '_msg';
			}
			_gaq.push(['_trackEvent', 'site_buttons', btn, '['+action+'] '+titulo]);
		}
	}

});