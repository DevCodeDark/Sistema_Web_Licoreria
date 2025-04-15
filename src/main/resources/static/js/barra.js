document.querySelectorAll('.toggle').forEach(toggle => {
    toggle.addEventListener('click', e => {
      e.preventDefault();
  
      const submenu = toggle.nextElementSibling;
      const arrow = toggle.querySelector('.arrow');
  
      // Cerrar otros
      document.querySelectorAll('.submenu').forEach(s => {
        if (s !== submenu) s.classList.remove('show');
      });
      document.querySelectorAll('.toggle').forEach(t => {
        if (t !== toggle) t.classList.remove('open', 'active');
      });
  
      submenu.classList.toggle('show');
      toggle.classList.toggle('open');
      toggle.classList.toggle('active');
    });
  });
  
  // Sidebar Toggle (Responsive)
  const sidebar = document.getElementById('sidebar');
  const toggleSidebar = document.getElementById('toggleSidebar');
  
  toggleSidebar.addEventListener('click', () => {
    sidebar.classList.toggle('open');
  });
  
  // Cargar íconos Lucide
  lucide.createIcons();
  