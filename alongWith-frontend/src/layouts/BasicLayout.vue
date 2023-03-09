<template>
  <van-nav-bar
      title="标题"
      left-arrow="True"
      fixed="True"
      placeholder="True"
      @click-left="onClickLeft"
      @click-right="onClickRight"
  >
    <template #right>
      <van-icon name="search" size="18"/>
    </template>
  </van-nav-bar>

  <div id="content">
    <router-view></router-view>
    <!--    <template v-if="active==='Index'">-->
    <!--      <index/>-->
    <!--    </template>-->

    <!--    <template v-if="active==='Loose'">-->
    <!--      <loose/>-->
    <!--    </template>-->

    <!--    <template v-if="active==='Me'">-->
    <!--      <me/>-->
    <!--    </template>-->
  </div>


  <router-link to="/">Go to Home</router-link>
  <router-link to="/Loose">Go to About</router-link>

  <van-tabbar v-model="active" @change="onChange" placeholder="True">
    <van-tabbar-item icon="home-o" name="index">主页</van-tabbar-item>
    <van-tabbar-item icon="search" name="loose">活动</van-tabbar-item>
    <van-tabbar-item icon="setting-o" name="me">我</van-tabbar-item>
  </van-tabbar>

</template>

<script setup>

import {ref} from "@vue/reactivity";
import {Toast} from "vant";

import Index from "../pages/Index.vue";



const onClickLeft = () => alert("返回");
const onClickRight = () => alert("搜索");

const active = ref("Index");
const onChange = (Index) => Toast('标签${Index}');

</script>

<style scoped>

</style>