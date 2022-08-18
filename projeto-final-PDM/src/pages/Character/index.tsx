import { IonHeader, IonItem, IonList, IonPage, IonToolbar } from '@ionic/react';
import { useEffect, useState } from 'react';
import { Link, useLocation } from 'react-router-dom';
import CharacterCard from '../../components/CharacterCard';
import { CharacterModel } from '../../model/character';
import api from '../../service/api';
import { BackButton, Container, Content, Title } from './styles';

const Character: React.FC = () => {
  const location = useLocation();
  const [character, setCharacter] = useState<CharacterModel>();

  useEffect(() => {
    api.get(`${location.pathname}`).then(resp => {
      return setCharacter(resp.data)
    })
  }, []);

  const getEpisodeNumber = (ep: string): string | undefined => {
    return ep.split('/').at(-1)
  }

  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <BackButton />
        </IonToolbar>
      </IonHeader>
      <Content fullscreen>
        <Container>
          <CharacterCard {...character}/>
          <Title>Aparece no</Title>
          <IonList>
            {character && character.episode.map((ep) => {
              return (
                <IonItem>
                  <Link to={`/episode/${getEpisodeNumber(ep)}`} style={{textDecoration: 'none'}}>
                    <span> Episódio {getEpisodeNumber(ep)}</span>
                  </Link>
                </IonItem>
              )
            })}
          </IonList>
        </Container>
      </Content>
    </IonPage>
  );
};

export default Character;
