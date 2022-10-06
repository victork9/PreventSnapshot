import { Component } from 'react';
import { NativeModules } from 'react-native';

interface Props {
  activate: boolean;
}

export default class SecurityScreen extends Component<Props> {
  constructor(props) {
    super(props);
    this.changeStatus(props.activate);
  }

  changeStatus(status) {
    if (status ) {
      NativeModules?.FlagSecure?.activate();
    } else {
      NativeModules?.FlagSecure?.deactivate();
    }
  }

  componentWillMount() {
    this.changeStatus(this.props.activate);
  }

  componentWillUnmount() {
    this.changeStatus(!this.props.activate);
  }

  render() {
    return this.props.children || null;
  }
}
