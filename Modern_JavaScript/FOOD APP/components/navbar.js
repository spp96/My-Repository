// Export ------> Giving :- watch etc
// Import ------> Taking :- anything

let navbar = () => {
  return `
    <h3 id = "home">
        <a href="index.html">Home</a>
    </h3>
    <input oninput="getdata()" type="text" name="" id="query">
    <h3>
        <a href="ReceipeName.html">ReceipeName</a>
    </h3>
    <h3>
        <a href="getReceipe.html">
        getReceipe
        </a>
    </h3>
    <h3>
        <a href="randomReceipe.html">
        randomReceipe
        </a>
    </h3>
    <h3>
        <a href="/signup.html">
        Signup
        </a>
    </h3>
    <h3>
        <a href="login.html">
        Login
        </a>
    </h3>`;
};

// Default export -- 1 components
export default navbar;
