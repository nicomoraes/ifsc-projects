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
  height: calc(100vh - 50px);
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background-color: #44281d;
` 
export const Title = styled.h1`
  font-size: 20px;
  text-align: center;
  color: #97ce4c;
` 
export const BackButton = styled(IonBackButton)`
 width: 50px;
`