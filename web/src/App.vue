<template>
  <div id="app">
    <!--<img src="./assets/logo.png">-->
    <!--<header>-->
      <!--&lt;!&ndash;<router-link to="/home">home</router-link>&ndash;&gt;-->
      <!--&lt;!&ndash;<router-link to="/about">about</router-link>&ndash;&gt;-->
      <!--<router-link to="/login">login</router-link>-->
    <!--</header>-->

    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
