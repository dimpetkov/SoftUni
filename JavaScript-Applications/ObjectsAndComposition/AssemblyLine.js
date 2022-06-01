function createAssemblyLine() {
    return {
        hasClima: (car) => {
            car.temp = 21;
            car.tempSettings = 21;
            car.adjustTemp = () => {
                if (car.temp < car.tempSettings) {
                    car.temp++;
                } else if (car.temp < car.tempSettings) {
                    car.temp--;
                }
            }
        },
        hasAudio: (car) => {
            car.currentTrack = {name: '', artist: ''};
            car.nowPlaying = () => {
                if (currentTrack != null) {
                    console.log(`Now playing ${car.currentTrack.name} by ${car.currentTrack.artist}`);
                }
            };
        },
        hasParktronic: (car) => {
            car.checkDistance = (distance) => {
                if (distance < 0.1) {
                    console.log('Weep!Weep!Weep!');
                } else if (distance >= 0.1 && distance < 0.5) {
                    console.log('Weep!')
                } else {
                    console.log('');
                }
            };
        }
    };
}