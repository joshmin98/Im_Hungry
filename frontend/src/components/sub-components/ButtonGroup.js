import React from "react";
import PropTypes from 'prop-types';
import Button from "@material-ui/core/Button"
import {withStyles} from "@material-ui/core/styles";
import FormControl from "@material-ui/core/FormControl";
import NativeSelect from "@material-ui/core/NativeSelect";
import html2canvas from "html2canvas";
import jsPDF from "jspdf";

const styles = theme => ({
    root: {
        flexGrow: 1,
        paddingRight: 30
    },
    button: {
        marginBottom: 10,
        width: '100%'
    },
    dropdown: {
        marginBottom: 10,
        width: '100%'
    },
    form: {
        width: '100%'
    }
})

class ButtonGroup extends React.Component {
    state = {
        value: '',
        open: false
    };
    handleChange = e => {
        this.setState({
            value: e.target.value
        });
    };
    printDocument = () => {
        const id = this.props.passId;
        const input = document.getElementById(id);
        console.log(id);
        html2canvas(input, {width: '800px', height: '1000px', scale: 0.8})
            .then((canvas) => {
                const imgData = canvas.toDataURL('/image/png');
                const pdf = new jsPDF();
                pdf.addImage(imgData, 'JPEG', 0, 0);
                pdf.save("download.pdf");
            });  
    };
    addToList = () => {
        const list = this.state.value;
        if (list === 'Favorites') {
            let input = JSON.parse(localStorage.getItem('Favorites'));
            if (this.props.restaurant) {
                !input.restaurants.includes(this.props.id) && input.restaurants.push(this.props.id);
            } else {
                !input.recipes.includes(this.props.id) && input.recipes.push(this.props.id);
            }
            localStorage.setItem('Favorites', JSON.stringify(input));
        } else if (list === 'To Explore') {
            let input = JSON.parse(localStorage.getItem('To Explore'));
            if (this.props.restaurant) {
                !input.restaurants.includes(this.props.id) && input.restaurants.push(this.props.id);
            } else {
                !input.recipes.includes(this.props.id) && input.recipes.push(this.props.id);
            }
            localStorage.setItem('To Explore', JSON.stringify(input));
        } else if (list === 'Do Not Show') {
            let input = JSON.parse(localStorage.getItem('Do Not Show'));
            if (this.props.restaurant) {
                !input.restaurants.includes(this.props.id) && input.restaurants.push(this.props.id);
            } else {
                !input.recipes.includes(this.props.id) && input.recipes.push(this.props.id);
            }
            localStorage.setItem('Do Not Show', JSON.stringify(input));
        }
        console.log(localStorage);
    }
    handBack = () => {
        this.props.history.push("/search");
    }
    render() {
        const {classes} = this.props;
        return (
            <div className={classes.root}>
                <div>
                    <Button 
                        className={classes.button} 
                        variant="contained"
                        onClick={this.printDocument}
                    >
                        Printable View
                    </Button>
                </div>
                <div><Button className={classes.button} variant="contained" onClick={this.handBack}>Back to Result</Button></div>
                <div>
                    <FormControl className={classes.form}>
                        <NativeSelect
                            value={this.state.value}
                            onChange={this.handleChange}
                            className={classes.dropdown}
                        >
                            <option value="" disabled>
                                
                            </option>
                            <option value={"Favorites"}>Favorites</option>
                            <option value={"To Explore"}>To Explore</option>
                            <option value={"Do Not Show"}>Do Not Show</option>
                        </NativeSelect>
                    </FormControl>
                </div>
                <div><Button className={classes.button} variant="contained" onClick={this.addToList}>Add to List</Button></div>
            </div>
        ); 
    }
}

ButtonGroup.propTypes = {
    classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(ButtonGroup);