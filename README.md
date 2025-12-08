<table>
  <tr>
    <td align="center" width="50%">
      <video src="https://github.com/user-attachments/assets/ce6f5f1a-120c-4fa1-8ae2-bb1a3d1a8070" controls width="100%"/>
      <br>
      <b>Before</b>
    </td>
    <td align="center" width="50%">
      <video src="https://github.com/user-attachments/assets/f4d815b4-498a-43ea-aa79-2b300e46f0d1" controls width="100%"/>
      <br>
      <b>After</b>
    </td>
  </tr>
</table>

 <br> <br> <br> <br>
### Lazy Grid UI Code


    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(uris) { url ->
            Box(
                modifier = Modifier
                    .aspectRatio(1f)                    // Perfect square
                    .clip(RoundedCornerShape(12.dp))    // Rounded corners on the cell
                    .background(Color.LightGray)
                    .clickable { /* optional */ }
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("$url")
                        .crossfade(true) // Optional: nice fade-in effect
                        .build(),
                    contentDescription = "Grid image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()                  // This is the key!
                        .background(Color.LightGray),   // fallback while loading
                    placeholder = rememberAsyncImagePainter(url), // optional: smoother
                   // error = painterResource(R.drawable.ic_error) // optional
                )
            }
        }
    }
```

