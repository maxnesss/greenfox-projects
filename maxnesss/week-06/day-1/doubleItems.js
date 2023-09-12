let items = ["Gin","Whiskey","Vodka"];

function doubleItems(items) {
    

    for (let i = 0; i < items.length; i++) {
        items[i] = items[i] + items[i];
        
    }
    return items;
  }


console.log(doubleItems(items));  