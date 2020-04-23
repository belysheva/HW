import Vue from 'vue'
import Vuetify from 'vuetify'
import '@babel/polyfill'
import './api/resource'
import router from './router/router'
import App from './components/HelloWorld.vue'

Vue.use(Vuetify);
export default new Vuetify({})

new Vue({
    el: '#app',
    vuetify: new Vuetify(),
    router,
    render: a => a(App)
})