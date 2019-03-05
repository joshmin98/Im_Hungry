import React from "react";
import PropTypes from "prop-types";
import { withStyles } from '@material-ui/core/styles';


const styles = theme => ({
    root: {
      flexGrow: 1,
      paddingLeft: 30
    },
    header: {
        marginTop: 0,
        fontSize: 50
    },
    hoverText: {
        '&:hover' : {
            cursor: 'pointer'
        }
    }
});
class RestaurantInfo extends React.Component {
    state = {
        name: 'Burger King',
        address: '1103 N Pass Ave, Burbank, CA 91505',
        phone: '818-445-7919',
        website: 'facebook.com'
    };
    openGoogle = () => {
        let link = 'http://maps.google.com/maps?q=' + encodeURIComponent(this.state.address);
        console.log(link);
        window.open(link,'blank');
    }
    openWebsite = () => {
        window.open('https://' + this.state.website, 'blank');
    }
    render() {
        const {classes} = this.props;
        return (
            <div className={classes.root}>
                <h1 className={classes.header}>{this.state.name}</h1>
                <p><strong>Address:</strong> <span onClick={this.openGoogle} className={classes.hoverText}>{this.state.address}</span></p>
                <p><strong>Phone Number: </strong>{this.state.phone}</p>
                <p><strong>Website: </strong> <span onClick={this.openWebsite} className={classes.hoverText}>{this.state.website}</span></p>
            </div>
        ); 
    }
}

RestaurantInfo.propTypes = {
    classes: PropTypes.object.isRequired,
};
export default withStyles(styles)(RestaurantInfo);