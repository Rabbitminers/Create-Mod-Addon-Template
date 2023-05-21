<template>
  <article class="site-wrapper">
    <banner-vue/>
    <router-view></router-view>
    <footer-vue/>
  </article>
</template>

<script lang="ts">
import BannerVue from '@/components/BannerVue.vue'
import FooterVue from './components/FooterVue.vue';

export default {
  components: {
    BannerVue,
    FooterVue
  }
}
</script>

<style lang="scss">
.site-wrapper {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}
</style>