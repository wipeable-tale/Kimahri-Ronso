import React, {FC} from 'react';
import './App.css';
import {BrowserRouter, Switch, Route} from 'react-router-dom'
import CreatePosts from './features/create-posts/CreatePosts';
import EditPosts from './features/edit-posts/EditPosts';
import SelectPosts from './features/select-posts/SelectPosts';



// ルーティングの実装
export default function App(){
  return (
    <BrowserRouter>
      <Switch>
      <Route exact path="/">
          <SelectPosts />
        </Route>
        <Route exact path="/posts/id/edit">
          <EditPosts />
        </Route>
        <Route exact path="/posts/id/create">
          <CreatePosts />
        </Route>
      </Switch>
    </BrowserRouter>
  )
}
