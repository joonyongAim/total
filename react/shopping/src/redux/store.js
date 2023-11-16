import { configureStore, createSlice } from "@reduxjs/toolkit";
import data from "../mockData";
import watched from "./watchedSlice";

const cart = createSlice({
  name : 'cart',
  initialState : [
    {
      id : 0,
      title : 'apple',
      count : 2
    },
    {
      id : 4,
      title : 'peach',
      count : 1
    }
  ], 
  reducers : {
    addCount(state, action) {
      let index = state.findIndex((data) => {
        return data.id === parseInt(action.payload);
      })

      state[index].count++;
    },

    subCount(state, action) {
      let index = state.findIndex((data) => {
        return data.id === parseInt(action.payload);
      })

      if(state[index].count > 0 ) {
        state[index].count--;
      }
    },
    addCart(state, action) {

      let index = state.findIndex((data) => {
        return data.id === parseInt(action.payload.id);
      })

      if(index === -1)
        state.push(action.payload);
      else
        state[index].count++;
    },
    removeCart(state, action) {
      let index = state.findIndex((data) => {
        return data.id === action.payload;
      })

      state.splice(index, 1);
    }
  }
})

export const {addCount, subCount, addCart, removeCart} = cart.actions;


export default configureStore({
  reducer : {
    cart : cart.reducer,
    watched : watched.reducer
  }
})