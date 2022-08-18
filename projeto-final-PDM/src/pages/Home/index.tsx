import { IonButton, IonHeader, IonImg, IonPage, IonTitle, IonToolbar } from '@ionic/react';
import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import logo from '../../img/logo.png';
import { CharacterModel } from '../../model/character';
import api from '../../service/api';
import { Content, Item, List, PaginationSection, Title } from './styles';

import { IoArrowBack, IoArrowForwardOutline } from "react-icons/io5";

const Home: React.FC = () => {
  const [characters, updateChars] = useState<CharacterModel[]>([])
  const [page, updatePage] = useState<number>(0)
  
  useEffect(() => {
    api.get(`/character?page=${page + 1}`)
      .then(resp => {
        return updateChars(resp.data.results)
      })
  }, [page])

  const nextPage = ()=> {
    if(page < 41)
      return <IonButton color={"success"}
      onClick={() => updatePage(page => page + 1)} 
      routerLink={`/home/${page}`}
      routerDirection={"none"}
    >
      Próximo <IoArrowForwardOutline/>
    </IonButton>
  }

  const previousPage = () => {
    if(page >= 1)
      return <IonButton color={"success"}
      onClick={() => updatePage(page => page - 1)} 
      routerLink={`/home/${page}`}
      routerDirection={"none"}
    >
     <IoArrowBack/> Voltar
    </IonButton>
  }

  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Home</IonTitle>
        </IonToolbar>
      </IonHeader>
      <Content fullscreen>
        <Title>Rick and Morty Infos</Title>
        <IonImg src={logo}/>
        <PaginationSection>
          { previousPage() }
          { nextPage() }
        </PaginationSection>
        <List>
          {characters && characters.map((char) => {
            return (
              <Item key={char.id}>
                <Link to={`/character/${char.id}`}>
                  <span>{char.id}</span>
                  <span> {char.name}</span>
                </Link>
              </Item>
            )
          })}
        </List>
      </Content>
    </IonPage>
  );
};

export default Home;
