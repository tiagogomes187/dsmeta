import "./styles.css";
import instagram from '../../assets/img/instagram.svg';
import github from '../../assets/img/github.svg';
import linkedin from '../../assets/img/linkedin.svg';

function Footer() {
    return (
        <footer className="main-footer">
            App desenvolvido durante a 9ª ed. do evento Semana Spring React DevSuperior
            <div className="footer-icons">
                <a href="https://github.com/tiagogomes187" target="_new">
                    <img src={github} alt="Github"/>
                </a>
                <a href="https://www.linkedin.com/in/tiago-gomes187/" target="_new">
                    <img src={linkedin} alt="Linkedin"/>
                </a>
                <a href="https://www.instagram.com/tiago.gomes187" target="_new">
                    <img src={instagram} alt="Instagram"/>
                </a>
            </div>
        </footer>
    );
}

export default Footer;
