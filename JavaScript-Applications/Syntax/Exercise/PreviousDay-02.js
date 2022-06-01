function previousDay(year, month, day) {
    const date = new Date(year, month - 1, day);
    const resultDate = new Date();
    resultDate.setTime(date.getTime() - 1);
    // console.log(resultDate);
    console.log(resultDate.getFullYear() + `-` + Number(resultDate.getMonth() + 1) + `-` + resultDate.getDate());
}
previousDay(2016, 10, 1);