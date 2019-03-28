<template>
    <div>
      <h1>about</h1>
      <p>{{msg}}</p>
    </div>
</template>

<script>
    export default {
        name: "about",
        data(){
          return{
            msg: '我是about组件'
          }
        }
    }
</script>

<style scoped>

</style>
