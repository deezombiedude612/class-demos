<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') :
?>
<table>
	<tr>
		<th>Field</th>
		<th>Value</th>
	</tr>
	<tr>
		<td>Name</td>
		<td><?= $_POST['fullname']; ?></td>
	</tr>
	<tr>
		<td>E-mail</td>
		<td><?= $_POST['email']; ?></td>
	</tr>
</table>
<?php
else :
	// header() redirects users to a different page.
	header('Location: post-form.html');
endif;
