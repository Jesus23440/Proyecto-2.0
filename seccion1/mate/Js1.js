document.addEventListener("DOMContentLoaded", function() {
    const toggleMenu = document.querySelector('.toggle-menu');
    const menuList = document.querySelector('.menu-list');

    toggleMenu.addEventListener('click', function() {
        menuList.style.display = menuList.style.display === 'block' ? 'none' : 'block';
    });
});
