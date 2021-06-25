import React from 'react';
import ReactDOM from 'react-dom';
import { Button } from "./Button";

export class Random extends React.Component {
  constructor(props){
    super(props);
    this.state = { color: [255, 0, 253] };
      this.handleClick = this.handleClick.bind(this); 

  }
  componentDidMount() {
    this.applyColor();
  }

  componentDidUpdate(prevProps, prevState) {
    this.applyColor();
  }

  formatColor(ary) {
    return 'rgb(' + ary.join(', ') + ')';
  }

  isLight() {
    const rgb = this.state.color;
    return rgb.reduce((a,b) => a+b) < 127 * 3;
  }

  applyColor() {
    const color = this.formatColor(this.state.color);
    document.body.style.background = color;
  }

  chooseColor() {
    const random = [];
    for (let i = 0; i < 3; i++) {
      random.push(Math.floor(Math.random()*256));
    }
    return random;
  }
  //Ser till att Button ändra färger genom att använda en event 
  handleClick() {
  this.setState({
    color: this.chooseColor()
  });
}

  render() {
    return (
      <div className="center">
        <h1 className={this.isLight() ? 'white' : 'black'}>
          Your color is {this.formatColor(this.state.color)}
        </h1>
        <Button onClick={this.handleClick}/>
      </div>
    );
  }
}

/**ReactDOM.render(
  <Random />, 
  document.getElementById('app')
);**/