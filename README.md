<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Peralta&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="simple-styles.css">
    <title>Title</title>
</head>
<body>
    <header class="header">
    <div class="header-logo">
        <img class="header-icon-logo" src="https://img.icons8.com/external-tanah-basah-basic-outline-tanah-basah/96/external-travelling-immigration-tanah-basah-basic-outline-tanah-basah.png" alt="external-travelling-immigration-tanah-basah-basic-outline-tanah-basah"/> 
        <icon class="header-icon">
    </icon>
        <name class="header-name">
            <p class="header-name-text">Travel&Go</p>
        <name/>
    </div>
    <div class="header-products-container">
        <div class="header-products"><p class="header-products-text">LastMinute</p></div>
        <div class="header-products"><p class="header-products-text">Zima2024</p></div>
        <div class="header-products"><p class="header-products-text">Kraje</p></div>
        <div class="header-products"><p class="header-products-text">Hotele</p></div>
        <div class="header-products"><p class="header-products-text">Opinie</p></div>
    </div>
    <div class="header-account">
        <svg class="header-account-icon" width="20" height="20" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" class="sc-aqkpO CvPJc"><path fill-rule="evenodd" clip-rule="evenodd" d="M7.568 15.5C6.115 15.5 5 16.634 5 17.856V21a1 1 0 1 1-2 0v-3.144c0-2.44 2.128-4.356 4.568-4.356h8.864c2.44 0 4.568 1.916 4.568 4.356V21a1 1 0 1 1-2 0v-3.144c0-1.222-1.115-2.356-2.568-2.356H7.568ZM12 4a3 3 0 1 0 0 6 3 3 0 0 0 0-6ZM7 7a5 5 0 1 1 10 0A5 5 0 0 1 7 7Z" fill="#000000"></path></svg>
        <p class="header-account-text">Zaloguj się</p>
    </div>
    </header>
<div class="searching-page1">
<div class="searching-page-container">
    <div class="search-box"></div>
</div>
</div>
    <footer> </footer>
</body>













body{
    position: relative;
    margin: 0;
    font-family: "Peralta", serif;
    font-weight: 400;
    font-style: normal;
}
.header{
    position: fixed;
    width: 100%;
    height: 70px;;
    background-color: #f5b041;
    display: flex;
    align-items: center;
    justify-content: space-between
}
.header-icon-logo{
    height: 90%;
    margin-left: 8px;
}
.header-name{
    align-items: center;
    display: flex;
    position: relative;
    margin-left: 4px;
    padding-right: 4px;
}
.header-name-text{
    font-size: 48px;
}
.header-logo{
    display: flex;
    height: 100%;
    transition: transform 0.3s ease, background-color 0.3s ease;
}
.header-logo:hover{
    background-color: #f39c12;
}
.header-products-container{
    display: flex;
}
.header-products{
    display: flex;
    justify-items: right;
    margin-right:12px;
    transition: transform 0.3s ease, background-color 0.3s ease;
}

.header-products:hover{
    background-color: #f39c12;
    transform: scale(1.05)
}
.header-account{
    height: 50%;
    width: 120px;
    display: flex;
    align-items: center;
    justify-content: center;
    background-color: #ffd643;
    border-radius: 26px;
    margin-right: 10px;
    border: 2px solid #000000;
    transition: transform 0.3s ease, background-color 0.3s ease;
}
.header-account:hover{
    background-color: #f2cb40;
    transform: scale(1.07)
}
.header-account-text{
    font-size: 14px;
}
.header-account-icon{
    margin-right: 4px;
    margin-bottom: 4px;
}
.dWZMIR {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    flex-direction: row;
    padding: 8px 16px 8px 8px;
    background-color: rgb(255, 255, 255);
    border-radius: 4px 4px 4px 0px;
    box-shadow: rgba(20, 20, 20, 0.1) 0px 1px 4px, rgba(61, 61, 61, 0.16) 0px 8px 18px;
    z-index: 1;
}
.search-box{
    display: flex;
    width: 70%;
    height: 100px;
    margin-top: 200px;
    background-color: blue;
}
.searching-page1{
    display: flex;
    justify-content: center;
}
.searching-image{
    display: flex;
}
.searching-page-container{
    display: flex;
    justify-content: center;
    margin-top: 70px;
    width: 100%;
    height: 500px;
    background-image: url(https://media.coraltravel.pl/www/pl/country/65/iStock-836578962-PP-2.jpg);
}









