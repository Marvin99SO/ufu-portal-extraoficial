import { Link } from 'react-router-dom';
import logoIcon from '../images/novo_logo.svg';
import userLoginIcon from '../images/header-user.svg';
import userLoginimageselected from '../images/header-user-selected.svg'; 
import './Navbar.css';

function Navbar() {
  return (
        <>
          <nav className="navbar">
              <div className="navbar-container">
                  
                  <Link to="/" className="navbar-logo">
                    <div className='navbar-logo-img-container'>
                        {/* <figure> */}
                            <img src={logoIcon} alt="Logo do Portal UFU" className='navbar-logo-img' />
                            {/* <div className='navbar-div-logo-img'></div> */}
                        {/* </figure> */}
                      </div>
                  </Link>

                  <ul className='nav-menu active'>

                    <li className='nav-item'>
                      <Link to='/' className='nav-links'>
                        HOME
                      </Link>
                    </li>

                    <li className='nav-item'>
                      <Link to='/' className='nav-links'>
                        NOTÍCIAS
                      </Link>
                    </li>

                    <li className='nav-item'>
                      <Link to='/' className='nav-links'>
                        VAGAS
                      </Link>
                    </li>

                    <li className='nav-item'>
                      <Link to='/' className='nav-links'>
                        CLASSIFICADOS
                      </Link>
                    </li>

                    <li className='nav-item'>
                      <Link to='/' className='nav-links'>
                        PROJETOS
                      </Link>
                    </li>

                  </ul>

                    <Link to="/">
                      <div className='nav-logBut'>
                        <div className='nav-log-icon'></div>
                        {/* <img className='pri' src={userLoginIcon} alt="Login" />
                        <img className='seg' src={userLoginimageselected} alt="Login" /> */}
                      </div>
                    </Link>
              </div>
          </nav>
        </>
  );
}

export default Navbar;
