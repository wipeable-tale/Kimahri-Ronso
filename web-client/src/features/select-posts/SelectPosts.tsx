import React from "react";
import axios from "axios";

const baseURL = "http://localhost:8080/posts"


export default function SelectPosts(){

    const[posts, setPosts] = React.useState(null);

    React.useEffect(() => {
        axios.get(baseURL).then((response) => {
            console.log(response)
            setPosts(response.data);
        });
    },[]);

    if(!posts) return null;

    return (
        <div>
            <h1>Select-Posts</h1>
        </div>
    )

};