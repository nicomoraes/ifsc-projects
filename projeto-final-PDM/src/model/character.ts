export interface CharacterModel{ 
  id      : number
  name    : string
  status  : string
  species : string
  type    : string
  gender  : string
  origin  : NameAndLink
  location: NameAndLink
  image   : string
  episode : string[]
  url     : string
  created : string
}

type NameAndLink = {
  name: string,
  url : string
}