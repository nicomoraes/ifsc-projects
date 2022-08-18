import { IonBackButton, IonContent } from '@ionic/react';
import styled from "styled-components";

export const Content = styled(IonContent)`
  --offset-bottom: auto!important;
  --overflow: hidden;
  overflow: auto;
  &::-webkit-scrollbar {
    display: none;
  }
` 
export const Container = styled.div`
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  background-color: #2d2d2d;
` 
export const Title = styled.h1`
  font-size: 20px;
  text-align: center;
  color: #97ce4c;
` 
export const BackButton = styled(IonBackButton)`
 width: 50px;
`