// export const BASEURL = "http://localhost:2454/";
// export function callApi(reqmethod, url, data, responseHandler)
// {
//     let option = "";
//     if(reqmethod === "GET" || reqmethod === "DELETE")
//         option = {method: reqmethod, headers:{'Content-Type':'application/json'}};
//     else    
//         option = {method: reqmethod, headers:{'Content-Type':'application/json'}, body: data};
//     fetch(url, option)
//         .then(response => {
//             if(!response.ok)
//                 throw new Error(response.status + ": " + response.statusText);
//             return response.text();
//         })
//         .then(responsedata => responseHandler(responsedata))
//         .catch(error => alert(error));
// }

// export function setSession(sesName, sesValue, expDays)
// {
//     let D = new Date();
//     D.setTime(D.getTime() + expDays * 86400000);
//     document.cookie = `${sesName}=${sesValue};expires=${D.toUTCString()};path=/;secure`;
// }

// export function getSession(sesName)
// {
//     let decodedCookie = decodeURIComponent(document.cookie);
//     let cookieData = decodedCookie.split(";");
//     for(let x in cookieData)
//         if(cookieData[x].includes(sesName))
//             return cookieData[x].substring(cookieData[x].indexOf("=") + 1);
//     return "";
// }

export const BASEURL = "http://localhost:2454/";
export function callApi(reqmethod, url, data, responseHandler)
{
    let option = "";
    if(reqmethod === "GET" || reqmethod === "DELETE")
        option = {method: reqmethod, headers:{'Content-Type':'application/json'}};
    else    
        option = {method: reqmethod, headers:{'Content-Type':'application/json'}, body: data};
    fetch(url, option)
        .then(response => {
            if(!response.ok)
                throw new Error(response.status + ": " + response.statusText);
            return response.text();
        })
        .then(responsedata => responseHandler(responsedata))
        .catch(error => alert(error));
}

export function setSession(sesName, sesValue, expDays)
{
    let D = new Date();
    D.setTime(D.getTime() + expDays * 86400000);
    document.cookie = `${sesName}=${sesValue};expires=${D.toUTCString()};path=/;secure`;
}

export function getSession(sesName)
{
    let decodedCookie = decodeURIComponent(document.cookie);
    let cookieData = decodedCookie.split(";");
    for(let x in cookieData)
        if(cookieData[x].includes(sesName))
            return cookieData[x].substring(cookieData[x].indexOf("=") + 1);
    return "";
}
// export const BASEURL = "http://51.20.70.34:8080/Jobportal/";
// export function callApi(reqmethod, url, data, responseHandler)
// {
//     let option = "";
//     if(reqmethod === "GET" || reqmethod === "DELETE")
//         option = {method: reqmethod, headers:{'Content-Type':'application/json'}};
//     else    
//         option = {method: reqmethod, headers:{'Content-Type':'application/json'}, body: data};
//     fetch(url, option)
//         .then(response => {
//             if(!response.ok)
//                 throw new Error(response.status + ": " + response.statusText);
//             return response.text();
//         })
//         .then(responsedata => responseHandler(responsedata))
//         .catch(error => alert(error));
// }

// export function setSession(sesName, sesValue, expDays)
// {
//     let D = new Date();
//     D.setTime(D.getTime() + expDays * 86400000);
//     document.cookie = `${sesName}=${sesValue};expires=${D.toUTCString()};path=/`;
// }

// export function getSession(sesName)
// {
//     let decodedCookie = decodeURIComponent(document.cookie);
//     let cookieData = decodedCookie.split(";");
//     for(let x in cookieData)
//         if(cookieData[x].includes(sesName))
//             return cookieData[x].substring(cookieData[x].indexOf("=") + 1);
//     return "";
// }
