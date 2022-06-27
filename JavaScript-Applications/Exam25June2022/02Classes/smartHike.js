class SmartHike {
    constructor(username) {
        this.username = username;
        this.goals = []
        this.listOfHikes = [];
        this.resources = 100;
    }

   addGoal (peak, altitude) {
    let peakName = this.goals.some(x => x.peak == peak)
    if(peakName) {
        return `${peak} has already been added to your goals`
    } else {
        let newGoal = {
            peak,
            altitude
        }
        this.goals.push(newGoal)
        return `You have successfully added a new goal - ${peak}`
    }
   }

   hike (peak, time, difficultyLevel) {
    let peakName = this.goals.some(x => x.peak == peak)
    if(!peakName) {
        throw new Error(`${peak} is not in your current goals`)
    } else if(this.resources == 0) {
        throw new Error(`You don't have enough resources to start the hike`)
    } else {
        let difference = this.resources - time * 10
        if(difference < 0) {
            return 'You don\'t have enough resources to complete the hike'
        } else {
            this.resources = difference
            let goalAchieved = {
                peak,
                time,
                difficultyLevel
            };
            this.listOfHikes.push(goalAchieved);
            return `You hiked ${peak} peak for ${time} hours and you have ${this.resources}% resources left`
        }
    }
   
   }
    
   rest (time) {
    let bonusTime = Number(time * 10);
    if((bonusTime + this.resources)  >= 100){
        return 'Your resources are fully recharged. Time for hiking!'
    } else {
        this.resources += Number(bonusTime);
        return `You have rested for ${time} hours and gained ${bonusTime}% resources`
    }
   }

   showRecord (criteria) {
    if(this.listOfHikes.length == 0) {
        return `${this.username} has not done any hiking yet`
    }
    let result = []
    if(criteria == 'hard') {
        let isFound = this.listOfHikes.some(x => x.difficultyLevel == 'hard')
        if(!isFound) {
            result.push(`${isFound.username} has not done any hard hiking yet`)
        } else {
            let tempResult = [];
        this.listOfHikes.forEach(x => {
            if(x.difficultyLevel == 'hard') {
    tempResult.push(`${this.username}'s best hard hike is ${x.peak} peak, for ${x.time} hours`)
            }
        })
        tempResult.sort((a, b) => b.time - a.time)
        result.push(tempResult.pop())
        }
    } else if(criteria == 'easy') {
        let isFound = this.listOfHikes.some(y => y.difficultyLevel == 'easy')
        if(!isFound) {
            result.push(`${this.username} has not done any easy hiking yet`)
        } else {
            let tempResult = [];
        this.listOfHikes.forEach(y => {
            if(y.difficultyLevel == 'easy') {
    tempResult.push(`${this.username}'s best easy hike is ${y.peak} peak, for ${y.time} hours`)
            }
        })
        tempResult.sort((a, b) => b.time - a.time)
        result.push(tempResult.pop())
        }
    } else {
        result.push('All hiking records:')
        this.listOfHikes.forEach(x => {
            result.push(`${this.username} hiked ${x.peak} for ${x.time} hours`)
        })
    }
    return result.join('\n')
   }
}

// const user = new SmartHike('Vili');
// console.log(user.addGoal('Musala', 2925));
// console.log(user.addGoal('Rui', 1706));
// console.log(user.addGoal('Musala', 2925));

// const user = new SmartHike('Vili');
// console.log(user.addGoal('Musala', 2925));
// console.log(user.addGoal('Rui', 1706));
// console.log(user.hike('Musala', 8, 'hard'));
// console.log(user.hike('Rui', 3, 'easy'));
// console.log(user.hike('Everest', 12, 'hard'));

// const user = new SmartHike('Vili');
// console.log(user.addGoal('Musala', 2925));
// console.log(user.hike('Musala', 8, 'hard'));
// console.log(user.rest(4));
// console.log(user.rest(5));

const user = new SmartHike('Vili');
console.log(user.showRecord('all'));

// const user = new SmartHike('Vili');
user.addGoal('Musala', 2925);
user.hike('Musala', 8, 'hard');
console.log(user.showRecord('easy'));
user.addGoal('Vihren', 2914);
user.hike('Vihren', 4, 'hard');
console.log(user.showRecord('hard'));
user.addGoal('Rui', 1706);
user.hike('Rui', 3, 'easy');
console.log(user.showRecord('all'));

