import { IonContent, IonItem, IonList } from '@ionic/react';
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
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background-color: #2d2d2d;
` 
export const Title = styled.h1`
  width: 100%;
  font-size: 20px;  
  text-align: center;
  color: #97ce4c;
` 
export const List = styled(IonList)`
 color: #97ce4c;
` 
export const Item = styled(IonItem)`
  span:first-child {
    font-size: 1.2rem;
    color: #e4a788;
  }
  span:nth-child(2) {
    margin-left: 10px;
    color: #97ce4c;
  }
  a {text-decoration: none;}
` 
export const PaginationSection = styled.div`
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
` 