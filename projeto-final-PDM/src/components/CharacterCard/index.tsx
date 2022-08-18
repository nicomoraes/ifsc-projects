import { IonCard, IonCardContent, IonCardHeader, IonCardSubtitle, IonCardTitle, IonImg } from '@ionic/react';
import React from 'react';

interface Props {
  name?    : string | undefined
  status?  : string | undefined
  species? : string | undefined
  gender?  : string | undefined
  image?   : string | undefined
}

const CharacterCard: React.FC<Props> = ({image, species, name, status, gender}) => {
  return (
    <IonCard>
      <IonImg src={image} />
      <IonCardHeader>
        <IonCardSubtitle>{species}</IonCardSubtitle>
        <IonCardTitle>{name}</IonCardTitle>
      </IonCardHeader>
      <IonCardContent>
        <div>
          <p>Status: {status}</p>
          <p>Gênero: {gender}</p>
        </div>
      </IonCardContent>
    </IonCard>
  )
}

export default CharacterCard;