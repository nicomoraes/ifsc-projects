import { IonCard, IonCardContent, IonCardHeader, IonCardSubtitle, IonCardTitle, IonHeader, IonPage, IonToolbar } from '@ionic/react';
import { useEffect, useState } from 'react';
import { useLocation } from 'react-router-dom';
import { EpisodeModel } from '../../model/episode';
import api from '../../service/api';
import { BackButton, Container, Content } from './styles';

const Episode: React.FC = () => {
  const location = useLocation();
  const [episode, setEpisode] = useState<EpisodeModel>();

  useEffect(() => {
    api.get(`${location.pathname}`).then(resp => {
      return setEpisode(resp.data)
    })
  }, []);

  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <BackButton />
        </IonToolbar>
      </IonHeader>
      <Content fullscreen>
        <Container>
          <IonCard >
            <IonCardHeader>
              <IonCardSubtitle>{episode?.episode}</IonCardSubtitle>
              <IonCardTitle>{episode?.name}</IonCardTitle>
            </IonCardHeader>
            <IonCardContent>
              <div>
                <p>Lançamento: {episode?.air_date}</p>
              </div>
            </IonCardContent>
          </IonCard>
        </Container>
      </Content>
    </IonPage>
  );
};

export default Episode;
