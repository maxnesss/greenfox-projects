

let headlines = [];



let data = fetch("https://api.nytimes.com/svc/search/v2/articlesearch.json?q=moon%20landing%20apollo%2011&api-key=GeCT1ifqAd5ntSAbRLn5sGPHXAZxRYgf")
    .then(response => response.json())
    .then(data => data.response.docs.forEach(p=>
    {
        let head = {};
        head["headline"]= p.headline.main;
        head["published_date"] = p.pub_date;
        head["URL"] = p.web_url;

        headlines.push(head);
        // console.log(headlines);
        // console.log(p);

    })).then(()=>console.log(headlines)).catch(error => {
        console.error('Error:', error);
    });


// for (let i = 0; i < 5; i++) {
//     let headlines = data[i] => data[i].headline;
// }
