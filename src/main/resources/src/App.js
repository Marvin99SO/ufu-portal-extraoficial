// import React, { useState } from "react";
import "./App.css";
import Navbar from "./components/Navbar";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Linkbar from "./components/Linkbar";
import Hero from "./components/Hero";
import Footer from "./components/Footer";
import Cadastrar from "./components/Cadastrar";
import Labels from "./components/Labels";
import FooterBottom from "./components/FooterBottom";
import Home from "./components/pages/Home";
import Noticias from "./components/pages/Noticias";
import Vagas from "./components/pages/Vagas";
import Classificados from "./components/pages/Classificados";
import Projetos from "./components/pages/Projetos";
import Login from "./components/pages/Login";
import Signin from "./components/pages/Signin";
import RecuperarSenha from "./components/pages/RecuperarSenha";
import PainelUser from "./components/pages/PainelDoUsuario";

function App() {
  return (
    <>
      <Router>
        <Linkbar/>
        <Navbar />
        {/* <Hero />
        <Cadastrar />
        <Labels /> */}
        <Routes>
          <Route exact path='/' element={<Home />} />
          <Route exact path='/noticias' element={<Noticias />} />
          <Route exact path='/vagas' element={<Vagas />} />
          <Route exact path='/classificados' element={<Classificados />} />
          <Route exact path='/projetos' element={<Projetos />} />
          <Route exact path='/login' element={<Login />} />
          <Route exact path='/signin' element={<Signin />} />
          <Route exact path='/recuperarsenha' element={<RecuperarSenha />} />
          <Route exact path='/paineluser' element={<PainelUser />} />
        </Routes>
        <Footer />
        <FooterBottom />
      </Router>
    </>
  );
}

export default App;