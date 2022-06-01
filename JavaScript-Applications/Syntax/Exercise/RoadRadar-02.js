function speedRestriction(speed, area) {
motorwaySpeed = 130;
interstateSpeed = 90;
citySpeed = 50;
residentialSpeed = 20;

let difference = 0;
let speedLimit = 0;
switch (area) {
    case "motorway":
        speedLimit = motorwaySpeed;
        if (speed > motorwaySpeed) {
            difference = speed - motorwaySpeed;
        }
        break;
        case "interstate":
        speedLimit = interstateSpeed;
        if (speed > interstateSpeed) {
            difference = speed - interstateSpeed;
        }
        break;
        case "city":
        speedLimit = citySpeed;
        if (speed > citySpeed) {
            difference = speed - citySpeed;
        }
        break;
        case "residential":
        speedLimit = residentialSpeed;
        if (speed > residentialSpeed) {
            difference = speed - residentialSpeed;
        }
        break;
}

if (difference != 0) {
    let status = "";
    if (difference <= 20) {
        status = "speeding";
    } else if (difference <= 40) {
        status = "excessive speeding";
    } else {
        status = "reckless driving";
    }
    console.log(`The speed is ${difference} km/h faster than the allowed speed of ${speedLimit} - ${status}`);
} else {
    console.log(`Driving ${speed} km/h in a ${speedLimit} zone`);
}

}
speedRestriction(21, 'residential');