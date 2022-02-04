// import React, { useState } from "react";
import "./App.css";
import Navbar from "./components/Navbar.js";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Linkbar from "./components/Linkbar.js";
import Hero from "./components/Hero.js";
import Footer from "./components/Footer.js";
import Cadastrar from "./components/Cadastrar.js";
import Labels from "./components/Labels.js";
import FooterBottom from "./components/FooterBottom";

function App() {
  return (
    <>
      <Router>
        <Linkbar/>
        <Navbar />
        <Hero />
        <Cadastrar />
        <Labels />
        <Footer />
        <FooterBottom />
        <Routes>
          <Route path='/' exact />
        </Routes>
      </Router>
    </>
  );
}

export default App;