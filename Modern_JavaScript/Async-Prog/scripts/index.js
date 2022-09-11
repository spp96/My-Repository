let movie_data=[
  {
      image:"https://igimages.gumlet.io/hindi/gallery/movies/mubarakan/mubarakan_poster.jpg?dpr=1.0&q=70&w=240",
      name:"Mubarakan",
      rating:4,
      date:"15-Jan"
  },
  {
      image:"https://1847884116.rsc.cdn77.org/hindi/gallery/movies/jaggajasoos/jagaajasoos_poster.jpg",
      name:"Jaggajasoos",
      rating:4.5,
      date:"1-Jun"
  },
  {
      image:"https://1847884116.rsc.cdn77.org/hindi/gallery/movies/dobaara/dobara_poster.jpg",
      name:"Dobara",
      rating:3.5,
      date:"20 Aug"
  },
  {
      image:"https://igimages.gumlet.io/hindi/gallery/movies/toilet-ekpremkatha/toilet_poster.jpg?dpr=1.0&q=70&w=240",
      name:"Toilet Ek Prem Katha",
      rating:5.0,
      date:"25-Feb"
  },
  {
      image:"https://igimages.gumlet.io/hindi/gallery/movies/raabta/raaabta_poster.jpg?dpr=1.0&q=70&w=240",
      name:"Rabta",
      rating:4.0,
      date:"15-March"
  },
  {
      image:"https://igimages.gumlet.io/hindi/gallery/movies/mom/mom_poster.jpg?dpr=1.0&q=70&w=240",
      name:"Maa",
      rating:4.3,
      date:"31 Oct"
  },
  {
      image:"https://igimages.gumlet.io/hindi/gallery/movies/begumjaan/begumm_poster.jpg?dpr=1.0&q=70&w=240",
      name:"Begam Jaan",
      rating:3.0,
      date:"15-April"
  },
  {
      image:"https://igimages.gumlet.io/hindi/gallery/movies/bahubali2/bahubali_poster.jpg?dpr=1.0&q=70&w=240",
      name:"Bahubali",
      rating:4.5,
      date:"15-Jan"
  },
  {
      image:"https://igimages.gumlet.io/hindi/gallery/movies/rangoon/rangoon_poster.jpg?dpr=1.0&q=70&w=240",
      name:"Rangoon",
      rating:2.0,
      date:"15-Nov"
  },

];
let i=0;

  let container= document.getElementById("slideshow")

  setInterval(function(){
      if (i===movie_data.length)
      {
          i=0;
      }
      let img=document.createElement("img");
      img.src=movie_data[i].image;
      container.innerHTML=null;
      container.append(img);
      i++
  },3000)

  function apend(){
      document.querySelector("#movies").innerHTML=null;
      movie_data.forEach(function(el){
  
          let div=document.createElement("div");
  
          let image=document.createElement("img");
          image.src=el.image;
          let name=document.createElement("h2");
          name.innerText=el.name;
          let rating=document.createElement("p");
          rating.innerText=`IMDb:-${el.rating}` ;
          rating.setAttribute("class","rating")
          let date=document.createElement("p");
          date.innerText=`Release Date:-${el.date}`;
          date.setAttribute("class","date")
  
          div.append(image,name,rating,date)
          document.querySelector("#movies").append(div);
      })
  }
  
  apend()

      document.querySelector("#sort-lh").addEventListener("click", low_high);

      function low_high() {
      movie_data.sort(function (a, b) {
          return a.rating - b.rating;
      });
      apend(movie_data);
      }
      document.querySelector("#sort-hl").addEventListener("click", high_low);
      function high_low() {
      movie_data.sort(function (a, b) {
          return b.rating - a.rating;
      });
      apend(movie_data);
      }
  



