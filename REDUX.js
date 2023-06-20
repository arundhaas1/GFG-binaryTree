const redux = require("redux");
const reduxLogger=require("redux-logger")

const applyMiddleware=redux.applyMiddleware;
const logger=reduxLogger.createLogger();
const createStore = redux.createStore;


const buyCake=()=>{
    return(
        {
            type:"BUY_CAKE",
            info:"first redux action"
        }
    )
}

const initalState={
    noOfCakes:10
}

const reducer=(state=initalState,action)=>{
    switch(action.type){
        case "BUY_CAKE":
            return{
                ...state,
                noOfCakes:state.noOfCakes-1
            }
        
        default:
            return state
    }
}

const store=createStore(reducer,applyMiddleware(logger))

console.log(store.getState())
// const unsubscribe=store.subscribe(()=>console.log(store.getState()))
store.dispatch(buyCake())
store.dispatch(buyCake())
store.dispatch(buyCake())
// unsubscribe(); 
